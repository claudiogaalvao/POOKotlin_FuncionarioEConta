package br.com.claudiogalvao.bytebank.testes

import br.com.claudiogalvao.bytebank.modelo.Cliente
import br.com.claudiogalvao.bytebank.modelo.Conta
import br.com.claudiogalvao.bytebank.modelo.ContaCorrente
import br.com.claudiogalvao.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {

    val alex = Cliente("Alex", "111.111.111-11", 1234)
    val fran = Cliente("Fran", "222.222.222-22", 1234)

    val contaCorrente = ContaCorrente(
            alex,
            1000
    )

    val contaPoupanca = ContaPoupanca(
            fran,
            1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo poupança após transferir para poupança: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}