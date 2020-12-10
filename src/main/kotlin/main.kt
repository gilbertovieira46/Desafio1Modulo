

fun main(){

val DHM= DigitalHouseManager()

    DHM.criarAluno("William", "Lucas", 1)
    DHM.criarAluno("Marcelo", "Leandro", 2)
    DHM.criarAluno("Elias", "Maluco", 3)
    DHM.criarAluno("Andre", "do Rap", 4)
    DHM.criarAluno("Jorge", "Aragao", 5)

    DHM.registrarProfessorTitular("Silas", "Rodrigo", 1, 3, "Cálculo")
    DHM.registrarProfessorTitular("Jose", "Fernando", 2, 2, "Java")

    DHM.registrarProfessorAdjunto("Jorge", "Marcelo", 3, 12)
    DHM.registrarProfessorAdjunto("Juliano", "Rafael", 4, 11)

    DHM.registrarCurso("Full stack", 20001, 3)
    DHM.registrarCurso("Android", 20002, 2)

    DHM.alocarProfessores(20001, 1, 3)
    DHM.alocarProfessores(20002, 2, 4)

    DHM.matricularAluno(1, 20001)
    DHM.matricularAluno(2, 20001)
    DHM.matricularAluno(3, 20002)
    DHM.matricularAluno(4, 20002)
    DHM.matricularAluno(5, 20002)

}