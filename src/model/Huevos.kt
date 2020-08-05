package model

class Huevos (tipoComida: String,
              nombreComida: String,
              esLiquido: Boolean,
              cantidad: Int,
              color: String)
    :Comida(tipoComida, nombreComida, esLiquido, cantidad, color){

    override fun muestraDatosComida() {
        super.muestraDatosComida()
    }

}