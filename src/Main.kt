//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var x: Int = 1
    var listAcciones: MutableList<String> = mutableListOf() // se crea la lista de acciones

    while(x < 7) { //bucle para introducir las acciones

        println("Introduce la $x º acción que ha realizado el atleta (saltar o correr)")
        var accion: String = readln().uppercase()

        if ((accion=="CORRER")||(accion=="SALTAR")) {

            listAcciones.add(accion)
            x++

        } else println("Acción incorrecta.")

    }

    var patternCorrecto = true
    var patternPista: String
    var i=0

    println("Ahora introduce el patrón de la pista.")
    patternPista = readln()

    var pistaArray = patternPista.toCharArray() //se pasa el patrón a chararray para recorrer el string introducido de char a char

    do {

        while (i<pistaArray.size) {

            if (pistaArray.size<=5) {

                if (pistaArray.get(i)=='_' || pistaArray.get(i)=='|') patternCorrecto=true //si el char en la posición es | o _, el patrón es correcto

            } else patternCorrecto = false

            i++
        }


    } while (patternCorrecto)

    x = 0
    var isCorrecto=false;


    while(x < 5) {

        // se checkea que las acciones coincidan con lo introducido en el patrón. si es así se settea isCorrecto a true, si no se settea a false
        if (((listAcciones.get(x)=="CORRER") && (patternPista.get(x)=='_')) || ((listAcciones.get(x)=="SALTAR") && (patternPista.get(x)=='|'))) isCorrecto=true

        else isCorrecto=false

        if (patternPista.length>6) isCorrecto=false

        x++

    }

    println("$patternPista -> $isCorrecto") //se imprime el resultado

    //lo único que no hace mi programa es cambiar caracteres extra a ?. por lo demás, el funcionamiento es correcto

}


