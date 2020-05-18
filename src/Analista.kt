class Analista(
        nome : String,
        cpf: String,
        salario: Double
) : Funcionario(
        nome,
        cpf,
        salario
) {
    override val bonificacao: Double get() { return salario * 0.1 }

}