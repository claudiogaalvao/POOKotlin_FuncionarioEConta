package br.com.claudiogalvao.bytebank.teste

import br.com.claudiogalvao.bytebank.modelo.Cliente
import br.com.claudiogalvao.bytebank.modelo.ContaCorrente
import br.com.claudiogalvao.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    val maria = Cliente("Maria", "111.111.111-11", 1234)
    val joao = Cliente("João", "222.222.222-22", 1234)

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome = "João"
    var contaMaria = ContaPoupanca(maria, 1003)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}