import java.lang.Exception

fun main() {
try {
    var Estudiante1 = Estudiantes("Helmer","Rodriguez","1003632687","Soltero","ISUM")
    var Profesor1 = Profesores("Mario","Perez","123598632","Casado","Matematicas")
    var Empleado1 = Empleados("Julian","Sanchez","4563259","Soltero","2015","5","Sistemas")
    println("Detalles Estudiantes")
    Estudiante1.Detalles()
    var lstEstudiante = arrayListOf<Estudiantes>()
    lstEstudiante.add(Estudiante1)
    println(lstEstudiante.toString())
    lstEstudiante.forEach {
        println("""
            
            ${it.Nombre}
            ${it.Apellido}
            ${it.Identificacion}
            ${it.EstadoCivil}
            ${it.Curso}
            
        """.trimIndent())
    }

    Estudiante1.cambiarEstadoCivil("Casado")
    Estudiante1.Detalles()

    Estudiante1.CambiarMatricula("Ingenieria civil")
    Estudiante1.Detalles()

    println("Detalles Profesores")
    Profesor1.Detalles()
    var lstProfesor = arrayListOf<Profesores>()
    lstProfesor.add(Profesor1)
    println(lstProfesor.toString())
    lstProfesor.forEach {
        println("""
            
            ${it.Nombre}
            ${it.Apellido}
            ${it.Identificacion}
            ${it.EstadoCivil}
            ${it.Area}
            
        """.trimIndent())
    }

    Profesor1.CambioDeoartamento("Sistemas")
    Profesor1.Detalles()

    println("Detalles Empleados")
    Empleado1.Detalles()
    var lstEmpleados = arrayListOf<Empleados>()
    lstEmpleados.add(Empleado1)
    println(lstEmpleados.toString())
    lstEmpleados.forEach {
        println("""
            
            ${it.Nombre}
            ${it.Apellido}
            ${it.Identificacion}
            ${it.EstadoCivil}
            ${it.AñoIncorporacion}
            ${it.Despacho}
            ${it.SeccionAsignada}
            
        """.trimIndent())
    }

    Empleado1.ReasigancionDespacho("9")
    Empleado1.Detalles()

    Empleado1.CambioSeccion("Secretaria")
    Empleado1.Detalles()


}catch (ex: Exception){
    println("Hay una excepcion en: ${ex.message}")
}
}