package br.com.claudiogalvao.bytebank.modelo

abstract class Funcionario(
        val nome : String,
        val cpf: String,
        val salario: Double
) {
    abstract val bonificacao: Double


}