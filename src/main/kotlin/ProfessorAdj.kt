//Parte D

class ProfessorAdj(
         nome: String,
         sobrenome: String,
         tempoCasa: Int,
         codProfessor: Int,
         val horasMonitoria: Int
        ):
        Professor(nome,sobrenome,tempoCasa,codProfessor) {
}