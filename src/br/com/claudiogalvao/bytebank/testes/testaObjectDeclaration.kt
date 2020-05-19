package br.com.claudiogalvao.bytebank.testes

import br.com.claudiogalvao.bytebank.modelo.Cliente
import br.com.claudiogalvao.bytebank.modelo.Conta
import br.com.claudiogalvao.bytebank.modelo.ContaCorrente
import br.com.claudiogalvao.bytebank.modelo.ContaPoupanca

private fun testaObjectDeclaration() {
    var contaAlex = ContaCorrente(Cliente("Alex", "", 1), 1000)
    var contaAna = ContaPoupanca(Cliente("Ana", "", 2), 10001)

    testaContasDiferentes()

    println("Total de contas ${Conta.total}")
}