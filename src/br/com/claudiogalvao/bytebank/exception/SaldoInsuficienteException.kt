package br.com.claudiogalvao.bytebank.exception

class SaldoInsuficienteException(mensagem: String = "Saldo é insuficiente"): Exception(mensagem)