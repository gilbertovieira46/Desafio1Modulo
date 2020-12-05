

fun main(){

val manager = DigitalHouseManager()

manager.criarAluno("William", "Lucas", 1)
manager.criarAluno("Marcelo", "Leandro", 2)
manager.criarAluno("Elias", "Maluco", 3)
manager.criarAluno("Andre", "do Rap", 4)
manager.criarAluno("Jorge", "Aragao", 5)

manager.registrarProfessorTitular("Silas", "Rodrigo", 1, 3, "Cálculo")
manager.registrarProfessorTitular("José", "Fernando", 2, 2, "Java")

manager.registrarProfessorAdjunto("Jorge", "Marcelo", 3, 12)
manager.registrarProfessorAdjunto("Juliano", "Rafael", 4, 11)

manager.registrarCurso("Full stack", 20001, 3)
manager.registrarCurso("Android", 20002, 2)

manager.alocarProfessores(20001, 1, 3)
manager.alocarProfessores(20002, 2, 4)

manager.matricularAluno(1, 20001)
manager.matricularAluno(2, 20001)
manager.matricularAluno(3, 20002)
manager.matricularAluno(4, 20002)
manager.matricularAluno(5, 20002)

}