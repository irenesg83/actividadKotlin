//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Introduce una palabra")
    val palabra1: String = readln()

    println("Introduce otra palabra")
    val palabra2: String = readln()

    println("¿Son $palabra1 y $palabra2 anagramas? ")

    // comprueba si palabra1 y palabra2 son anagramas usando un equals.(String.reversed()). si palabra2 al revés es igual que palabra1, imprime true, si no, imprime false
    if (palabra1.equals(palabra2.reversed())) { print(true) }
    else print(false)

}