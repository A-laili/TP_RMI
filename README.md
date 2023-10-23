# TP_RMI: Gestion des Salles et des Machines avec RMI, Hibernate et JAVA SWING 


Ce projet est conçu pour gérer des salles et des machines à l'aide d'une interface utilisateur graphique Swing. Il utilise Hibernate pour la couche de persistance et RMI (Remote Method Invocation) pour la communication client-serveur. Le projet est divisé en deux parties : le serveur RMI et le client RMI.

Pour la base de données, on a obtenu la conception suivante:
![image](https://github.com/A-laili/TP_RMI/assets/147451080/fd490b2b-23c8-498d-a547-f3cbfa0e1072)

Et pour les interface, on trouve: 

 ## Le Menu Main
![image](https://github.com/A-laili/TP_RMI/assets/147451080/cabec067-0a88-4c96-8baf-d3b5600446f3)


## L'interface de Gestion des Machines 
![image](https://github.com/A-laili/TP_RMI/assets/147451080/a1b184e0-428d-49f5-87fe-cad4be5fc1df)

 
 Après l'ajout d'une machine on a l'affichage du petit message suivant:
      
        ![image](https://github.com/A-laili/TP_RMI/assets/147451080/3b0ad3de-4bb9-4c7c-8f97-c8d4f3fdc6e2)

Du meme pour la suppression et la modification.


## L'interface de Gestion des Salles

![image](https://github.com/A-laili/TP_RMI/assets/147451080/f8669cd8-d602-4725-856f-83fd99998e11)

 Après l'ajout d'une Salle on a l'affichage du petit message suivant:
 
![image](https://github.com/A-laili/TP_RMI/assets/147451080/d1d3801b-cc73-442f-b298-ffdab0e85364)

 
Du meme pour la suppression et la modification.


Et finalement on a:

## L'interface de recherche des machines par salles
![image](https://github.com/A-laili/TP_RMI/assets/147451080/74f7790d-7021-4eaa-b3e3-8fbb7325ebd7)

# Technologies utilisées
Java
MySQL (pour la base de données)
Hibernate (pour la couche de persistance)
RMI (pour la communication client-serveur)

# Fonctionnalités du Projet

Opérations CRUD (Créer, Lire, Mettre à jour, Supprimer) pour les machines.
Opérations CRUD pour les salles.
Recherche des machines disponibles dans chaque salle.

# Structure du Projet
Le projet est divisé en deux parties :

# Projet ServerRMI

src/main/java/entities : Classes d'entité pour les machines et les salles.

src/main/java/util : Classe HibernateUtil pour gérer la SessionFactory.

src/main/java/service : Classes MachineService et RoomService pour les opérations de service.

src/main/java/config : Fichier hibernate.cfg.xml pour la configuration Hibernate.

src/main/java/dao : Interface IDao pour les opérations CRUD.

src/main/java/server : Classe Server pour démarrer le serveur RMI.

# Projet ClientRMI

src/main/java/entities : Classes d'entité pour les machines et les salles.

src/main/java/dao : Interface IDao pour les opérations CRUD.

src/main/java/config : Classe Config pour la configuration RMI (adresse IP et port).

src/main/resources : Fichier configuration.properties pour spécifier l'adresse IP et le port du serveur.

src/main/java/ui : Interface utilisateur graphique Swing pour la gestion des salles et des machines.


# Configuration Système
Java 8 ou +
Serveur MySQL
Hibernate
Connexion réseau pour la communication RMI

# Comment Exécuter le Projet

Clonez ce projet sur votre ordinateur.
Démarrez le serveur RMI à l'aide de la classe Server du projet ServerRMI.
Exécutez l'application Swing à l'aide de la classe principale du projet ClientRMI.
Utilisez l'interface graphique pour effectuer des opérations CRUD sur les machines et les salles.
Effectuez des recherches pour trouver des machines disponibles dans chaque salle.

Auteur
Asmaa Laili
Ce projet est destiné à la gestion des salles et des machines, en utilisant des technologies avancées en Java.


        

        



