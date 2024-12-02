//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main()  {

    var salir=false
    var logicaAgenda=LogicaAgenda()

    do {

        println("Bienvenido al programa de almacenamiento de contactos.")

        println("Elija una opción:")
        println("1. Añadir contacto.")
        println("2. Imprimir contactos por pantalla.")
        println("3. Buscar contacto.")
        println("4. Comprobar si existe un contacto.")
        println("5. Eliminar contacto.")
        println("6. Comprobar el número de espacios libres.")
        println("7. Comprobar si la agenda está libre.")
        println("8. Salir.")

        val opcion: String = readln()

        when (opcion) {

            "1" -> logicaAgenda.newContacto()
            "2" -> logicaAgenda.listContacto()
            "3" -> logicaAgenda.buscarContacto()
            "4" -> logicaAgenda.checkContacto()
            "5" -> logicaAgenda.delContacto()
            "6" -> logicaAgenda.checkFree()
            "7" -> logicaAgenda.checkEmpty()
            "8" -> salir=true

            else -> println("El valor introducido no es correcto. Por favor, inténtelo de nuevo.")


        }


    } while (salir==false)

}
