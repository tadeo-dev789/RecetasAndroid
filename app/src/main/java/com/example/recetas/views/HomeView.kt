package com.example.recetas.views

import android.annotation.SuppressLint
import androidx.annotation.ContentView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.ejemplo1.components.TitleBar
import com.example.ejemplo1.views.MainButton
import com.example.recetas.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(){
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
        com.example.recetas.views.ContentView()
    }

}


@Composable
private fun ContentView(){
    Column(
        modifier = Modifier.fillMaxSize().padding(top = 70.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SimpleImage(Id = R.drawable.albondigas, Desc = "Albondigas")
        MainButton("Albondigas",Color.Red,Color.White) {

        }
        SimpleImage(Id = R.drawable.lasagna,Desc = "Lasagna")
        MainButton("Lasagna",Color.Red,Color.White) {

        }
        SimpleImage(Id = R.drawable.ensalada,Desc = "Ensalada")
        MainButton("Ensalada",Color.Red,Color.White) {

        }
        SimpleImage(Id = R.drawable.pollonsalsa,Desc = "Pollo en salsa")
        MainButton("Pollo en salsa",Color.Red,Color.White) {

        }
    }
}
@Composable
fun SimpleImage(Id:Int,Desc:String) {
    Image(
        painter = painterResource(id = Id),
        contentDescription = Desc,
        modifier = Modifier.fillMaxWidth().padding(top=5.dp)
    )
}