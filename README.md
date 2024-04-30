# Gestion des Salles et des Machines avec RMI, Hibernate et JAVA SWING 

Ce projet vise à gérer des salles et des machines à l'aide d'une interface utilisateur graphique Swing. Il utilise Hibernate pour la couche de persistance et RMI (Remote Method Invocation) pour la communication client-serveur. Le projet est divisé en deux parties : le serveur RMI et le client RMI.

## Base de Données

La conception de la base de données est représentée comme suit:

![Diagramme de Base de Données](https://github.com/A-laili/TP_RMI/assets/147451080/fd490b2b-23c8-498d-a547-f3cbfa0e1072)

## Interface Graphique

### Menu Principal

![Menu Principal](https://github.com/A-laili/TP_RMI/assets/147451080/cabec067-0a88-4c96-8baf-d3b5600446f3)

### Gestion des Machines

![Gestion des Machines](https://github.com/A-laili/TP_RMI/assets/147451080/78221a81-53c6-4f2f-bbb3-6bd4ab035f20)

### Gestion des Salles

![Gestion des Salles](https://github.com/A-laili/TP_RMI/assets/147451080/f8669cd8-d602-4725-856f-83fd99998e11)

### Recherche des Machines par Salles

![Recherche des Machines par Salles](https://github.com/A-laili/TP_RMI/assets/147451080/74f7790d-7021-4eaa-b3e3-8fbb7325ebd7)

## Technologies Utilisées

- Java
- MySQL (pour la base de données)
- Hibernate (pour la couche de persistance)
- RMI (pour la communication client-serveur)

## Fonctionnalités du Projet

- Opérations CRUD (Créer, Lire, Mettre à jour, Supprimer) pour les machines.
- Opérations CRUD pour les salles.
- Recherche des machines disponibles dans chaque salle.

## Structure du Projet

### Projet ServerRMI

- `entities` : Classes d'entité pour les machines et les salles.
- `util` : Classe HibernateUtil pour gérer la SessionFactory.
- `service` : Classes MachineService et RoomService pour les opérations de service.
- `config` : Fichier hibernate.cfg.xml pour la configuration Hibernate.
- `dao` : Interface IDao pour les opérations CRUD.
- `server` : Classe Server pour démarrer le serveur RMI.

### Projet ClientRMI

- `entities` : Classes d'entité pour les machines et les salles.
- `dao` : Interface IDao pour les opérations CRUD.
- `config` : Classe Config pour la configuration RMI (adresse IP et port).
- `resources` : Fichier configuration.properties pour spécifier l'adresse IP et le port du serveur.
- `ui` : Interface utilisateur graphique Swing pour la gestion des salles et des machines.

## Configuration Système

- Java 8 ou supérieur
- Serveur MySQL
- Hibernate
- Connexion réseau pour la communication RMI

## Comment Exécuter le Projet

1. Clonez ce projet sur votre ordinateur.
2. Démarrez le serveur RMI à l'aide de la classe Server du projet ServerRMI.
3. Exécutez l'application Swing à l'aide de la classe principale du projet ClientRMI.
4. Utilisez l'interface graphique pour effectuer des opérations CRUD sur les machines et les salles.
5. Effectuez des recherches pour trouver des machines disponibles dans chaque salle.

## Auteur

Asmaa Laili

Ce projet est destiné à la gestion des salles et des machines, en utilisant des technologies avancées en Java.
