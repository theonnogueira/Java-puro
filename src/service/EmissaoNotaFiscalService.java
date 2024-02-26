package service;

import modelo.Cliente;
import modelo.Produto;
import notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {

	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui...

		NotificadorEmail notificador = new NotificadorEmail();
		notificador.notificar(cliente, "Nota fiscal do produto" + produto.getNome() + "foi emitida!");
	}

}
