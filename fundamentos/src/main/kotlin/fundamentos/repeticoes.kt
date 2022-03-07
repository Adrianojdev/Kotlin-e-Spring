package fundamentos

fun main() {
    //print1a10()
    //print10a1()
    //printPar1a10()
    //printRange(5,15)
    whileMenorQue10()
    doWhileMenorque10()
}

fun print1a10() {
    for (numero in 1 .. 10){ //crescentes de 1 a 10
        println(numero)
    }
}

fun print10a1() {
    for (numero in 10 downTo 1) { //decrescentes de 1 a 10
        println(numero)
    }
}

fun printPar1a10() {
    for (numero in 2 ..10 step 2) { //pegando só pares pulando de 2 em 2
        println(numero)
    }
}

fun printRange(inicio: Int, fim: Int) { //while para quando encontra true
    for (numero in inicio .. fim) {
        println(numero)
    }
}

fun whileMenorQue10() { //dowhile ele roda uma vez antes de parar caso seja true
    var x = 10;
    while (x < 10) {
        println(x)
        x++
    }
}

fun doWhileMenorque10() {
    var x = 10;
    do {
        println(x)
        x++
    }while (x < 10);
}