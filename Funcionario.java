import java.util.ArrayList;

public abstract class Funcionario {
	
	ArrayList<Funcionario> lista = new ArrayList();
	private String nome;
	private float salario;

	public Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	

	public boolean buscar(String nome) {
		for(Funcionario funcionario : lista){
			if(funcionario.getNome().equals(nome)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}


	public void adicionar(String nome) {
		if(buscar(funcionaro.getNome()) == true) {
			System.out.println("funcionário já cadastrado");
		}else {
			lista.add(funcionaro);
		}
	}

	public void remover(String nome) {
		if(buscar(funcionaro.getNome())== true) {
			lista.remove(funcionaro);
		}else {
			return;
		}
	}

	public void mostrar(String nome){
		if(buscar(funcionaro.getNome())== true) {
			System.out.println("Nome:" + funcionaro.getNome());
		}
	}

	public abstract float calculoSalario();
	
}
