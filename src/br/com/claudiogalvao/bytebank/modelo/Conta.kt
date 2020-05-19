package br.com.claudiogalvao.bytebank.modelo

import br.com.claudiogalvao.bytebank.exception.FalhaAutenticacaoException
import br.com.claudiogalvao.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set
    companion object {
        var total: Int = 0
            private set
    }
    
    init {
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)
}

class ContaCorrente(
        titular: Cliente,
        numero: Int
) : Conta(
        titular = titular,
        numero = numero
), Transferivel {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }

    override fun transfere(valor: Double, destino: Conta, senha: Int) {
        if(saldo < valor) {
            throw SaldoInsuficienteException("Saldo insuficiente, saldo atual: $saldo, valor que tentou transferir: $valor")
        }
        if(!titular.autentica(senha)) {
            throw FalhaAutenticacaoException()
        }

        saldo -= valor
        destino.deposita(valor)
    }
}

class ContaPoupanca(
        titular: Cliente,
        numero: Int
) : Conta(
        titular = titular,
        numero = numero
), Transferivel {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }

    override fun transfere(valor: Double, destino: Conta, senha: Int) {
        if(saldo < valor) {
            throw SaldoInsuficienteException("Saldo insuficiente, saldo atual: $saldo, valor que tentou transferir: $valor")
        }
        if(!titular.autentica(senha)) {
            throw FalhaAutenticacaoException()
        }

        saldo -= valor
        destino.deposita(valor)
    }
}

class ContaSalario(
        titular: Cliente,
        numero: Int
) : Conta(
        titular,
        numero
){
    override fun saca(valor: Double) {
        if(this.saldo >= valor) {
            this.saldo -= valor
        }
    }

}