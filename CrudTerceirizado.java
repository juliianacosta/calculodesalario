
public class CrudTerceirizado extends CrudFuncionario {
	
	Terceirizado ter;
	
	public void adicionar(String nome , float horasTrabalhadas) {
		if(buscar(ter.getNome()) == true) {
			System.out.println("funcionário já cadastrado");
		}else {
			ter.setNome(nome);
			ter.setHorasTrabalhadas(horasTrabalhadas);;
			lista.add(ter);
		}
	}

	public void mostrar(String nome){
		if(buscar(servidor.getNome())== true) {
			System.out.println("sta:" + servidor.getNome() + "\n" + "nivel:" + servidor.getNivel() + "\n" + "Salario:" + servidor.getSalario() + "\n");
		}
	}
}
