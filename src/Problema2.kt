import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Digite la cantidad de numeros: ")

    var n = scanner.nextInt()

    while ( n<=0) {
        println("Digito un numero invalido, intenta otra vez")
        print("->")
        n = scanner.nextInt()
    }
    var suma=n*(n+1)/2
    print("La suma de "+n+" numeros es " +suma)
}
