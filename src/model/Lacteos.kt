package model

class Lacteos (tipoComida:String,
               nombreComida:String,
               esLiquido:Boolean,
               cantidad:Int,
               color: String):Comida(tipoComida,nombreComida,esLiquido,cantidad, color){

    override fun muestraDatosComida() {
        super.muestraDatosComida()
    }

    val listaLacteos = listOf<String>("Leche","Queso","Nieve")

}