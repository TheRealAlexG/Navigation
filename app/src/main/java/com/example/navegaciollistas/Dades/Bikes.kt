package com.example.navegaciollistas.Dades

import androidx.compose.ui.graphics.Color


data class Bike(
    val id:String,
    val marca:String,
    val serie:String,
    val foto:String,
    val color: Color,
    val hp:Int,
    val parmotor:Int

)


class Bikes{
    companion object{
        val dadesBikes=
            listOf(
                Bike("8","Yamaha","R1","https://www.motofichas.com/images/phocagallery/yamaha/yzf-r1-2023/01-yamaha-yzf-r1-2022-estudio-azul.jpg",
                    Color.White,205,180),
                Bike("9","Honda","FIREBLADE RRR 1000","https://m.media-amazon.com/images/I/51qUjJxBxcL._AC_.jpg",
                    Color.Blue,220,280),
                Bike("10","Kawasaki","H2R","https://storage.kawasaki.eu/public/kawasaki.eu/en-EU/model/19ZX1000Y_201GY3DRF1CG_A_001.png",
                    Color.Black,240,300),
                Bike("11","Bmw","S1000RR","https://www.motociclismo.es/uploads/s1/11/48/23/64/bmw-s1000rr-2023-estatica-4.jpeg",
                    Color(161,0,253),583,680),
                Bike("12","Ducati","PANIGALE 4R","https://cdn.autobild.es/sites/navi.axelspringer.es/public/media/image/2020/02/ducati-panigale-v4-superleggera-2020-1864701.jpg?tf=3840x",
                    Color.Red,230,280),
                Bike("13","KTM","SUPERDUKE 1290","https://solomoto.es/wp-content/uploads/2020/11/ktm-1290-Super-Duke-RR.jpg",
                    Color.Green,190,200),
                Bike("14","Suzuki","GSX-R","https://www.motofichas.com/images/phocagallery/Suzuki/gsx-r1000r-2019/01-suzuki-gsx-r1000r-2019-estudio-azul.jpg",
                    Color(253,178,0),194,200),

            )


        fun Bikesid(id: String): Bike? {
            return dadesBikes.find { it.id == id }
        }


    }


    //val dadesCarss=(1..100).toList().map{Crear Cars(it)};




}
