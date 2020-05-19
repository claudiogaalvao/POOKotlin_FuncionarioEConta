package br.com.claudiogalvao.bytebank.modelo

class Cliente(
        var nome: String,
        val cpf: String,
        protected val senha: Int,
        var endereco: Endereco = Endereco()
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha) {
            return true
        }
        return false
    }
}