
public class Servidor extends Funcionario{

	private int nivel;
	
	public Servidor(String nome, float salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	public float calculoSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
