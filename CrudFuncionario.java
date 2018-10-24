import java.util.ArrayList;

public class CrudFuncionario {

	ArrayList<Funcionario> lista = new ArrayList();
	Funcionario funcionaro;

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
}
