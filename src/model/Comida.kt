package model

abstract class Comida (open var tipoComida:String,
                       open var nombreComida:String,
                       open var esLiquido:Boolean,
                       open var cantidad:Int,
                       open var color:String){

    open fun muestraDatosComida(){
        println("Tipo de comida: $tipoComida \n" +
                "Nombre: $nombreComida \n" +
                "Es líquido: $esLiquido \n" +
                "Cantidad: $cantidad \n" +
                "Color: $color \n")
    }
}