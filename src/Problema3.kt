import java.util.Scanner
import kotlin.math.*
/* se sabe que la suma es
              (-1)^(k+1)
             ------------
              √(2k - 1)
         
*/

fun main() {
    val scanner = Scanner(System.`in`)
    print("Digite la cantidad de terminos de la suma: ")
    val terminos = scanner.nextInt()
    println("la cantidad de terminos es: "+terminos)
    var suma=0.0
    for (i in 1 .. terminos) {

        suma += (-1.0).pow(i - 1)/(sqrt((2*i-1).toDouble()))

    }
    println("la suma total es: "+suma)
}
