package com.example.navegaciollistas.Dades

import androidx.compose.ui.graphics.Color


data class Crypto(
    val id:String,
    val marca:String,
    val foto:String,
    val color: Color,
    val valor:Int

)


class Cryptos{
    companion object{
        val dadesCrypto=
            listOf(
                Crypto("15","Bitcoin","https://img.freepik.com/free-vector/cryptocurrency-bitcoin-golden-coin-background_1017-31505.jpg",Color.Yellow,36000),
                Crypto("16","Ethereum","https://media.ambito.com/p/9c57bcc58b3be5c19ea3a38d32f54fca/adjuntos/239/imagenes/038/684/0038684219/1200x675/smart/ethereum-banco-centraljpg.jpg",Color.Blue,3500),
                Crypto("17","DogeCoin","https://m.media-amazon.com/images/I/71NfpZf61UL.jpg",Color.Red,2000),
                Crypto("18","Cardano","https://m.media-amazon.com/images/I/81uIn7bXNxL._AC_UF894,1000_QL80_.jpg",Color.Magenta,5400),
                Crypto("19","BnBCoin","https://m.media-amazon.com/images/I/61d65G+qtgL.jpg",Color.Cyan,7400),
                Crypto("20","LiteCoin","https://blockworks-co.imgix.net/wp-content/uploads/2023/10/bitcoin-litecoin.jpg",Color.LightGray,4300),
                Crypto("21","Ripple","https://assets.cmcmarkets.com/images/Ripple_image.jpg",Color.White,8900),
            )

        fun CryptoId(id: String): Crypto? {
            return Cryptos.dadesCrypto.find{ it.id == id }
        }


    }

    //val dadesCarss=(1..100).toList().map{Crear Cars(it)};
}
