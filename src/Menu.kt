import model.*

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
            Tenemos los siguientes tipos de ingredientes:
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
            Tenemos los siguientes tipos de ingredientes:
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
    if (ingrediente == "1"){
        var agua : Agua = Agua("Agua","Agua",true,10,"Sin color","Sin sabor","Sin olor")
        agua.muestraDatosComida()
    }else if (ingrediente=="2"){
        var queso:Lacteos = Lacteos("Lacteos","Queso oaxaca",false,5,"Blanco amarilloso")
        queso.muestraDatosComida()
    }else if(ingrediente=="3"){
        var pollo:Carnes = Carnes("Carne blanca","Pechuga de pollo",false,6,"Pollo","Blanco")
        pollo.muestraDatosComida()
    }else if(ingrediente=="4"){
        var huevo:Huevos = Huevos("Huevos","Huevos",false,32,"Blanco")
        huevo.muestraDatosComida()
    }else if(ingrediente=="5"){
        var aceite:Aceites = Aceites("Aceite","Aceite de oliva",false,4,"Dorado")
        aceite.muestraDatosComida()
    }else if(ingrediente=="6"){
        var brocoli:Verduras = Verduras("Verduras","Brócoli",false,30,"Verde")
        brocoli.muestraDatosComida()
    }else if(ingrediente=="7"){
        var trigo:Granos = Granos("Cereal/granos","Trigo",false,500,true,"Cafe")
        trigo.muestraDatosComida()
    }else if(ingrediente=="8"){
        var platano : Frutas = Frutas("Fruta","Plátano",false,12,false,"Amarillo")
        platano.muestraDatosComida()
    }
}