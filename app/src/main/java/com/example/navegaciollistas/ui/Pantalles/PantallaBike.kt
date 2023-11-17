package com.example.navegaciollistas.ui.Pantalles

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.navegaciollistas.Dades.Bikes
import com.example.navegaciollistas.R


@Composable
fun PantallaBike(idClass: String) {
    val bikes = Bikes.Bikesid(idClass)
    Text(text = idClass)

    if (bikes != null) {
        Column {

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(bikes.foto)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Bikes",
                contentScale = ContentScale.Fit,
                modifier = Modifier.clip(CircleShape)
            )


            Text(text = "Marca: ${bikes.marca}  \n Serie:${bikes.serie} \n Color: ${bikes.color} \n HP: ${bikes.hp} \n ID:${bikes.id}\n ParMotor:${bikes.parmotor} ",

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