class Estudiantes (
    Nombre:String,
    Apellido:String,
    Identificacion:String,
    EstadoCivil:String,
    var Curso:String
):PersonasVinculadas(Nombre,Apellido,Identificacion,EstadoCivil){
    override fun Detalles() {
        super.Detalles()
        println("Curso: $Curso")
    }

    fun cambiarEstadoCivil(nuevoEstadoCivil: String) {
        EstadoCivil = nuevoEstadoCivil
    }

    fun CambiarMatricula(nuevaMatricula: String){
        Curso = nuevaMatricula
    }
}