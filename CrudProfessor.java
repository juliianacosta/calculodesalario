import java.util.ArrayList;

public class CrudProfessor extends CrudFuncionario {
	
	//ArrayList<Professor> lista = new ArrayList();
	Professor professor;

	
	public void adicionar(String nome , char classe) {
		if(buscar(professor.getNome()) == true) {
			System.out.println("funcionário já cadastrado");
		}else {
			professor.setNome(nome);
			professor.setClasse(classe);
			lista.add(professor);
		}
	}

	public void mostrar(String nome){
		if(buscar(professor.getNome())== true) {
			System.out.println("Prof:" + professor.getNome() + "\n" + "Classe:" + professor.getClass() + "\n" + "Salario:" + professor.getSalario() + "\n");
		}
	}
}
