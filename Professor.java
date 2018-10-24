
public class Professor extends Funcionario {

	private char classe;

	public Professor(String nome, float salario, char classe) {
		super(nome, salario);
		this.classe = classe;
		// TODO Auto-generated constructor stub
	}

	public char getClasse() {
		return classe;
	}

	public void setClasse(char classe) {
		this.classe = classe;
	}

	@Override
	public float calculoSalario() {
		switch(classe) {

		case  'A':
			this.setSalario(3000);
			break;

		case  'B':
			this.setSalario(5000);
			break;

		case  'C':
			this.setSalario(7000);
			break;

		case  'D':
			this.setSalario(9000);
			break;

		case  'E':
			this.setSalario(11000);
			break;
		}
		return 0;
	}


}
