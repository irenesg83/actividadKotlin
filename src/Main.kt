//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    for (i in 1..100) {

        // comprueba si el resto de i/3 e i/5 no es 0. si es cierto, imprime el número
        if ((i%3!=0) && (i%5!=0)) { println(i) }

        //comprueba si el resto de i/3 es 0 y si el de i/5 no lo es. si es cierto, imprime tri
        else if ((i%3==0) && (i%5!=0)) { println("tri") }

        //comprueba si el resto de i/3 no es 0 y si el de i/5 lo es. si es cierto, imprime qui
        else if ((i%3!=0) && (i%5==0)) { println("qui") }

        //si las condiciones anteriores no son ciertas (es decir, el resto de i/3 e i/5 da 0), imprime triqui
        else { println("triqui") }

        /*

        posiblemente haya una forma mejor de hacer esto, pero este método funciona.

        también sería posible comprobarlo con i/3 e i/5, pero para eso habría que checkear si los cocientes son múltiplos de 3 y 5, haciendo el código mucho más largo y redundante

         */

    }
}