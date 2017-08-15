public class Turma{
	private Aluno aluno1;
	private Aluno aluno2;
	private Aluno aluno3;
	
	public Turma(){
		aluno1=new Aluno();
		aluno2=new Aluno();
		aluno3=new Aluno();
	}
	
	public Turma(Aluno aluno1, Aluno aluno2, Aluno aluno3){
		this.aluno1=aluno1;
		this.aluno2=aluno2;
		this.aluno3=aluno3;
	}
	
	public void setAluno1(Aluno aluno1){
		this.aluno1=aluno1;
	}
	public void setAluno2(Aluno aluno2){
		this.aluno2=aluno2;
	}
	public void setAluno3(Aluno aluno3){
		this.aluno3=aluno3;
	}
	public Aluno getAluno1(){
		return aluno1;
	}
	public Aluno getAluno2(){
		return aluno2;
	}
	public Aluno getAluno3(){
		return aluno3;
	}
	public double calcularMedia(){
		return (getAluno1().calcularMedia()+getAluno2().calcularMedia()+getAluno3().calcularMedia())/3;
	}
}
