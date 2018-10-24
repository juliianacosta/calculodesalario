
public class Terceirizado extends Funcionario {

	private float horasTrabalhadas;
	
	public Terceirizado(String nome, float salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public float calculoSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
