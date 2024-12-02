open class Contacto (val nombre: String="", val tlf: String="") {

    override fun toString(): String {

        if (this.nombre != "") {

            return "Nombre: $nombre. Teléfono: $tlf."

        } else{

            return ""

        }

    }

}