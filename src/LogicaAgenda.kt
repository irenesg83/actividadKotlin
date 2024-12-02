open class LogicaAgenda(var arrayContactos: ArrayList<Contacto> = ArrayList<Contacto>(10)) {

    init {

        var i=0

        if (arrayContactos.none()){

            while (i<10) {

                arrayContactos.add(Contacto("",""))
                i++

            }

        }

    }

    //<editor-fold desc="fun newcontacto">

    fun newContacto() {

        var dupe=false
        var i=0

        println("Introduce nombre.")
        val nombre: String = readln().uppercase()

        println("Introduce número.")
        val tlf: String = readln()

        val contacto=Contacto(nombre,tlf)

        while (i<arrayContactos.size && dupe==false) {

            if(arrayContactos.get(i).nombre!=nombre && arrayContactos.get(i).nombre=="") {

                arrayContactos.add(contacto)
                println("Añadido el nuevo contacto: "+contacto.toString())
                break


            } else if (arrayContactos.get(i).nombre==nombre) {

                dupe=true
                println("El contacto ya existe.")

            } else i++

        }

    }

    //</editor-fold>


    //<editor-fold desc="fun listcontacto">

    fun listContacto() {

        var i=0

        while (i<arrayContactos.size) {

            var contacto: String = arrayContactos.get(i).toString()
            println(contacto)

            i++

        }

    }

    //</editor-fold>

    //<editor-fold desc="fun buscarcontacto">

    fun buscarContacto() {

        var i=0
        var found=false

        println("Introduce el nombre del contacto.")
        val nombre: String = readln().uppercase()

        while (i<arrayContactos.size) {

            if (arrayContactos.get(i).nombre==nombre) {

                var contacto: String = arrayContactos.get(i).toString()
                println(contacto)
                found=true

            }

            i++

        }

        if (found==false) println("El contacto no existe.")

    }

    //</editor-fold>

    //<editor-fold desc="fun checkcontacto">

    fun checkContacto() {

        var i=0
        var existe=false

        println("Introduce el nombre del contacto.")
        val nombre: String = readln().uppercase()

        while (i<arrayContactos.size) {

            if (arrayContactos.get(i).nombre==nombre) {

                existe=true

            }

            i++

        }

        println("$existe")

    }

    //</editor-fold>


    //<editor-fold desc="fun delcontacto">

    fun delContacto() {

        var i=0
        var deleted=false

        println("Introduce el nombre del contacto.")
        val nombre: String = readln().uppercase()

        while (i<arrayContactos.size) {

            if (arrayContactos.get(i).nombre==nombre) {

                arrayContactos.removeAt(i)
                deleted=true

            }

            i++

        }

        println("¿Borrado? $deleted")

    }

    //</editor-fold>


    //<editor-fold desc="fun checkfree">

    fun checkFree() {

        var i=0
        var free=0


        while (i<arrayContactos.size) {

            if (arrayContactos.get(i).nombre=="") {

                free++

            }

            i++

        }

        println("Espacios libres: $free")

    }

    //</editor-fold>

    //<editor-fold desc="fun checkempty">

    fun checkEmpty() {

        var i=0
        var isEmpty=true


        while (i<arrayContactos.size) {

            if (arrayContactos.get(i).nombre!="") {

                isEmpty==false
                break

            }

            i++

        }

        println("¿Agenda vacía? $isEmpty")

    }

    //</editor-fold>

}