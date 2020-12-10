
class DigitalHouseManager {

   private val cursos = mutableListOf<Curso>()
   private val alunos = mutableListOf<Aluno>()
   private val professores = mutableListOf<Professor>()
   private val matriculas = mutableListOf<Matricula>()


  fun registrarCurso(nome: String, codigoCurso: Int,
                      quantidadeMaximaDeAlunos: Int) {
      val curso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
      cursos.add(curso)}

  fun excluirCurso(codigoCurso: Int) {
      for (curso in cursos) {
         if (curso.codCurso == codigoCurso) {
            cursos.remove(curso)
         }
      }
  }
   fun registrarProfessorAdjunto(
                    nome: String, sobrenome: String,
                    codigoProfessor: Int, quantidadeDeHoras: Int) {
               val professorAdjunto = ProfessorAdj(nome, sobrenome,
                       0, codigoProfessor, quantidadeDeHoras)
               professores.add(professorAdjunto)
            }

   fun registrarProfessorTitular(
                    nome: String, sobrenome: String,
                    codigoProfessor: Int, tempoDeCasa: Int, especialidade: String
            ) {
     val professorTitular = ProfTitular(nome, sobrenome, tempoDeCasa,
             codigoProfessor, especialidade)
     professores.add(professorTitular)
  }

   fun excluirProfessor(codigoProfessor: Int) {
          for (prof in professores) {
             if (prof.codProfessor == codigoProfessor) {
                professores.remove(prof)

       }      }}
   fun criarAluno(nome: String, sobrenome: String, codigoAluno:
             Int) {
                val aluno = Aluno(nome, sobrenome, codigoAluno)
                alunos.add(aluno)
             }
   fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
                var alunoEncontrado: Aluno? = null
                var cursoEncontrado: Curso? = null

                for (aluno in alunos) {
                   if (aluno.codigo == codigoAluno) {
                      alunoEncontrado = aluno
                   }
                   for (curso in cursos) {
                      if (curso.codCurso == codigoCurso) {
                         cursoEncontrado = curso
                      }
                   }
                   if (alunoEncontrado != null && cursoEncontrado != null) {
                      val realizadoComSucesso = cursoEncontrado.adicionarUmAluno(alunoEncontrado)
                      if (realizadoComSucesso) {

                         val matricula = Matricula(alunoEncontrado, cursoEncontrado)
                         matriculas.add(matricula)
                      } else {
                         println(" não há mais vagas disponíveis neste curso.")
                      }
                   }
                }
             }



   fun alocarProfessores(
           codigoCurso: Int,
           codigoProfessorTitular: Int,
           codigoProfessorAdjunto: Int
         ) {
            var cursoEncontrado: Curso? = null
            var professorTitularEncontrado: ProfTitular? = null
            var professorAdjuntoEncontrado: ProfessorAdj? = null
            for (curso in cursos) {
               if (curso.codCurso == codigoCurso) {
                  cursoEncontrado = curso
               }

               for (prof in professores) {
                  if (prof.codProfessor == codigoProfessorTitular && prof is ProfTitular) {
                     professorTitularEncontrado = prof
                  }
                  if (prof.codProfessor == codigoProfessorAdjunto && prof is ProfessorAdj) {
                     professorAdjuntoEncontrado = prof
                  }
               }

               if (cursoEncontrado != null) {
                  if (professorAdjuntoEncontrado != null) {
                     cursoEncontrado.professorAdj = professorAdjuntoEncontrado
                     println("Professor adjunto ${professorAdjuntoEncontrado.nome} alocado no curso de ${cursoEncontrado.nome}")
                  }
                  if (professorTitularEncontrado != null) {
                     cursoEncontrado.professorTitular = professorTitularEncontrado
                     println("Professor titular ${professorTitularEncontrado.nome} alocado no curso de ${cursoEncontrado.nome}")
                  }
               }
            }}}












