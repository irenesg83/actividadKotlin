//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var x: Int = 1
    var listAcciones: MutableList<String> = mutableListOf()

    while(x < 7) {

        println("Introduce la $x º acción que ha realizado el atleta (saltar o correr)")
        var accion: String = readln().uppercase()

        if ((accion=="CORRER")||(accion=="SALTAR")) {

            listAcciones.add(accion)
            x++

        } else println("Acción incorrecta.")

    }

    var patternCorrecto = true
    var patternPista: String

    do {

        println("Ahora introduce el patrón de la pista.")
        patternPista = readln()

        patternPista.length

        for (i in 0..patternPista.length) {

            if (patternPista.length<=5) {

                if (patternPista.get(i)=='_' || patternPista.get(i)=='|') patternCorrecto=true

            } else patternCorrecto = false

        }

        var rewrite=6

        if (patternPista.length>6) {

            patternPista.toCharArray().set(rewrite,'?')
            patternPista.toString()


        }

    } while (patternCorrecto)



    x = 0
    var isCorrecto=false;

    while(x < 5) {

        if (((listAcciones.get(x)=="CORRER") && (patternPista.get(x)=='_')) || ((listAcciones.get(x)=="SALTAR") && (patternPista.get(x)=='|'))) isCorrecto=true

        else isCorrecto=false

        if (patternPista.length>6) isCorrecto=false

    }

    println("$patternPista -> $isCorrecto")

}


