package com.example.ejemplo1.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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

@Composable
fun SimpleImage(Id: Int, Desc: String) {
    Image(
        painter = painterResource(id = Id),
        contentDescription = Desc,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(200.dp)
            .clip(RoundedCornerShape(10))
            .border(5.dp,Color.Black, RoundedCornerShape(10))
    )
}
