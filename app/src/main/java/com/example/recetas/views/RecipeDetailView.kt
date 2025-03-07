package com.example.recetas.views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ejemplo1.components.TitleBar
import com.example.ejemplo1.views.MainButton
import com.example.ejemplo1.views.Spacers
import com.example.recetas.R
import java.net.URLDecoder
import java.nio.charset.StandardCharsets

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RecipeDetailView(navController: NavController, imageRes:Int, nomRec:String, description:String){
    val decodedDescription = URLDecoder.decode(description, StandardCharsets.UTF_8.toString())
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(name = nomRec) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    Color.Red)
            )
        }
    ){innerPadding->

        Box(modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()){
            Image(
                painter = painterResource(id = R.drawable.fondo),
                contentDescription = "Fondo de la pantalla",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .matchParentSize()
                    .alpha(0.5f)
            )

            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(16.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = nomRec,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .clip(RoundedCornerShape(10))
                        .border(5.dp,Color.Black, RoundedCornerShape(10))
                )

                Spacer(modifier = Modifier.padding(16.dp))

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                ) {
                    Text(
                        text = decodedDescription,
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(horizontal = 16.dp)
                            .background(Color.White, shape = RoundedCornerShape(12.dp))
                            .border(2.dp,Color.Black, RoundedCornerShape(12.dp))
                            .padding(start = 12.dp, top = 8.dp, bottom = 8.dp, end = 8.dp)

                    )
                }
                Spacer(modifier = Modifier.padding(16.dp))

                MainButton("Regresar", Color.Red, Color.White) {
                    navController.popBackStack()
                }
        }


        }

    }

}