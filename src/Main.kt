//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    /*

    declaro la variables junto al readln por limpieza, pero se puede declarar por separado.
    está declarada como val porque nunca se modifica.

     */

    println("Introduce una expresión matemática")
    val ex: String = readln()

    println("¿Balanceado?")

    var exArray = ex.toCharArray() // paso ex a un CharArray para poder recorrer posición a posición

    var i=0
    var openLlave=0
    var closeLlave=0
    var openCorchete=0
    var closeCorchete=0
    var openParentesis=0
    var closeParentesis=0

    var llaveBal = true
    var corBal = true
    var parBal = true

    while (i<exArray.size) { // recorro el array de ex y cuento cuántas instancias de los delimitadores están presentes

        var charInEx = exArray.get(i)

        when (charInEx) {

            '{' -> openLlave++
            '}' -> {
                /*
                    si el número de llaves cerradas no es igual al de llaves abiertas, el valor "llaveBal" es false.
                    esto se hace para que la expresión 5 no de true.
                    este checkeo se hace también con closeCorchete y closeParentesis.

                */

                closeLlave++
                if (closeLlave != openLlave) llaveBal=false

            }
            '[' -> openCorchete++
            ']' -> {

                closeCorchete++
                if (closeCorchete != openCorchete) corBal=false

            }
            '(' -> openParentesis++
            ')' -> {

                closeParentesis++
                if (closeParentesis != openParentesis) parBal=false

            }

        }

        i++

    }

    /*

        El if de aquí es muy largo, así que aquí dejo una deglosación de lo que checkea
        1. Que el número de llaves, corchetes y paréntesis abiertas es igual al que hay cerradas
        2. Que llaveBal, corBal y parBal sean true (explicado lo que hacen más arriba)

        Si todo se cumple, devuelve true (está balanceada); si no devuelve false.

     */

    if (
        (openLlave==closeLlave)
        && (openCorchete==closeCorchete)
        && (openParentesis==closeParentesis)
        && (llaveBal==true)
        && (corBal==true)
        && (parBal==true)) {

            print(true)

        } else  print(false)

}

    // Pues al final la solución que se me ocurrió ayer funcionó xD
