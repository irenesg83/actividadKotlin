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

    /*

    mi código no comprueba si hay repetidos y si dichos repetidos están en el orden adecuado.
    sí comprueba que estén en el orden adecuado (es decir, si están en el orden llave > corchete > paréntesis).


     */

    if (ex.contains("{"))

        if (ex.contains("}") && (ex.contains("[")) && (ex.contains("]")) && (ex.contains("(")) && (ex.contains(")"))) print(true) else print(false)

        else if (ex.contains("["))

            if ((ex.contains("]")) && (ex.contains("(")) && (ex.contains(")"))) print(true) else print(false)

            else if (ex.contains("(")) if (ex.contains(")")) print(true) else print(false)

}

/*

    he visto soluciones en internet que arreglan mi error usando un hash, pero no hemos visto eso en clase así que mejor no ponerlo como código runneable
    la solución en cuestión es esta función:
    fun String.allUnique(): Boolean = all(hashSetOf<Char>()::add)
    en los checks, se puede añadir como "&& ex.allUnique()"
    a pesar de que funciona con los ejemplos del enunciado, para un programa real no serviría, ya que comprueba que los caracteres sean únicos, no que las expresiones estén balanceadas, con lo cual ciertas expresiones correctas, como "2+(3*5)-(4+5)", imprimirían false

*/
