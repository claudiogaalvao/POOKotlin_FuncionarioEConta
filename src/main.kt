fun main() {

    val contaCorrente = ContaCorrente("Andreza", 1000)
    val contaPoupanca = ContaPoupanca("Paola", 1001)
    val contaSalario = ContaSalario("Marcos", 1002)

    contaCorrente.deposita(2000.0)
    contaPoupanca.deposita(3000.0)
    contaSalario.deposita(1200.0)

    contaPoupanca.transfere(1500.0, contaCorrente)
    contaCorrente.transfere(500.0, contaPoupanca)

    println("Saldo conta corrente ${contaCorrente.saldo}")
    println("Saldo conta poupanca ${contaPoupanca.saldo}")
    println("Saldo conta salario ${contaSalario.saldo}")

}



