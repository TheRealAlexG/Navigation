package com.example.navegaciollistas.Dades

import androidx.compose.ui.graphics.Color

data class Car(
    val id:String,
    val marca:String,
    val serie:String,
    val foto:String,
    val color: Color,
    val hp:Int,
    val parmotor:Int

    )


class Cars{
    companion object{
        val dadesCars=
            listOf(
                Car("1","Porsche","911 gt3","https://files.porsche.com/filestore/image/multimedia/none/992-gt3-modelimage-sideshot/model/765dfc51-51bc-11eb-80d1-005056bbdc38/porsche-model.png",Color.White,583,680),
                Car("2","Lamborghini","STO","https://www.lamborghinigoldcoast.com/imagetag/10170/7/l/New-2022-Lamborghini-Huracan-LP-640-4-STO-1659563762.jpg",Color.Blue,640,720),
                Car("3","Ferrari","SF90","https://i.ytimg.com/vi/oeZVfWLKtqQ/maxresdefault.jpg",Color.Black,720,820),
                Car("4","Mclaren","760LT","https://www.carscoops.com/wp-content/uploads/2021/09/McLaren-720S-1024x555.jpg",Color(161,0,253),610,849),
                Car("5","Ferrari","F40","https://hips.hearstapps.com/hmg-prod/images/dw-burnett-f40-7146-64f8857900ee7.jpg?resize=2048:*",Color.Red,600,700),
                Car("6","Lamborghini","Aventador","https://fotografias.lasexta.com/clipping/cmsimages02/2018/08/25/06D797C9-E68F-4246-88A2-25B3ADC50EBA/98.jpg?crop=1440,810,x0,y100&width=1900&height=1069&optimize=high&format=webply",Color.Green,650,710),
                Car("7","Bugatti","Chiron","https://www.thesun.co.uk/wp-content/uploads/2022/09/NINTCHDBPICT000737350738.jpg",Color(253,178,0),1000,1000),
            )

        fun CarsId(id: String): Car? {
            return Cars.dadesCars.find { it.id == id }
        }


    }


        //val dadesCarss=(1..100).toList().map{Crear Cars(it)};




}
