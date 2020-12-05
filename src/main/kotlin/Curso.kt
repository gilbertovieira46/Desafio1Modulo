//Parte B

data class Curso(val nome: String,
            val codCurso: Int,
            val qtdMaxAlunos: Int ){

    var alunosMatriculados = mutableListOf<Aluno>()

    var professorTitular: ProfTitular? = null
    var professorAdj: ProfessorAdj? = null

    override fun equals(other: Any?): Boolean {
        if (other is Curso)
            return codCurso == other.codCurso
            return false
    }
    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (alunosMatriculados.size < qtdMaxAlunos) {
            alunosMatriculados.add(umAluno)
            return true
        }
        return false
    }

    fun excluirUmAluno(aluno: Aluno) {
        alunosMatriculados.remove(aluno)
    }


}
