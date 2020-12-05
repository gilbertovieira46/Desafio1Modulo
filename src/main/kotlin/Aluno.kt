data class Aluno(var nome: String,val sobreNome : String, val codigo : Int ){

    override fun equals(other: Any?): Boolean {
        if (other is Aluno) {
            return codigo == other.codigo
        }
        return false
    }

}


