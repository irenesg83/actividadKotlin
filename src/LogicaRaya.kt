open class LogicaRaya (var arrayRaya: ArrayList<ArrayList<String?>>) {

    init {

        var i=0

        if (arrayRaya.none()){

            while (i<2) {

                for (j in (0..2)){

                    val col: ArrayList<String?> = arrayListOf<String?>()

                    this.arrayRaya.add(col)

                }

                i++

            }

        }

    }

    fun fillRaya() {

        var fin=true

        do {

            for (i in 0..2) {

                for (j in 0..2) {

                    println("Introduce X, O o '' (vacío).")
                    val raya: String = readln().uppercase()

                    this.arrayRaya.get(j).add(raya)

                }
            }

        } while (fin==false)



    }


}