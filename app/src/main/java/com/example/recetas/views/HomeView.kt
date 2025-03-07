package com.example.recetas.views

import android.annotation.SuppressLint
import androidx.annotation.ContentView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ejemplo1.components.TitleBar
import com.example.ejemplo1.views.MainButton
import com.example.ejemplo1.views.SimpleImage
import com.example.recetas.R
import androidx.compose.ui.layout.ContentScale


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(name = "Recetas") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Red
                )
            )
        }
    ) {
        Box(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.fondo),
                contentDescription = "Fondo de la pantalla",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .matchParentSize()
                    .alpha(0.5f)
            )
            com.example.recetas.views.ContentView(navController)
        }
    }

}


@Composable
private fun ContentView(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        SimpleImage(Id = R.drawable.albondigas, Desc = "Albondigas")
        MainButton("Albondigas",Color.Red,Color.White) {
            val imageRes = R.drawable.albondigas
            val nomRec = "Albondigas"
            val description = "Ingredientes \n\n" +
                    " 2 Tazas de Puré de tomate \n" +
                    " 1 Chile chipotle \n" +
                    " 3 Tazas de Agua \n" +
                    " 2 Cubos de Concentrado de Tomate con Pollo \n" +
                    " 1 Cucharada de Aceite de maíz \n" +
                    " 800 Gramos Carne de res molida \n" +
                    " 100 Gramos de Tocino picado y frito \n" +
                    " 1 Huevo \n" +
                    " 2 Cucharadas de Jugo Maggi \n" +
                    " 1 Cucharada de Salsa Tipo Inglesa \n" +
                    " 2 Cucharadas de Cebolla finamente picada \n" +
                    "\n" +
                    "Como hacer Albondigas \n" +
                    "\n" +
                    " 1.Para la salsa, licúa el puré de tomate, el chile, el agua y el Concentrado de Tomate con Pollo. Calienta el aceite en una olla y cocina la salsa a fuego medio por 10 minutos. \n" +
                    "\n" +
                    " 2.Para las albóndigas, mezcla la carne con el tocino, la cebolla, el huevo, el Jugo maggi y la Salsa Tipo Inglesa. Forma las albóndigas, colócalas en la salsa, tapa y cocina por 20 minutos a fuego medio o hasta que estén cocidas. \n" +
                    "\n" +
                    " 3.Sirve las albóndigas en un plato y ofrece."
            val encodedDescription = java.net.URLEncoder.encode(description, "UTF-8")

            navController.navigate("detalle/$imageRes/$nomRec/$encodedDescription")
        }
        SimpleImage(Id = R.drawable.lasagna,Desc = "Lasagna")
        MainButton("Lasaña",Color.Red,Color.White) {
            val imageRes = R.drawable.lasagna
            val nomRec = "Lasaña"
            val description = "\n" +
                    "Ingredientes \n\n" +
                    "\n" +
                    " 10 Jitomates cortados en cuartos \n" +
                    " 3 Cucharadas de aceite de oliva \n" +
                    " 1/4 De pieza de cebolla cortada en trozos \n" +
                    " 2 Dientes de Ajo \n" +
                    " 1 Cubo de Concentrado de Tomate con Pollo \n" +
                    " 1/2 Cucharadita de sal con cebolla en polvo \n" +
                    " 1 Taza de agua \n" +
                    " 1 1/2 Cucharadas de finas hierbas \n" +
                    " 1/4 De cucharadita de pimienta negra molida \n" +
                    " 2 Cucharadas de aceite vegetal \n" +
                    " 1 Cucharada de cebolla picada finamente \n" +
                    " 1 Cucharadita de ajo picado finamente \n" +
                    " 600 Gramos de carne molida de res \n" +
                    " 1 Cucharada de sal con cebolla en polvo \n" +
                    " 1 Cucharada de Jugo MAGGI® \n" +
                    " 3 Cucharadas de Salsa Tipo Inglesa \n" +
                    " 250 Gramos de champiñones rebanados \n" +
                    " 9 Láminas de pasta para lasaña precocida \n" +
                    " 200 Gramos de queso tipo manchego \n" +
                    "\n" +
                    "Como hacer la lasaña \n" +
                    "\n" +
                    " 1.Horno precalentado a 200 °C \n" +
                    "\n" +
                    " 2.Para la salsa, coloca los jitomates en una charola con el aceite de oliva, la cebolla y el ajo; hornea a 200 °C de 45 a 50 minutos o hasta que estén dorados. Licúa los jitomates, la cebolla y los ajos rostizados con el Concentrado de Tomate con Pollo la sal con cebolla, el agua, las hierbas finas y la pimienta. \n" +
                    "\n" +
                    " 3.Para el relleno, calienta el aceite y fríe la cebolla con el ajo hasta que cambien de color, añade la carne, la sal con cebolla, el Jugo Maggi, la Salsa Tipo Inglesa y los champiñones; mezcla y cocina hasta que la carne esté cocida.\n" +
                    " \n" +
                    " 4.En un refractario engrasado con un poco de aceite, coloca una cucharada de salsa, una capa de láminas de lasaña precocida, una de relleno, una de salsa y queso rallado; repite el procedimiento hasta terminar con todos los ingredientes. Por último, termina con una capa de queso tipo manchego. Hornea a 200 °C de 20 a 25 minutos.\n."

            val encodedDescription = java.net.URLEncoder.encode(description, "UTF-8")

            navController.navigate("detalle/$imageRes/$nomRec/$encodedDescription")

        }
        SimpleImage(Id = R.drawable.ensalada,Desc = "Ensalada")
        MainButton("Ensalada",Color.Red,Color.White) {

            val imageRes = R.drawable.ensalada
            val nomRec = "Ensalada"
            val description = "Ingredientes \n\n" +
                    "\n" +
                    " 1 Lata Media Crema Reducida en Grasa* \n" +
                    " 1/2 Paquete Queso crema light \n" +
                    " 1 Lata Granos de elote amarillo enlatado escurridos (200 g) \n" +
                    " 1 Pieza Lechuga escarola desinfectada y cortada \n" +
                    " 400 Gramos Pechuga de pollo cocida y deshebrada \n" +
                    " 1 1/2 Cucharaditas Sal con cebolla en polvo \n" +
                    "\n" +
                    "Como hacer ensalada de pollo y lechuga con elote \n" +
                    "\n" +
                    " 1.Para el aderezo, licúa la Media Crema Reducida en Grasa con el queso crema y sal con cebolla. \n" +
                    " 2.En un recipiente mezcla el pollo deshebrado, los granos de elote, la lechuga y el aderezo. \n" +
                    " 3.Ofrece."
            val encodedDescription = java.net.URLEncoder.encode(description, "UTF-8")

            navController.navigate("detalle/$imageRes/$nomRec/$encodedDescription")

        }
        SimpleImage(Id = R.drawable.pollonsalsa,Desc = "Pollo en salsa")
        MainButton("Pollo en salsa",Color.Red,Color.White) {
            val imageRes = R.drawable.pollonsalsa
            val nomRec = "Pollo en salsa agridulce"
            val description = "Ingredientes \n\n" +
                    " 1/2 Taza de Salsa de Soya MaggiⓇ \n" +
                    " 1/2 Taza de jugo de limón \n" +
                    " 1/2 Taza de miel de abeja \n" +
                    " 1 Cucharadita de fécula de maíz, disuelta en ¼ taza de agua \n" +
                    " 1/2 Cucharadita de ajo en polvo \n" +
                    " 1 Cucharadita de cebolla en polvo \n" +
                    " 1 Cucharadita de pimienta blanca, molida \n" +
                    " 800 Gramos de pechuga de pollo, sin piel y cortada en cubos \n" +
                    " 2 Tazas de arroz blanco, cocido \n" +
                    " 4 Ramas de cebollín picado finamente \n" +
                    " 1 Cucharadita de ajonjolí, tostado \n\n" +
                    "Como hacer el Pollo en Salsa Agridulce con Arroz \n" +
                    " 1.Para la marinada, mezcla hasta integrar la Salsa de Soya Maggi®, el jugo de limón, la miel, la fécula de maíz, el ajo en polvo, la cebolla en polvo y la pimienta blanca. Reserva media taza de marinada. \n" +
                    " 2.Marina el pollo con el resto de la salsa agridulce, refrigera durante 30 minutos. \n" +
                    " 3.Asa el pollo en una sartén con grill hasta que se cocine y dore ligeramente. Sirve sobre el arroz; decora con cebollín y ajonjolí. Ofrece al momento."
            val encodedDescription = java.net.URLEncoder.encode(description, "UTF-8")

            navController.navigate("detalle/$imageRes/$nomRec/$encodedDescription")
        }
    }
}
