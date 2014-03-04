package team.esprit.test;

import java.util.List;
import javax.swing.JTextField;
import javax.swing.text.*;

public class AutoCompleteTextFieldController extends JTextField {

    List dataList;
    boolean isCaseSensitive;
    boolean isStrict;

    AutoCompleteTextFieldController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    class AutoDocument extends PlainDocument {

        @Override
        public void replace(int i, int j, String s, AttributeSet attributeset)
                throws BadLocationException {
            super.remove(i, j);
            insertString(i, s, attributeset);
        }

        @Override
        public void insertString(int i, String s, AttributeSet attributeset)
                throws BadLocationException {
            if (s == null || "".equals(s)) {
                return;
            }
            String s1 = getText(0, i);
            String s2 = getMatch(s1 + s);
            int j = (i + s.length()) - 1;
            if (isStrict && s2 == null) {
                s2 = getMatch(s1);
                j--;
            } else if (!isStrict && s2 == null) {
                super.insertString(i, s, attributeset);
                return;
            }
            super.remove(0, getLength());
            super.insertString(0, s2, attributeset);
            setSelectionStart(j + 1);
            setSelectionEnd(getLength());
        }

        @Override
        public void remove(int i, int j) throws BadLocationException {
            int k = getSelectionStart();
            if (k > 0) {
                k--;
            }
            String s = getMatch(getText(0, k));
            if (!isStrict && s == null) {
                super.remove(i, j);
            } else {
                super.remove(0, getLength());
                super.insertString(0, s, null);
            }
            try {
                setSelectionStart(k);
                setSelectionEnd(getLength());
            } catch (Exception exception) {
            }
        }
    }

    public AutoCompleteTextFieldController(List list) {
        isCaseSensitive = false;
        isStrict = true;
        if (list == null) {
            throw new IllegalArgumentException("values can not be null");
        } else {
            dataList = list;
            init();
        }
    }

    private void init() {
        setDocument(new AutoDocument());
        if (isStrict && dataList.size() > 0) {
            setText(dataList.get(0).toString());
        }
    }

    private String getMatch(String s) {
        for (int i = 0; i < dataList.size(); i++) {
            String s1 = dataList.get(i).toString();
            if (s1 != null) {
                if (!isCaseSensitive
                        && s1.toLowerCase().startsWith(s.toLowerCase())) {
                    return s1;
                }
                if (isCaseSensitive && s1.startsWith(s)) {
                    return s1;
                }
            }
        }
        return null;
    }

    @Override
    public void replaceSelection(String s) {
        AutoDocument _lb = (AutoDocument) getDocument();
        if (_lb != null) {
            try {
                int i = Math.min(getCaret().getDot(), getCaret().getMark());
                int j = Math.max(getCaret().getDot(), getCaret().getMark());
                _lb.replace(i, j - i, s, null);
            } catch (Exception exception) {
            }
        }
    }

    public boolean isCaseSensitive() {
        return isCaseSensitive;
    }

    public void setCaseSensitive(boolean flag) {
        isCaseSensitive = flag;
    }

    public boolean isStrict() {
        return isStrict;
    }

    public void setStrict(boolean flag) {
        isStrict = flag;
    }

    public List getDataList() {
        return dataList;
    }

    public void setDataList(List list) {
        if (list == null) {
            throw new IllegalArgumentException("values can not be null");
        } else {
            dataList = list;
        }
    }
}