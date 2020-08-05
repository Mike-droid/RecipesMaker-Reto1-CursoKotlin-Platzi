package model

class Granos (tipoComida:String,
              nombreComida:String,
              esLiquido:Boolean,
              cantidad:Int,
              var tieneSemillas:Boolean,
              color: String):Comida(tipoComida,nombreComida,esLiquido,cantidad, color){
    override fun muestraDatosComida() {
        super.muestraDatosComida()
        println("Tiene semillas: $tieneSemillas")
    }
}