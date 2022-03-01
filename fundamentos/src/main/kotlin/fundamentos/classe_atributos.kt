package fundamentos

// val = variável imutável  ~ var = mutável
class carro(var cor: String, val anoFabricacao: Int, val dono: dono) {

}

data class dono(var nome: String, var idade: Int) {

}
fun main() {
    var carro = carro("Branco", 2021, dono("Adriano", 34))

    println(carro.cor);
    carro.cor = "Preto"

    println(carro.cor);

    println(carro.dono);

    println(carro.dono.nome); //acessa os dados
    carro.dono.nome = "Daniel" //Altera os dados da classe

    println(carro.dono.nome);
}