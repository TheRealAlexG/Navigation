package com.example.navegaciollistas.ui.Pantalles

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.navegaciollistas.Dades.Bikes
import com.example.navegaciollistas.Dades.Cars
import com.example.navegaciollistas.R


@Composable
fun PantallaCar(idClass: String) {
    val Cars = Cars.CarsId(idClass)
    Text(text = idClass)

    if (Cars != null) {
        Column {

                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(Cars.foto)
                        .crossfade(true)
                        .build(),
                    placeholder = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = "Cars",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .clip(CircleShape)
                        .weight(1F)
                )
            Text(text = "\nMarca: ${Cars.marca} \n Serie:${Cars.serie} \n Color: ${Cars.color} \n HP: ${Cars.hp} \n ID:${Cars.id} \n ParMotor:${Cars.parmotor} ",
                modifier=Modifier
                    .weight(1F),
                style = MaterialTheme.typography.bodyMedium,
                fontWeight= FontWeight.Bold





            )




        }
    } else {
        Text(text = "sorry we didint find your bike")
    }
}