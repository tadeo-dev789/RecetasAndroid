package com.example.ejemplo1.views

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TitleView(name:String){
    Text(text = "Home", fontSize = 30.sp, color = Color.Black)
}

@Composable
fun Spacers(){
    Spacer(modifier= Modifier.height(10.dp))
}

@Composable
fun MainButton(name:String,backColor: Color,color: Color,onClick:()->Unit){
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors(
        contentColor = color,
        containerColor = backColor
    )) {
        Text(text=name)
    }
}