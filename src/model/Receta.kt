package model

class Receta (nombreReceta:String,alimento:String,alimento2: String){

    fun construyeReceta(nombreReceta: String,alimento: String,alimento2: String){
        println("Has creado $nombreReceta\n" +
                "Utilizaste $alimento y $alimento2\n")
    }

}