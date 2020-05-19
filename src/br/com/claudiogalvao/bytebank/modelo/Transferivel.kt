package br.com.claudiogalvao.bytebank.modelo

interface Transferivel {
    
    fun transfere(valor: Double, destino: Conta, senha: Int)
}