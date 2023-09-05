class Profesores(
    Nombre:String,
    Apellido:String,
    Identificacion:String,
    EstadoCivil:String,
    var Area:String
):PersonasVinculadas(Nombre,Apellido,Identificacion,EstadoCivil) {
    override fun Detalles() {
        super.Detalles()
        println("Area: $Area")
    }

    fun CambioDeoartamento(nuevoDepartamento: String){
        Area = nuevoDepartamento
    }
}