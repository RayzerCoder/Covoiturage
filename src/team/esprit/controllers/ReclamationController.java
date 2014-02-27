package team.esprit.controllers;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ReclamationController {

    public boolean repondreReclamation(String destinataire, String msg) {
        final String username = "covoiturage.1314.3a8@gmail.com";
        final String password = "admincovoiturage";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("covoiturage.1314.3a8@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinataire));
            message.setSubject("COVOITURAGE - Repondre réclamation");
            message.setText(msg);

            Transport.send(message);

            return true;

        } catch (MessagingException e) {
            return false;
        }
    }
}