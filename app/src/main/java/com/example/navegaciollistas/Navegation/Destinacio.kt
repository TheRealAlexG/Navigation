package com.example.navegaciollistas.Navegation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class Destinacio (
    val rutaBase:String,
    val argumentsDeNavegacio:List<ArgumentDeNavegacio> = emptyList()
){
    val rutaGenerica= run {
        val claus=argumentsDeNavegacio.map { "{${it.clau}}"}
        listOf(rutaBase)
            .plus(claus)
            .joinToString ("/" )

    }

    val NavArgs=argumentsDeNavegacio.map { it.toNavArgument()}

    //Destinacions

    object Principal:Destinacio( "Principal")
    object LlistaDeCars:Destinacio("LlistaDeCars", listOf(ArgumentDeNavegacio.Titol)){
        fun creaRutaEspecifica(titol:String)="$rutaBase/$titol"
    }
    object idCars:Destinacio("PantallaCar", listOf(ArgumentDeNavegacio.Id)){

        fun creaRutaEspecifica(id:String)="$rutaBase/$id"

    }


    object LlistaDeBikes:Destinacio("LlistaDeBikes", listOf(ArgumentDeNavegacio.Titol)){
        fun creaRutaEspecifica(titol:String)="$rutaBase/$titol"
    }

    object idBikes:Destinacio("PantallaBikes", listOf(ArgumentDeNavegacio.Id)){

        fun creaRutaEspecifica(id:String)="$rutaBase/$id"

    }


    object LlistaDeCrypto:Destinacio("LlistaDeCrypto", listOf(ArgumentDeNavegacio.Titol)){
        fun creaRutaEspecifica(titol:String)="$rutaBase/$titol"
    }

    object idCrypto:Destinacio("PantallaCrypto", listOf(ArgumentDeNavegacio.Id)){

        fun creaRutaEspecifica(id:String)="$rutaBase/$id"

    }





}

enum class  ArgumentDeNavegacio(
    val clau:String,
    val tipus:NavType<*>

)
{
    Titol("Titol", NavType.StringType),
    Id("id", NavType.StringType);


    fun toNavArgument():NamedNavArgument{
        return navArgument(clau){type = tipus}
    }




}