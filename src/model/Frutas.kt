package model

class Frutas (tipoComida:String,
              nombreComida:String,
              esLiquido:Boolean,
              cantidad: Int,
              var tieneSemillas:Boolean, color: String):
        Comida(tipoComida, nombreComida, esLiquido,cantidad, color){

    override fun muestraDatosComida() {
        super.muestraDatosComida()
        println("\n" +
                "Tiene semillas: $tieneSemillas")
    }

    fun setSemillas(){
        tieneSemillas = true
    }

    fun getSemillas(sem:Boolean){
        this.tieneSemillas = sem
    }

    val listaFrutas = listOf<String>("Manzana","Plátano","Fresa","Naranja","Uva")

}