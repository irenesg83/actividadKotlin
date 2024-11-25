//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var palabra1: String
    var palabra2: String

    println("Introduce una palabra")
    palabra1=readln()

    println("Introduce otra palabra")
    palabra2=readln()

    println("¿Son $palabra1 y $palabra2 anagramas? ")

    if (palabra1.equals(palabra2.reversed())) { print(true) }
    else print(false)

}