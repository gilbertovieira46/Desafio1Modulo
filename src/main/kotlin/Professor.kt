//Parte C

abstract class Professor(
        val nome: String,
        val sobreNome: String,
        val tempoCasa: Int,
        val codProfessor: Int) {

//fim parte D
    override fun equals(other: Any?): Boolean {
        if (other is Professor){
            return codProfessor == other.codProfessor
    }
        return false
}
}