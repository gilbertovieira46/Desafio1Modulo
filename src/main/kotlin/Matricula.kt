import java.text.SimpleDateFormat
import java.util.*

//Parte F


data class Matricula(val aluno: Aluno, val curso: Curso,) {

   private val formatador = SimpleDateFormat("dd/MM/yyyy")
    val dataMatricula= formatador.format(Date())//porque nao pode usar dentro ()

    init {
             println("Matricula do aluno ${aluno.nome} ${aluno.sobreNome}realizada com Sucesso no " +
                     "curso de ${curso.nome} no dia ${dataMatricula}) seja bem vindo " )}

    }
