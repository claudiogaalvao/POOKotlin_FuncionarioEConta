package br.com.claudiogalvao.bytebank.modelo

class Diretor(
        nome : String,
        cpf: String,
        salario: Double,
        senha: Int,
        val plr: Double
) : FuncionarioAdmin(
        nome,
        cpf,
        salario,
        senha
) {
    override val bonificacao: Double get() { return salario + plr }
}