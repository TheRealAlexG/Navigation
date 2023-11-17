package com.example.navegaciollistas.ui.Pantalles

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaPrincipal(onLlistaDeCarsClick:(String)->Unit,
                      onLlistaDeBikesClick:(String)->Unit,
                      onLlistadeCryptosClick:(String)->Unit)
{
    Scaffold (
        topBar = {
            TopAppBar(
                colors=TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor=MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(text = "Menu Principal")
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector= Icons.Default.Home,
                            contentDescription="Pantalla Principal"
                        )

                    }
                }
            )
    },
    ){
        Column ( modifier= Modifier
            .background(Color.Yellow)
            .padding(it)
            .fillMaxSize()
            .padding(24.dp),
            verticalArrangement=Arrangement.Center){
            
            Button(onClick = {onLlistaDeCarsClick("LlistaDeCars")
            },
                modifier=Modifier
                    .fillMaxWidth()
                ) {
                Text(text = "SuperCars List",
                    style = MaterialTheme.typography.headlineLarge)

            }

            Spacer(modifier = Modifier.height(24.dp))

            Button(onClick = {onLlistadeCryptosClick("Cryptos")

            },
                modifier=Modifier
                    .fillMaxWidth()
            ) {
                Text(text = "Crypto List",
                    style = MaterialTheme.typography.headlineLarge)

            }
            Spacer(modifier = Modifier.height(24.dp))

            Button(onClick = { onLlistaDeBikesClick("Bikes")

            },
                modifier=Modifier
                    .fillMaxWidth()
            ) {
                Text(text = "Bikes List",
                    style = MaterialTheme.typography.headlineLarge)

            }


        }
        

    }


}