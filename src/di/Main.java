package di;

import modelo.Cliente;
import service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@email.com", "81988445566");
		Cliente maria = new Cliente("Maria", "maria@email.com", "81987530841");
		
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService();
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	}

}
