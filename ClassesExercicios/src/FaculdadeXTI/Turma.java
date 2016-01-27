package FaculdadeXTI;

	class Turma {
	Aluno[] alunos;
	    void imprimeValor () {
	    	for (int i =0 ; i < this.alunos.length ; i++){
	    		Aluno aluno = this.alunos[i];
	    		System.out.println(aluno.nota);
	    	}
	    }
	
	}
	
	class Aluno{
		String nome;
		int nota;
		
		
	}
	
	class Teste {
	
		public static void main(String[] args) {
			
		Turma fj11 = new Turma();
		fj11.alunos = new Aluno[10];
		

		fj11.alunos[0] = new Aluno();
		fj11.alunos[0].nome = "Matheus";
		fj11.alunos[0].nota=1;
		fj11.alunos[0] = new Aluno();
		fj11.alunos[1].nome= "Marcos";
		fj11.alunos[1].nota=2;
		
		
		}
	}
		
		
	
	
	
