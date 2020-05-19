package br.com.claudiogalvao.bytebank.teste

import br.com.claudiogalvao.bytebank.modelo.Analista
import br.com.claudiogalvao.bytebank.modelo.CalculadoraBonificacao
import br.com.claudiogalvao.bytebank.modelo.Diretor
import br.com.claudiogalvao.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val alex = Analista(
            "Alex",
            "425.178.984-90",
            1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacao ${alex.bonificacao}")

    val fran = Gerente(
            "Fran",
            "222.222.222-20",
            2000.0,
            1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificacao ${fran.bonificacao}")

    if (fran.autentica(12345)) {
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autenticação")
    }

    val gui = Diretor(
            "Gui",
            "333.333.333-90",
            4000.0,
            1234,
            200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificacao ${gui.bonificacao}")
    println("plr ${gui.plr}")

    var maria = Analista(
            "Maria",
            "555.555.555-55",
            3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificacao: ${calculadora.total}")
}