package br.com.claudiogalvao.bytebank.teste

import br.com.claudiogalvao.bytebank.modelo.Cliente
import br.com.claudiogalvao.bytebank.modelo.Diretor
import br.com.claudiogalvao.bytebank.modelo.Gerente
import br.com.claudiogalvao.bytebank.modelo.SistemaInterno

fun testaInterfaceAutentica() {
    val gerente = Gerente(
            "Alex",
            "444.444.444-44",
            4000.0,
            1234
    )

    val diretora = Diretor(
            "Patricia",
            "555.555.555-55",
            8000.0,
            123456,
            2000.0
    )

    val cliente = Cliente(
            "Giovanne",
            "666.666.666-66",
            1234
    )

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(gerente, 1234)
    sistemaInterno.entra(diretora, 123456)
    sistemaInterno.entra(cliente, 1234)
}