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
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.navegaciollistas.Dades.Cars
import com.example.navegaciollistas.Dades.Crypto
import com.example.navegaciollistas.Dades.Cryptos
import com.example.navegaciollistas.R


@Composable
fun PantallaCrypto(idClass: String) {
    val Cryptos = Cryptos.CryptoId(idClass)
    Text(text = idClass)

    if (Cryptos != null) {
        Column {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(Cryptos.foto)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Crypto",
                contentScale = ContentScale.Fit,
                modifier = Modifier.clip(CircleShape)
            )



            Text(text = "\nMarca: ${Cryptos.marca}  \n ID: ${Cryptos.id} \n Color: ${Cryptos.color} \n Valor: ${Cryptos.valor}",
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