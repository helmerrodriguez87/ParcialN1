open class PersonasVinculadas(
    var Nombre:String,
    var Apellido:String,
    var Identificacion:String,
    var EstadoCivil:String
) {
    open fun Detalles(){
        println("Nombre: $Nombre")
        println("Apellido: $Apellido")
        println("Identificacion: $Identificacion")
        println("Estado Civil: $EstadoCivil")
    }
}