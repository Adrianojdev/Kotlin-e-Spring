package fundamentos

/*
variável é uma função que vai receber um valor e pode ser
alterada ou não. existem dois tipos:
var = mutável.
val =  imutável
 */

fun main() {
    var nome = "Adriano"
    val nomeVal = "Adriano"

    nome = "Daniel"

    val idade = 24;
    println(idade);

    var texto = "Texto";
    //apesar de não estar declarado, é uma string e não aceito valores numéricos.


}

class variaveis {
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}