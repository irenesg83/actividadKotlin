//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var arrayRaya = arrayListOf(ArrayList<String?>())

    val columna: ArrayList<String?> = arrayListOf()
    arrayRaya.add(columna)

    var i = 0
    var j = 0



    while (i <= 2) {

        while (j <= 2) {

            println("Elige valor a añadir en la posición $i - $j (solo 'X', 'O' o ' ' (vacío)")
            var valor: String = readln()

            if (valor.uppercase()=="X" || valor.uppercase()=="O" || valor==" ") {

                arrayRaya[i][j]=valor
                j++

            } else println("Valor incorrecto.")

        }

        i++

    }



}


