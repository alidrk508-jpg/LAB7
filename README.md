# StarsGallery - Application Android

StarsGallery est une application Android moderne permettant de consulter, rechercher et évaluer une liste de célébrités. Le projet met en œuvre les composants fondamentaux du développement Android avec une architecture propre et réactive.
## 🎬 Demo

🚀 Découvrez le projet en action — cliquez sur l'image pour voir la démo vidéo !

[![Watch the video](https://img.youtube.com/vi/GWylRnAKETg/0.jpg)](https://www.youtube.com/watch?v=GWylRnAKETg)
## 🚀 Fonctionnalités

- **Écran d'accueil (Splash Screen)** : Une animation fluide de bienvenue (rotation, échelle, translation) avec une transition élégante vers l'écran principal.
- **Liste Dynamique (RecyclerView)** : Affichage d'une liste verticale de stars avec photos circulaires et notes.
- **Filtrage en Temps Réel** : Une barre de recherche (`SearchView`) intégrée à la Toolbar pour retrouver instantanément un acteur ou une actrice.
- **Partage Social** : Bouton de partage permettant d'envoyer les informations de l'application via WhatsApp, Gmail, etc.
- **Évaluation Interactive (Popup)** : Possibilité de modifier la note d'une star en cliquant sur l'élément de la liste, ouvrant un popup personnalisé avec une `RatingBar`.
- **Mise à jour Dynamique** : Actualisation immédiate de l'interface graphique après chaque modification de donnée.

## 🏗️ Architecture (MVC)

L'application suit le modèle **Modèle-Vue-Contrôleur (MVC)** pour une meilleure maintenance et réutilisation du code :

- **Modèle (Beans)** : Classe `Star` définissant les attributs (id, nom, image, note).
- **Service (DAO)** : Interface `IDao` et classe `StarService` pour la gestion des données (CRUD).
- **Vue (Layouts/Adapter)** : Fichiers XML (`star_item`, `star_edit_item`) et `StarAdapter` pour le rendu visuel.
- **Contrôleur (UI)** : `ListActivity` et `SplashActivity` pour la logique de navigation et d'interaction.

## 🛠️ Technologies & Librairies

- **Glide** : Pour le chargement fluide des images depuis des URLs.
- **CircleImageView** : Pour l'affichage élégant des photos de stars en format circulaire.
- **AndroidX & Material Design** : Pour une interface utilisateur moderne et conforme aux standards de Google.
- **Java/Kotlin** : Développé avec le SDK Android 15 (API 35/36).



---
*Projet réalisé dans le cadre de l'apprentissage des composants avancés Android.*
