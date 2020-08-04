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
    var escogeReceta:String? = null

    if(opcion=="1") {
        println("""
            Tenemos los siguientes ingredientes:
            1.Agua
            2.Leche
            3.Carne
            4.Huevos
            5.Aceite
            6.Verduras
            7.Cereal
            8.Frutas
            ¿Con cuál deseas hacer una receta?
        """.trimIndent())
    }
        else if (opcion == "2") {
            println("""
            Tenemos los siguientes ingredientes:
            1.Agua
            2.Leche
            3.Carne
            4.Huevos
            5.Aceite
            6.Verduras
            7.Cereal
            8.Frutas
            ¿De qué ingredientes quieres ver las recetas?
        """.trimIndent())
        escogeReceta = readLine()
        leerIngrediente(escogeReceta.toString())
        }
}

fun leerIngrediente(ingrediente:String){
    when(ingrediente){
        "1" -> println("Recetas con agua: lorem")
        "2" -> println("Recetas con leche: lorem")
        "3" -> println("Recetas con carne: lorem")
        "4" -> println("Recetas con huevos: lorem")
        "5" -> println("Recetas con aceite: lorem")
        "6" -> println("Recetas con verduras: lorem")
        "7" -> println("Recetas con cereal: lorem")
        "8" -> println("Recetas con frutas: lorem")
    }
}