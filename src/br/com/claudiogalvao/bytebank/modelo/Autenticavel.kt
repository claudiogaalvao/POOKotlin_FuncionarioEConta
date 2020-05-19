package br.com.claudiogalvao.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}