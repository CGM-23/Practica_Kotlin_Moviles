import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val notas = Array(20) { IntArray(20) }
    val nombres = Array(20) { "" }

    var mayor_promedio = -1000.00
    var mejor = -100
    var suspendidos = 0

    for (i in 0 until  20) {
        print("Nombre del alumno " +(i+1)+": ")
        nombres[i] = scanner.next()
        println("Notas del alumno " +nombres[i]+":")
        var suma=0
        for (j in 0 until 3) {
            val nota = (0..20).random()
            notas[i][j] = nota
            println("Nota de la asignatura "+(j+1)+": "+notas[i][j])
            suma+=notas[i][j]
        }
        var promedio =suma/3.0
        if (promedio>mayor_promedio) {
            mayor_promedio=promedio
            mejor=i
        }
        if (promedio<12){
            suspendidos++
        }
    }

    println("El mejor alumno es "+nombres[mejor]+" con promedio = "+mayor_promedio)
    println("Cantidad de suspendidos: "+suspendidos)
}
