//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    /*
    
    declaro las variables en junto al readln por limpieza, pero se pueden declarar por separado.
    están declaradas como val porque nunca se modifican.
    las paso a mayúsculas porque mi método para comprobar si son iguales distingue entre upper y lowercase.

     */
    println("Introduce una palabra")
    val palabra1: String = readln().uppercase()

    println("Introduce otra palabra")
    val palabra2: String = readln().uppercase()

    println("¿Son $palabra1 y $palabra2 anagramas? ")

    // comprueba si palabra1 y palabra2 son anagramas usando equals y String.reversed(). si palabra2 al revés es igual que palabra1, imprime true, si no, imprime false
    if (palabra1.equals(palabra2.reversed())) { print(true) }
    else print(false)

    // me imagino que también se puede hacer con arrays, añadiendo la primera letra de palabra2 a la última posición, la segunda a la penúltima, etc.. pero sería un lío

}