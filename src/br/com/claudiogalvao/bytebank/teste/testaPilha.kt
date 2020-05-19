package br.com.claudiogalvao.bytebank.teste

import br.com.claudiogalvao.bytebank.exception.SaldoInsuficienteException

fun funcao1() {
    println("início função1")
    try {
        funcao2()
    } catch(e: SaldoInsuficienteException) {
        e.printStackTrace()
        println("SaldoInsuficienteException foi pegada")
    }

    println("fim função 1")
}

fun funcao2() {
    println("início função2")
    for(i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim função2")
}