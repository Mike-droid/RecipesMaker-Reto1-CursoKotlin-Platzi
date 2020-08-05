package model

class Agua (tipoComida:String,
            nombreComida:String,
            esLiquido:Boolean,
            cantidad:Int,
            color:String,
            var sabor:String,
            var olor:String):Comida(tipoComida,nombreComida,esLiquido,cantidad,color){

    override fun muestraDatosComida() {
        super.muestraDatosComida()
        println("\n" +
                "Sabor: $sabor \n" +
                "Olor: $olor")
    }

    fun setColor(){
        color = "Incolora"
    }

    fun getColor(c:String){
        this.color = c
    }

    fun setSabor(){
        sabor = "Insabora"
    }

    fun getSabor(s:String){
        this.sabor = s
    }

    fun setOlor(){
        olor = "Inolora"
    }

    fun getOlor(o:String){
        this.olor = o
    }

    /*fun muestraDatosAgua(){
        println("Tipo de comida: $tipoComida \n" +
                "Nombre de comida: $nombreComida \n" +
                "Es líquido: $esLiquido \n" +
                "Cantidad: $cantidad \n" +
                "Color: $color \n" +
                "Sabor: $sabor \n" +
                "Olor: $olor")
    }*/


}