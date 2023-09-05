class Empleados(
    Nombre:String,
    Apellido:String,
    Identificacion:String,
    EstadoCivil:String,
    var AñoIncorporacion:String,
    var Despacho:String,
    var SeccionAsignada:String
):PersonasVinculadas(Nombre,Apellido,Identificacion,EstadoCivil) {
    override fun Detalles() {
        super.Detalles()
        println("Años de Incorporacion: $AñoIncorporacion")
        println("Despacho: $Despacho")
        println("Seccion Asignada: $SeccionAsignada")
    }

    fun ReasigancionDespacho(nuevoDespacho:String){
        Despacho = nuevoDespacho
    }

    fun CambioSeccion(nuevaSeccion:String){
        SeccionAsignada = nuevaSeccion
    }
}