var opcion:String? = null

fun main() {
    do {
        mostrarMenu()
        opcion = readLine()
        leerOpcion(opcion.toString())
    } while(!opcion.equals("3"))

}

fun mostrarMenu(){
    println("""
        :: Bienvenido a Recipe Maker ::

        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent())
}

fun leerOpcion(opcion:String){
    when(opcion){
        "1" -> println("""
            Tenemos los siguientes ingredientes:
            1.Agua
            2.Leche
            3.Carne
            4.Huevos
            5.Aceite
            6.Verduras
            7.Cereal
            8.Frutas
        """.trimIndent())
        "2" -> println("""
            Tus recetas son:
            1) Huevos con aceite
            2) Carne con verduras
            3) Cereal con leche
        """.trimIndent())
    }

}