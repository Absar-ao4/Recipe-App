🍽️ Recipe App

A modern Android application built with Jetpack Compose, MVVM architecture, and Kotlin, designed to help users discover and explore various recipe categories with a clean and intuitive UI.

✨ Features

    -> MVVM Architecture: Utilizes ViewModel and State for efficient state management.

    -> Jetpack Compose: Entirely built using Jetpack Compose for a declarative UI approach.

    -> TheMealDB API Integration: Fetches data from TheMealDB API to display recipe categories.

    -> Image Loading with Coil: Efficient image loading using the Coil library.

    -> Navigation Component: Seamless navigation between screens using Navigation Compose.

    -> Loading and Error Handling: Displays loading indicators and handles error states gracefully.

    -> Responsive Grid Layout: Presents recipe categories in a responsive grid layout.

    -> Detailed Category View: Navigate to detailed views of each recipe category.


🛠️ Tech Stack
Layer	Library / Tool

-> UI	Jetpack Compose

-> Architecture	MVVM + ViewModel

-> Networking	Retrofit

-> Image Loader	Coil

-> Navigation	Navigation Compose

-> Language	Kotlin


📁 Project Structure

com.absar.recipeapp

├── ui.theme/             # Compose theme files

├── MainActivity.kt       # Entry point of the application

├── RecipeScreen.kt       # Main screen displaying recipe categories

├── MainViewModel.kt      # ViewModel handling data logic

├── Category.kt           # Data model for recipe categories

├── RecipeApp.kt         # Navigation setup between screens

└── DetailScreen.kt       # Screen showing detailed view of a category


🚀 Getting Started

To build and run the app locally:

    Clone the repository

    git clone https://github.com/Absar-ao4/Recipe-App.git

    Open the project in Android Studio

    Build and run on an emulator or physical device


Made with ❤️ by Absar
