package br.com.claudiogalvao.bytebank.teste

import br.com.claudiogalvao.bytebank.exception.FalhaAutenticacaoException
import br.com.claudiogalvao.bytebank.exception.SaldoInsuficienteException
import br.com.claudiogalvao.bytebank.modelo.Cliente
import br.com.claudiogalvao.bytebank.modelo.ContaCorrente
import br.com.claudiogalvao.bytebank.modelo.ContaPoupanca
import java.lang.Exception

fun testaComportamentosConta() {

    val alex = Cliente("Alex", "111.111.111-11", 1234)
    val fran = Cliente("Fran", "222.222.222-22", 1234)

    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)

    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    try {
        contaFran.transfere(destino = contaAlex, valor = 300.0, senha = 1234)
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        println("Saldo insuficiente")
    } catch(e: FalhaAutenticacaoException) {
        println("Falha na transferência")
        println("Falha na autenticação")
    } catch(e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}