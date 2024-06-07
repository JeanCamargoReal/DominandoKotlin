package variables

import java.util.Scanner

fun main() {
//    print(">")
//    val n1 = readln().toInt()
//
//    print(">")
//    val n2 = readln().toInt()
//
//    println("Resultado: ${n1 + n2}")

    val scanner = Scanner(System.`in`)
    print("> ")
    val n1 = scanner.nextInt()

    print("> ")
    val n2 = scanner.nextInt()

    println("Resultado: ${n1 + n2}")
}