# 🥗 Nutrition Doctor

> **Plateforme intelligente de gestion de cabinet nutritionnel avec analyse prédictive par Intelligence Artificielle**

[![Angular](https://img.shields.io/badge/Frontend-Angular-red?logo=angular)](https://angular.dev/)
[![Spring Boot](https://img.shields.io/badge/Backend-Spring%20Boot-6DB33F?logo=springboot)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/Database-PostgreSQL-4169E1?logo=postgresql)](https://www.postgresql.org/)
[![Python](https://img.shields.io/badge/AI-Python-3776AB?logo=python)](https://www.python.org/)
[![XGBoost](https://img.shields.io/badge/ML-XGBoost-orange)](https://xgboost.readthedocs.io/)
[![Docker](https://img.shields.io/badge/DevOps-Docker-2496ED?logo=docker)](https://www.docker.com/)
[![Azure](https://img.shields.io/badge/Cloud-Microsoft%20Azure-0078D4?logo=microsoftazure)](https://azure.microsoft.com/)
[![License](https://img.shields.io/badge/License-PFE-blue)]()

---

## 📑 Table des matières

- [Présentation](#-présentation)
- [Contexte et problématique](#-contexte-et-problématique)
- [Objectifs](#-objectifs)
- [Solution proposée](#-solution-proposée)
- [Fonctionnalités](#-fonctionnalités)
- [Acteurs du système](#-acteurs-du-système)
- [Architecture globale](#-architecture-globale)
- [Clean Architecture](#-clean-architecture)
- [Flux InBody](#-flux-inbody)
- [Intelligence Artificielle](#-intelligence-artificielle)
- [Flux du module Machine Learning](#-flux-du-module-machine-learning)
- [Sécurité](#-sécurité)
- [Méthodologie Scrum](#-méthodologie-scrum)
- [DevOps et CI/CD](#-devops-et-cicd)
- [Technologies](#-technologies)
- [Structure du projet](#-structure-du-projet)
- [Installation](#-installation)
- [Configuration](#-configuration)
- [Docker](#-docker)
- [API](#-api)
- [Interfaces](#-interfaces)
- [Équipe](#-équipe)
- [Perspectives](#-perspectives)
- [Conclusion](#-conclusion)

---

# 🥗 Présentation

**Nutrition Doctor** est une plateforme web intelligente destinée à la gestion complète d'un cabinet de nutrition.

Le projet vise à centraliser les différentes activités d'un cabinet :

- gestion des patients ;
- gestion des rendez-vous ;
- suivi de la composition corporelle ;
- import des données InBody ;
- consultations en ligne ;
- messagerie ;
- notifications ;
- gestion des documents ;
- gestion des abonnements ;
- tableaux de bord analytiques ;
- génération de rapports ;
- assistance intelligente ;
- prédiction de l'évolution de la composition corporelle.

L'objectif principal est de transformer les données nutritionnelles et corporelles brutes en informations exploitables par le nutritionniste.

---

# 🎯 Contexte et problématique

Dans les cabinets de nutrition, les données sont souvent dispersées entre :

- dossiers patients ;
- fichiers Excel/CSV ;
- appareils de mesure corporelle ;
- agendas ;
- outils de communication ;
- systèmes de paiement ;
- documents administratifs.

Cette fragmentation rend le suivi plus complexe et augmente le temps consacré aux tâches administratives.

Une problématique centrale du projet est donc :

> **Comment concevoir une plateforme capable de centraliser le fonctionnement d'un cabinet nutritionnel tout en transformant les données corporelles des patients en informations utiles à la prise de décision grâce à l'Intelligence Artificielle ?**

Nutrition Doctor répond à cette problématique en combinant :

```text
Gestion métier
      +
Données InBody
      +
Analyse statistique
      +
Machine Learning
      +
Tableaux de bord
      +
Infrastructure Cloud
🚀 Objectifs
Objectif général

Développer une plateforme numérique complète permettant aux cabinets de nutrition de gérer leurs activités tout en bénéficiant d'une assistance prédictive basée sur l'IA.

Objectifs spécifiques
👨‍⚕️ Gestion médicale
gérer les patients ;
consulter leurs dossiers ;
suivre leurs rendez-vous ;
suivre leur composition corporelle ;
analyser leur évolution.
📊 Analyse des données
importer les données InBody ;
historiser les mesures ;
visualiser les tendances ;
comparer les différentes mesures.
🤖 Intelligence Artificielle
prédire l'évolution de certaines métriques corporelles ;
fournir des intervalles d'incertitude ;
expliquer certaines prédictions ;
suivre les objectifs du patient.
💻 Digitalisation
centraliser les opérations du cabinet ;
permettre les consultations en ligne ;
proposer une messagerie ;
automatiser les notifications.
☁️ DevOps
conteneuriser l'application ;
automatiser les builds ;
automatiser le déploiement ;
utiliser les services Cloud Azure.
💡 Solution proposée

L'application est organisée autour de plusieurs modules :
👥 Acteurs du système

La plateforme distingue principalement quatre rôles :

Acteur	Responsabilités
👨‍⚕️ Nutritionniste	Patients, consultations, suivi, analyses, prédictions
👩‍💼 Secrétaire	Rendez-vous, patients, organisation du cabinet
🧑 Patient	Rendez-vous, mesures, objectifs, consultations
👨‍💻 Administrateur	Utilisateurs, sécurité, abonnements, administration
