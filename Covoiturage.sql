-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.27-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema covoiturage
--

CREATE DATABASE IF NOT EXISTS covoiturage;
USE covoiturage;

--
-- Definition of table `administrateurs`
--

DROP TABLE IF EXISTS `administrateurs`;
CREATE TABLE `administrateurs` (
  `id` int(11) NOT NULL auto_increment,
  `email` varchar(100) default NULL,
  `mdp` varchar(45) default NULL,
  `nom` varchar(100) default NULL,
  `prenom` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `administrateurs`
--

/*!40000 ALTER TABLE `administrateurs` DISABLE KEYS */;
INSERT INTO `administrateurs` (`id`,`email`,`mdp`,`nom`,`prenom`) VALUES 
 (1,'covoiturage.1314.3a8@esprit.tn','admincovoiturage','Admin','Covoiturage');
/*!40000 ALTER TABLE `administrateurs` ENABLE KEYS */;


--
-- Definition of table `covoiturages`
--

DROP TABLE IF EXISTS `covoiturages`;
CREATE TABLE `covoiturages` (
  `id` int(11) NOT NULL auto_increment,
  `titre` varchar(255) default NULL,
  `description` text,
  `id_ville_depart` int(11) default NULL,
  `id_ville_arrivee` int(11) default NULL,
  `id_createur` int(11) default NULL,
  `date_creation` timestamp NULL default CURRENT_TIMESTAMP,
  `date_miseajour` datetime default NULL,
  `date_depart` int(11) default NULL,
  `date_arrivee` int(11) default NULL,
  `nombre_places` int(11) default NULL,
  `fumeur` tinyint(1) default NULL,
  `reserver_femmes` tinyint(1) default NULL,
  PRIMARY KEY  (`id`),
  KEY `fk_id_ville_depart_covoiturages` (`id_ville_depart`),
  KEY `fk_id_ville_arrivee_covoiturages` (`id_ville_arrivee`),
  KEY `fk_id_createur_covoiturages` (`id_createur`),
  CONSTRAINT `fk_id_createur_covoiturages` FOREIGN KEY (`id_createur`) REFERENCES `covoitureurs` (`id`),
  CONSTRAINT `fk_id_ville_arrivee_covoiturages` FOREIGN KEY (`id_ville_arrivee`) REFERENCES `villes` (`id`),
  CONSTRAINT `fk_id_ville_depart_covoiturages` FOREIGN KEY (`id_ville_depart`) REFERENCES `villes` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `covoiturages`
--

/*!40000 ALTER TABLE `covoiturages` DISABLE KEYS */;
/*!40000 ALTER TABLE `covoiturages` ENABLE KEYS */;


--
-- Definition of table `covoitureurs`
--

DROP TABLE IF EXISTS `covoitureurs`;
CREATE TABLE `covoitureurs` (
  `id` int(11) NOT NULL auto_increment,
  `email` varchar(100) default NULL,
  `mdp` varchar(45) default NULL,
  `nom_utilisateur` varchar(100) default NULL,
  `nom` varchar(100) default NULL,
  `prenom` varchar(100) default NULL,
  `sexe` char(1) default NULL,
  `fumeur` tinyint(1) default NULL,
  `date_naissance` date default NULL,
  `date_enregistrement` timestamp NULL default CURRENT_TIMESTAMP,
  `note` int(11) default NULL,
  `etat` int(11) default NULL,
  `avatar` varchar(255) default NULL,
  `skype` varchar(100) default NULL,
  `facebook` varchar(255) default NULL,
  `date_derniere_visite` datetime default NULL,
  `cle_activation` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `covoitureurs`
--

/*!40000 ALTER TABLE `covoitureurs` DISABLE KEYS */;
INSERT INTO `covoitureurs` (`id`,`email`,`mdp`,`nom_utilisateur`,`nom`,`prenom`,`sexe`,`fumeur`,`date_naissance`,`date_enregistrement`,`note`,`etat`,`avatar`,`skype`,`facebook`,`date_derniere_visite`,`cle_activation`) VALUES 
 (1,'nizar.boussarsar@esprit.tn','test','nizar.boussarsar','Boussarsar','Nizar','H',1,'1991-02-16','2014-02-21 23:36:10',69,1,NULL,NULL,NULL,NULL,NULL),
 (2,'mohamedamine.trabelsi@esprit.tn','test','mohamedamine.trabelsi','Trabelsi','Mohamed Amine','H',1,'1991-07-28','2014-02-21 23:36:10',99,2,NULL,NULL,NULL,NULL,NULL),
 (3,'majdi.jeridi@esprit.tn','test','majdi.jeridi','Jeridi','Majdi','H',0,'1991-01-01','2013-01-01 00:00:00',150,3,NULL,NULL,NULL,NULL,NULL),
 (4,'hussein.hassayoun@esprit.tn','test','hussein.hassayoun','Houssein','Hassayoun','H',0,'2000-12-31','2012-01-01 00:00:00',0,0,NULL,NULL,NULL,NULL,NULL),
 (5,'mohamedfarouk.chedly@esprit.tn','test','mohamedfarouk.chedly','Chedly','Mohamed Farouk','H',0,'1991-02-25','2014-02-21 23:39:23',50,2,NULL,NULL,NULL,NULL,NULL),
 (6,'wejd.daghfous@esprit.tn','test','wejd.daghfous','Daghfous','Wejd','H',0,'1991-05-28','2012-05-09 00:00:00',100,1,NULL,NULL,NULL,NULL,NULL);
INSERT INTO `covoitureurs` (`id`,`email`,`mdp`,`nom_utilisateur`,`nom`,`prenom`,`sexe`,`fumeur`,`date_naissance`,`date_enregistrement`,`note`,`etat`,`avatar`,`skype`,`facebook`,`date_derniere_visite`,`cle_activation`) VALUES 
 (7,'test1','test','test1','test1','test1','F',0,NULL,'2014-02-21 23:41:19',14,0,NULL,NULL,NULL,NULL,NULL),
 (8,'test2','test','test2','test2','test2','F',1,NULL,'2014-02-21 23:41:40',111,3,NULL,NULL,NULL,NULL,NULL),
 (9,'test3','test','test3','test3','test3','F',0,'2014-12-12','2014-02-21 23:42:24',1,0,NULL,NULL,NULL,NULL,NULL),
 (10,'test4','test','test4','test4','test4','H',1,NULL,'2014-02-21 23:42:55',50,0,NULL,NULL,NULL,NULL,NULL),
 (11,'test5','test','test5','test5','test5','F',1,NULL,'2014-02-21 23:43:13',60,0,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `covoitureurs` ENABLE KEYS */;


--
-- Definition of table `detours`
--

DROP TABLE IF EXISTS `detours`;
CREATE TABLE `detours` (
  `id` int(11) NOT NULL auto_increment,
  `id_covoiturage` int(11) NOT NULL,
  `id_ville` int(11) NOT NULL,
  PRIMARY KEY  (`id`,`id_covoiturage`,`id_ville`),
  KEY `fk_id_covoiturage_detours` (`id_covoiturage`),
  KEY `fk_id_ville_detours` (`id_ville`),
  CONSTRAINT `fk_id_covoiturage_detours` FOREIGN KEY (`id_covoiturage`) REFERENCES `covoiturage` (`id`),
  CONSTRAINT `fk_id_ville_detours` FOREIGN KEY (`id_ville`) REFERENCES `villes` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `detours`
--

/*!40000 ALTER TABLE `detours` DISABLE KEYS */;
/*!40000 ALTER TABLE `detours` ENABLE KEYS */;


--
-- Definition of table `evaluations`
--

DROP TABLE IF EXISTS `evaluations`;
CREATE TABLE `evaluations` (
  `id` int(11) NOT NULL auto_increment,
  `message` varchar(255) default NULL,
  `note` int(11) default NULL,
  `id_covoiturage` int(11) default NULL,
  `id_evaluateur` int(11) default NULL,
  `date_evaluation` datetime default NULL,
  PRIMARY KEY  (`id`),
  KEY `fk_id_covoiturage` (`id_covoiturage`),
  KEY `fk_id_evaluateur` (`id_evaluateur`),
  CONSTRAINT `fk_id_covoiturage` FOREIGN KEY (`id_covoiturage`) REFERENCES `covoitureurs` (`id`),
  CONSTRAINT `fk_id_evaluateur` FOREIGN KEY (`id_evaluateur`) REFERENCES `covoitureurs` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `evaluations`
--

/*!40000 ALTER TABLE `evaluations` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluations` ENABLE KEYS */;


--
-- Definition of table `messages`
--

DROP TABLE IF EXISTS `messages`;
CREATE TABLE `messages` (
  `id` int(11) NOT NULL auto_increment,
  `id_expediteur` int(11) default NULL,
  `id_destinataire` int(11) default NULL,
  `object` varchar(100) default NULL,
  `contenu` text,
  `date_envoi` timestamp NULL default CURRENT_TIMESTAMP,
  `lus` tinyint(1) default NULL,
  PRIMARY KEY  (`id`),
  KEY `fk_id_expediteur_messages` (`id_expediteur`),
  KEY `fk_id_destinataire_messages` (`id_destinataire`),
  CONSTRAINT `fk_id_destinataire_messages` FOREIGN KEY (`id_destinataire`) REFERENCES `covoitureurs` (`id`),
  CONSTRAINT `fk_id_expediteur_messages` FOREIGN KEY (`id_expediteur`) REFERENCES `covoitureurs` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `messages`
--

/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;


--
-- Definition of table `notifications`
--

DROP TABLE IF EXISTS `notifications`;
CREATE TABLE `notifications` (
  `id` int(11) NOT NULL auto_increment,
  `id_expediteur` int(11) default NULL,
  `id_destinataire` int(11) default NULL,
  `date_creation` timestamp NULL default CURRENT_TIMESTAMP,
  `contenu` text,
  `type` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `fk_id_expediteur_notifications` (`id_expediteur`),
  KEY `fk_id_destinataire_notifications` (`id_destinataire`),
  CONSTRAINT `fk_id_destinataire_notifications` FOREIGN KEY (`id_destinataire`) REFERENCES `covoitureurs` (`id`),
  CONSTRAINT `fk_id_expediteur_notifications` FOREIGN KEY (`id_expediteur`) REFERENCES `covoitureurs` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `notifications`
--

/*!40000 ALTER TABLE `notifications` DISABLE KEYS */;
/*!40000 ALTER TABLE `notifications` ENABLE KEYS */;


--
-- Definition of table `participants`
--

DROP TABLE IF EXISTS `participants`;
CREATE TABLE `participants` (
  `id` int(11) NOT NULL auto_increment,
  `id_covoiturage` int(11) NOT NULL,
  `id_covoitureur` int(11) NOT NULL,
  `date_participation` timestamp NULL default CURRENT_TIMESTAMP,
  PRIMARY KEY  (`id`,`id_covoiturage`,`id_covoitureur`),
  KEY `fk_id_covoiturage_participants` (`id_covoiturage`),
  KEY `fk_id_covoitureur_participants` (`id_covoitureur`),
  CONSTRAINT `fk_id_covoiturage_participants` FOREIGN KEY (`id_covoiturage`) REFERENCES `covoiturages` (`id`),
  CONSTRAINT `fk_id_covoitureur_participants` FOREIGN KEY (`id_covoitureur`) REFERENCES `covoitureurs` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `participants`
--

/*!40000 ALTER TABLE `participants` DISABLE KEYS */;
/*!40000 ALTER TABLE `participants` ENABLE KEYS */;


--
-- Definition of table `reclamations`
--

DROP TABLE IF EXISTS `reclamations`;
CREATE TABLE `reclamations` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `nom_utilisateur` varchar(45) default NULL,
  `message` varchar(255) default NULL,
  `email` varchar(45) default NULL,
  `type` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `reclamations`
--

/*!40000 ALTER TABLE `reclamations` DISABLE KEYS */;
INSERT INTO `reclamations` (`id`,`nom_utilisateur`,`message`,`email`,`type`) VALUES 
 (1,'nizar.boussarsar','Ceci est une premiére réclamation concernant bla bla bla bla ','nizar.boussarsar@esprit.tn','Réclamation de type 1');
/*!40000 ALTER TABLE `reclamations` ENABLE KEYS */;


--
-- Definition of table `statistiques`
--

DROP TABLE IF EXISTS `statistiques`;
CREATE TABLE `statistiques` (
  `id` int(11) NOT NULL auto_increment,
  `nom` varchar(255) default NULL,
  `chemin` varchar(255) default NULL,
  `date_creation` timestamp NULL default CURRENT_TIMESTAMP,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `statistiques`
--

/*!40000 ALTER TABLE `statistiques` DISABLE KEYS */;
/*!40000 ALTER TABLE `statistiques` ENABLE KEYS */;


--
-- Definition of table `villes`
--

DROP TABLE IF EXISTS `villes`;
CREATE TABLE `villes` (
  `id` int(11) NOT NULL auto_increment,
  `latitude` float(10,6) default NULL,
  `longitude` float(10,6) default NULL,
  `nom` varchar(100) default NULL,
  `gouvernorat` varchar(100) default NULL,
  `code_postal` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `villes`
--

/*!40000 ALTER TABLE `villes` DISABLE KEYS */;
/*!40000 ALTER TABLE `villes` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
