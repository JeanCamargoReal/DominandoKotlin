package variables

fun main() {
    // Char só aceita um caracter
    val c: Char = 'A'
    println(c)
    println(c.code)
    println(c.inc().inc())

    val c2 = '1'

    // incrementa
    println(c2.inc())
    // decrementa
    println(c2.dec())

    println(c2.isDigit())
    println(c2.isLowerCase())
    println(c2.digitToInt())
}