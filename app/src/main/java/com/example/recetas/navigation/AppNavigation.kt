package com.example.recetas.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recetas.R
import com.example.recetas.views.HomeView
import com.example.recetas.views.RecipeDetailView

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeView(navController) }
        composable("detalle/{imageRes}/{nomRec}/{description}") { backStackEntry ->
            val imageRes = backStackEntry.arguments?.getString("imageRes")?.toIntOrNull() ?: R.drawable.lasagna
            val nomRec = backStackEntry.arguments?.getString("nomRec") ?: "Receta"
            val description = backStackEntry.arguments?.getString("description") ?: "Sin descripción disponible."

            RecipeDetailView(navController, imageRes, nomRec, description)
        }
    }

}