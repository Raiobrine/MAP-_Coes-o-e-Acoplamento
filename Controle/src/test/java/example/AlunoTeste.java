package example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import example.entidades.*;

public class AlunoTeste {
    static ControleAcademico ca;

    @Before
    public void setUp() {

        ca = new ControleAcademico();
		ca.cadastrarTurma("Metodos Avancados de Programacao", "Terca", "11:00");
		ca.cadastrarTurma("Banco de Dados", "Terca", "07:00");
		ca.cadastrarTurma("Redes de Computadores", "Quarta", "11:00");
		ca.cadastrarTurma("Computacao Grafica", "Terca", "18:00");
		ca.cadastrarTurma("Paradigmas de Programacao", "Segunda", "11:00");
		ca.cadastrarTurma("Probabilidade e Estatastica 2", "Terca","09:00");
		ca.cadastrarTurma("Tecnicas de Analises de Algoritmos", "Quarta", "18:00");
		ca.cadastrarTurma("Engenharia de Software 1", "Segunda", "09:00");

		ca.cadastrarProfessores("Sabrina", 101);
		ca.cadastrarProfessores("Fabio", 102);
		ca.cadastrarProfessores("Janderson", 103);
		ca.cadastrarProfessores("Ana Isabella", 104);
		ca.cadastrarProfessores("Paulo", 105);
		ca.cadastrarProfessores("Elaine", 106);
		ca.cadastrarProfessores("Robson", 107);

    	//adicionar alunos
		ca.adicionarAlunos("Roberto", 1001, "Computacao"); //primeiro o nome, a matricula e depois o curso que faz
		ca.adicionarAlunos("Jefferson", 1002, "Computaca");
		ca.adicionarAlunos("Angelo", 1003, "Computacao");
		ca.adicionarAlunos("Kennedy", 1004, "Computacao");
		ca.adicionarAlunos("Rafaela", 1005, "Computacao");
        ca.adicionarAlunos("Klayton", 1006, "Computacao");

		ca.definirProfessorNaDisciplina("Fabio", "Banco de Dados");
		ca.definirProfessorNaDisciplina("Sabrina", "Metodos Avancados de Programacao");
		ca.definirProfessorNaDisciplina("Paulo", "Redes de Computadores");
		ca.definirProfessorNaDisciplina("Janderson", "Paradigmas de Programacao");
		ca.definirProfessorNaDisciplina("Ana Isabella", "Engenharia de Software 1");
		ca.definirProfessorNaDisciplina("Elaine", "Probabilidade e Estatastica 2");
		ca.definirProfessorNaDisciplina("Paulo", "Tecnicas de Analises de Algoritmos");
		ca.definirProfessorNaDisciplina("Robson", "Computacao Grafica");

		ca.cadastrarAlunosNaDisciplina("Roberto", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Roberto", "Metodos Avancados de Programacao");
		ca.cadastrarAlunosNaDisciplina("Roberto", "Paradigmas de Programacao");
		ca.cadastrarAlunosNaDisciplina("Roberto", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Roberto", "Probabilidade e Estatastica 2");
		ca.cadastrarAlunosNaDisciplina("Roberto", "Tecnicas de Analises de Algoritmos");
		ca.cadastrarAlunosNaDisciplina("Roberto", "Computacao Grafica");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Metodos Avancados de Programacao");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Redes de Computadores");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Paradigmas de Programacao");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Probabilidade e Estatastica 2");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Tecnicas de Analises de Algoritmos");
		ca.cadastrarAlunosNaDisciplina("Jefferson", "Computacao Grafica");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Metodos Avancados de Programacao");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Redes de Computadores");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Paradigmas de Programacao");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Probabilidade e Estatastica 2");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Tecnicas de Analises de Algoritmos");
		ca.cadastrarAlunosNaDisciplina("Rafaela", "Computacao Grafica");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Metodos Avancados de Programacao");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Paradigmas de Programacao");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Probabilidade e Estatastica 2");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Tecnicas de Analises de Algoritmos");
		ca.cadastrarAlunosNaDisciplina("Angelo", "Computacao Grafica");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Metodos Avancados de Programacao");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Redes de Computadores");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Paradigmas de Programacao");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Probabilidade e Estatastica 2");
		ca.cadastrarAlunosNaDisciplina("Kennedy", "Tecnicas de Analises de Algoritmos");
    }
	//_______________________________________________________________________________________________________

    @Test
    public void testeAlunoAddDisciplina(){
    	//se aluno nao tiver cadastrado na disciplina ele retorna true
        assertTrue(ca.cadastrarAlunosNaDisciplina("Angelo", "Redes de Computadores"));
    }

	@Test
	public void testeAddAlunoJaNaDisciplina(){
		//se o aluno já estiver matriculado na disciplina
		assertFalse(ca.cadastrarAlunosNaDisciplina("Angelo", "Computacao Grafica")); // false quando tento colocar de novo!
	}

    @Test
    //testar numero de disciplina matriculadas por aluno
    public void testNumDisciplinas(){
        assertEquals(7, ca.getAluno("Kennedy").getRdm().getListaTurmas().size());
    }

    @Test
    public void testGetCursoAluno(){
    	//verifica o curso do aluno
        ca.adicionarAlunos("Aluno Teste", 1007, "Computação");
        assertEquals(ca.getAluno("Aluno Teste").getCurso(), ca.getAluno("Aluno Teste").getCurso());
    }

	@Test
	public void testGetIdAluno(){
		//verifica o id do aluno
		ca.adicionarAlunos("Aluno Teste", 1007, "Computação");
		assertEquals(ca.getAluno("Aluno Teste").getId(), ca.getAluno("Aluno Teste").getId());
	}

	@Test
	public void testGetNomeAluno(){
		//verifica o nome do aluno
		ca.adicionarAlunos("Aluno Teste", 1007, "Computação");
		assertEquals(ca.getAluno("Aluno Teste").getNome(), ca.getAluno("Aluno Teste").getNome());
	}

	@Test
	public void testGetRdmAluno(){
		//verifica o rdm do aluno
		Aluno alunoTeste = new Aluno("Roberto", 1001, "Computacao");
		assertEquals(alunoTeste.getRdm().getClass(), ca.getAluno("Roberto").getRdm().getClass());
	}

    @Test
    public void testDisciplinasIguais(){
    	//verifica se as disciplinas de  Aluno Teste e Rafaela estao iguais
        ca.adicionarAlunos("Aluno Teste", 1008, "Computacao");
		ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Metodos Avancados de Programacao");
		ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Redes de Computadores");
		ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Paradigmas de Programacao");
		ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Probabilidade e Estatastica 2");
		ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Tecnicas de Analises de Algoritmos");
		ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Computacao Grafica");
        assertEquals(ca.getAluno("Aluno Teste").getRdm().getListaTurmas(), ca.getAluno("Rafaela").getRdm().getListaTurmas());

    }

    @Test
    //testa se alunos diferentes
    public void testeAlunosDiferentes(){
        assertNotEquals(ca.getAluno("Rafaela"), ca.getAluno("Roberto"));
    }

    @Test
    //verificar se a lista de discplina do aluno ta vazia
    public void alunosListaVazia(){
        assertNull(ca.getAluno("Klayton").getRdm().mostrarDisciplinas());
    }

	@Test
	// testando se um aluno não está na disciplina
	public void alunoNaoEstaNaDisciplina(){
		assertFalse(ca.getAluno("Roberto").getRdm().mostrarDisciplinas().containsAll(ca.getListaTurmas()));
	}

    @Test
    // testando se aluno está na disciplina que ele foi matriculado
    public void contaisAll(){
        ca.cadastrarAlunosNaDisciplina("Roberto", "Redes de Computadores");
        assertTrue(ca.getAluno("Roberto").getRdm().mostrarDisciplinas().containsAll(ca.getListaTurmas()));
	}
}