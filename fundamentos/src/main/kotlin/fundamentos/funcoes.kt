package fundamentos

fun main() {

    dizOi("Adriano", 34); // segunda função exemplo
    dizOi(idade = 34, nome = "Adriano");
}

fun retornaNome(): String {
    return "Adriano"
}

// se colocar a idade depois do int, quando não informadam ele retoena ela por valor padrão
// fun dizOi(nome: String, idade: Int = 20)

fun dizOi(nome: String, idade: Int) {
    println("Oi ${nome}, parabéns pelos seus ${idade} anos");
}