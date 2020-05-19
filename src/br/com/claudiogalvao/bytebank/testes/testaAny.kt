package br.com.claudiogalvao.bytebank.testes

import br.com.claudiogalvao.bytebank.modelo.Endereco


private fun testaAny() {
    val endereco = Endereco("Rua Manoel Leopoldino", 400, "Esmeralda", "Gramado")
    val endereco2 = Endereco("Rua Visconde Sabugosa", 600, "Felicius", "Miquelangelo")

    println(endereco)
}