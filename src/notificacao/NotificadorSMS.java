package notificacao;

import modelo.Cliente;

public class NotificadorSMS {

	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS atrav�s do telefone %s: %s\n", cliente.getNome(),
				cliente.getTelefone(), mensagem);
	}

}
