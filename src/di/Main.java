package di;

import modelo.Cliente;
import notificacao.Notificador;
import notificacao.NotificadorSMS;
import service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@email.com", "81988445566");
		Cliente maria = new Cliente("Maria", "maria@email.com", "81987530841");

		Notificador notificador = new NotificadorSMS();

		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	}

}
