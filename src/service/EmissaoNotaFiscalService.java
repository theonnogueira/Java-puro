package service;

import modelo.Cliente;
import modelo.Produto;
import notificacao.Notificador;
import notificacao.NotificadorEmail;
import notificacao.NotificadorSMS;

public class EmissaoNotaFiscalService {
	
	private Notificador notificador;

	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui...

		this.notificador.notificar(cliente, "Nota fiscal do produto" + produto.getNome() + "foi emitida!");
	}

}
