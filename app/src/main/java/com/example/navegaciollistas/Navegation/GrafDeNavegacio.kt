package com.example.navegaciollistas.Navegation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navegaciollistas.Dades.Cars
import com.example.navegaciollistas.ui.Pantalles.PantallaBike
import com.example.navegaciollistas.ui.Pantalles.PantallaCar
import com.example.navegaciollistas.ui.Pantalles.PantallaCrypto
import com.example.navegaciollistas.ui.Pantalles.PantallaLlistaDeBikes
import com.example.navegaciollistas.ui.Pantalles.PantallaLlistaDeCars
import com.example.navegaciollistas.ui.Pantalles.PantallaLlistaDeCrypto
import com.example.navegaciollistas.ui.Pantalles.PantallaPrincipal



@Composable
fun GrafDeNavegacio(){

    val controladorDeNavegacio = rememberNavController()
    NavHost(navController = controladorDeNavegacio , startDestination =Destinacio.Principal.rutaGenerica )
    {

        composable(

            route = Destinacio.Principal.rutaGenerica
        ){

            PantallaPrincipal(
                onLlistaDeCarsClick = {titol:String ->
                    Log.d("XEVI",Destinacio.LlistaDeCars.rutaGenerica)
                    Log.d("XEVI",Destinacio.LlistaDeCars.creaRutaEspecifica("ALGO"))
                    controladorDeNavegacio.navigate(Destinacio.LlistaDeCars.creaRutaEspecifica(titol))
                    },
                onLlistaDeBikesClick ={titol:String ->
                    controladorDeNavegacio.navigate(Destinacio.LlistaDeBikes.creaRutaEspecifica(titol))},
                onLlistadeCryptosClick ={titol:String ->
                    controladorDeNavegacio.navigate(Destinacio.LlistaDeCrypto.creaRutaEspecifica(titol))
                }
            )
        }

        composable(
            route = Destinacio.LlistaDeCars.rutaGenerica,
            arguments = Destinacio.LlistaDeCars.NavArgs)
        {

            val titol=it.arguments?.getString(ArgumentDeNavegacio.Titol.clau)
            requireNotNull(titol,{"El titol no pot ser null"})

            PantallaLlistaDeCars(titol,
                onNavigateCars={
                        id-> controladorDeNavegacio.navigate(
                    Destinacio.idCars.creaRutaEspecifica(id))})


        }

        composable(
            route = Destinacio.LlistaDeBikes.rutaGenerica,
            arguments = Destinacio.LlistaDeBikes.NavArgs)
        {

            val titol=it.arguments?.getString(ArgumentDeNavegacio.Titol.clau)
            requireNotNull(titol,{"El titol no pot ser null"})

            PantallaLlistaDeBikes(titol,onNavigateBikes={id->controladorDeNavegacio.navigate(
                Destinacio.idBikes.creaRutaEspecifica(id)
            )})

        }


        composable(
            route = Destinacio.LlistaDeCrypto.rutaGenerica,
            arguments = Destinacio.LlistaDeCrypto.NavArgs
        ){

            val titol=it.arguments?.getString(ArgumentDeNavegacio.Titol.clau)
            requireNotNull(titol,{"El titol no pot ser null"})

            PantallaLlistaDeCrypto(titol,onNavigateCrypto={id->controladorDeNavegacio.navigate(
                Destinacio.idCrypto.creaRutaEspecifica(id)
            )})

        }

        composable(route = Destinacio.idCars.rutaGenerica,
            arguments = Destinacio.idCars.NavArgs) {
            val id = it.arguments?.getString("id")
            requireNotNull(id)
            PantallaCar(id)

    }

        composable(route = Destinacio.idBikes.rutaGenerica,
            arguments = Destinacio.idBikes.NavArgs) {
            val id = it.arguments?.getString("id")
            requireNotNull(id)
            PantallaBike(id)

        }

        composable(route = Destinacio.idCrypto.rutaGenerica,
            arguments = Destinacio.idCrypto.NavArgs) {
            val id = it.arguments?.getString("id")
            requireNotNull(id)
            PantallaCrypto(id)

        }


}
}


