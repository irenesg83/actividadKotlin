//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    for (i in 1..100) {
        if ((i%3!=0) && (i%5!=0)) { println(i) }

        else if ((i%3==0) && (i%5!=0)) { println("tri") }

        else if ((i%3!=0) && (i%5==0)) { println("qui") }

        else if ((i%3==0) && (i%5==0)) { println("triqui") }



    }
}