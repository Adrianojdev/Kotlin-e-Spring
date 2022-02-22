package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa, Nome: ${nome}, idade: ${idade}"
    }
}

fun main() {
    var Adriano = Pessoa("Adriano", 33)
    println(Adriano)
}