
public class Main{
	public static void main(String[] args){
		
		Prova prova1=new Prova();
		Prova prova2=new Prova();
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		Turma turma = new Turma(); 
		System.out.println(turma.getAluno1().calcularMedia());
		
		System.out.println("Media do aluno 1: "+turma.getAluno1.calcularMedia())
		System.out.println("Media do aluno 2: "+turma.getAluno2.calcularMedia())
		System.out.println("Media do aluno 3: "+turma.getAluno3.calcularMedia())
		System.out.println("Media da turma: "+turma.calcularMedia());
	}
}
