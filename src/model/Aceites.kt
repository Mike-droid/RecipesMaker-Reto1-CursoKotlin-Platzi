package model

class Aceites (tipoComida:String,
               nombreComida:String,
               esLiquido:Boolean,
               cantidad:Int,
               color: String):Comida(tipoComida,nombreComida,esLiquido,cantidad, color){

    override fun muestraDatosComida() {
        super.muestraDatosComida()
    }

    val listaAceites = listOf<String>("Oliva","Vegetal")
}