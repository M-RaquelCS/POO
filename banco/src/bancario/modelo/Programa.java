package bancario.modelo;

import javax.swing.JOptionPane;

import bancario_excecao.ClienteJaCadastradoException;
import bancario_excecao.SaldoIndisponivelException;
import bancario_persistencia.PersistenciaEmArquivoCliente;

public class Programa {
	public static void main(String[] args) {
		
		PersistenciaEmArquivoCliente pac = new PersistenciaEmArquivoCliente();
		
		ICliente c1 = pac.localizarClientePorCPF("000");
		try {
			c1.buscarContaInvestimento("1A").sacar(10f);
		} catch (SaldoIndisponivelException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		System.out.println(c1);
		
		c1.buscarContaInvestimento("1A").depositar(10f);
		
		try {
			c1.buscarContaInvestimento("1A").sacar(100f);
		} catch (SaldoIndisponivelException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getStackTrace());
		}
		
}
}