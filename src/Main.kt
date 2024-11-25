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
    quitando el error, funciona.


     */
    if (ex.contains("{"))

        if (ex.contains("}") && (ex.contains("[")) && (ex.contains("]")) && (ex.contains("(")) && (ex.contains(")"))) print(true) else print(false)

        else if (ex.contains("["))

            if ((ex.contains("]")) && (ex.contains("(")) && (ex.contains(")"))) print(true) else print(false)

            else if (ex.contains("(")) if (ex.contains(")")) print(true) else print(false)

}