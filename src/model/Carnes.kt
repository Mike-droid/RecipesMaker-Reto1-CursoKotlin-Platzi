package model

class Carnes (tipoComida:String,
              nombreComida:String,
              esLiquido:Boolean,
              cantidad:Int,
              var animal:String,
              color: String):Comida(tipoComida,nombreComida,esLiquido,cantidad, color){

    override fun muestraDatosComida() {
        super.muestraDatosComida()
        println("Animal: $animal")
    }

}