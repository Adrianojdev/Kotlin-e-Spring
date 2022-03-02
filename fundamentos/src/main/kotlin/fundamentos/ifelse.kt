package fundamentos

fun main() {
    //parOuImpar(2);
    //parOuImpar(3);

    println(parOuImpar(2))
    println(parOuImpar(9))

    resultadoDaNota(3)
    resultadoDaNota(5)
    resultadoDaNota(8)
}
/*fun parOuImpar(numero: Int) {
    if(numero % 2 == 0) {
        println("Par")
    } else {
        println("Impar")
    }
}*/


/*
se a nota for > 6 = passou
se a nota for > 4 = recuperação
se a nota for < 4 = reprovou
 */
fun resultadoDaNota(nota: Int) {
    if (nota >= 6) {
        println("Passou")
    } else if (nota >= 4) {
        println("Recuperação")
    } else {
        println("Reprovou")
    }
}

// Outro exemplo
fun parOuImpar(numero: Int): String {
    return if(numero % 2 == 0) {
      "Par"
    } else {
      "Impar"
    }
}