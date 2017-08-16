public class Main{
	public static void main(String[] args){
		

		Prova prova1=new Prova(4, 2.5);
		Prova prova2=new Prova(1, 7);
		Prova prova3=new Prova(6.5, 3.5);
		Prova prova4=new Prova(0, 3);
		Prova prova5=new Prova(5, 4);
		Prova prova6=new Prova(6, 1.5);
		Aluno aluno1 = new Aluno(prova1, prova2);
		System.out.println(aluno1.calcularMedia());
		/*prova1.setNotaParte1(6.5);
		prova1.setNotaParte2(3.5);
		prova2.setNotaParte1(0);
		prova2.setNotaParte2(3);*/
		Aluno aluno2 = new Aluno(prova3, prova4);
		System.out.println(aluno2.calcularMedia());
		/*prova1.setNotaParte1(5);
		prova1.setNotaParte2(4);
		prova2.setNotaParte1(6);
		prova2.setNotaParte2(2.5);*/
		Aluno aluno3 = new Aluno(prova5, prova6);
		System.out.println(aluno3.calcularMedia());
		Turma turma = new Turma(aluno1, aluno2, aluno3);
		
		System.out.println("Media do aluno 1: "+turma.getAluno1().calcularMedia());
		System.out.println("Media do aluno 2: "+turma.getAluno2().calcularMedia());
		System.out.println("Media do aluno 3: "+turma.getAluno3().calcularMedia());
		System.out.println("Media da turma: "+turma.calcularMedia());
	}
}
