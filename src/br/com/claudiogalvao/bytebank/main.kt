package br.com.claudiogalvao.bytebank

import br.com.claudiogalvao.bytebank.exception.SaldoInsuficienteException
import br.com.claudiogalvao.bytebank.modelo.Endereco
import br.com.claudiogalvao.bytebank.teste.testaComportamentosConta

fun main() {
    val enderecoNulo: Endereco? = null
    val logradouro: String? = enderecoNulo?.logradouro

    val enderecoNaoNulo: Endereco? = Endereco(logradouro = "Avenida Independência")
    val novoLogradouro: String? = enderecoNaoNulo?.logradouro

    println(enderecoNaoNulo?.logradouro?.length)
    //O let permite não usar o safe call se fizer o safe call do let, pois a função só será executada se o endereco
    //não for nulo
    enderecoNaoNulo?.let {
        println(it.logradouro.length)
        //Se complemento for null, matribui N/A para complemento
        val complemento: String? = it.complemento ?: "N/A"
        println(complemento)
    }

    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
    }

    converteParaInt("")

    val nome: String? = null
    nome?.length?.toULong()
}

fun converteParaInt(numero: Any) {
    //Tenta realizar o cast do valor recebido
    //Se valor recebido for vazio, atribui null para valor
    val valor: Int? = numero as? Int
    println(valor)
}