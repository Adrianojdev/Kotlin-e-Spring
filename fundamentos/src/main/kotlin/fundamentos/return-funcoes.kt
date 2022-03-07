package fundamentos

fun retornaNumeroPorExtenso(numero: Int): String {
    if (numero == 5){
        return "Cinco"
    }else if (numero == 6) {
        return "Seis"
    }
    return "Numero nao mapeado"
}

fun main() {
    println(retornaNumeroPorExtenso(6))
}

//somente para mostrar que podemos ter mais de um return dentro de uma função