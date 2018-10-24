
public class crudSta extends CrudFuncionario {

	Servidor servidor;
	
	public void adicionar(String nome , int nivel) {
		if(buscar(servidor.getNome()) == true) {
			System.out.println("funcionário já cadastrado");
		}else {
			servidor.setNome(nome);
			servidor.setNivel(nivel);;
			lista.add(servidor);
		}
	}

	public void mostrar(String nome){
		if(buscar(servidor.getNome())== true) {
			System.out.println("sta:" + servidor.getNome() + "\n" + "nivel:" + servidor.getNivel() + "\n" + "Salario:" + servidor.getSalario() + "\n");
		}
	}
	
}
