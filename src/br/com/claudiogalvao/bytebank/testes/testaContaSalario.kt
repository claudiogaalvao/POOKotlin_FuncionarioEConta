package br.com.claudiogalvao.bytebank.testes

import br.com.claudiogalvao.bytebank.modelo.Cliente
import br.com.claudiogalvao.bytebank.modelo.ContaCorrente
import br.com.claudiogalvao.bytebank.modelo.ContaPoupanca
import br.com.claudiogalvao.bytebank.modelo.ContaSalario

private fun testaContaSalario() {
    val andreza = Cliente("Andreza", "", 1234)
    val paola = Cliente("Paola", "", 1234)
    val marcos = Cliente("Marcos", "", 1234)

    val contaCorrente = ContaCorrente(andreza, 1000)
    val contaPoupanca = ContaPoupanca(paola, 1001)
    val contaSalario = ContaSalario(marcos, 1002)

    contaCorrente.deposita(2000.0)
    contaPoupanca.deposita(3000.0)
    contaSalario.deposita(1200.0)

    contaPoupanca.transfere(1500.0, contaCorrente)
    contaCorrente.transfere(500.0, contaPoupanca)

    println("Saldo conta corrente ${contaCorrente.saldo}")
    println("Saldo conta poupanca ${contaPoupanca.saldo}")
    println("Saldo conta salario ${contaSalario.saldo}")
}
