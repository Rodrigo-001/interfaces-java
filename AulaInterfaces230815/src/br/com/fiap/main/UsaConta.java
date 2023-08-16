package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.ContaPoupanca;

public class UsaConta {

	public static void main(String[] args) {
		String aux, escolha = "sim";
		int numConta, opcao;
		float saldo, valor;
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("Número da conta: ");
				numConta = Integer.parseInt(aux);
				aux = JOptionPane.showInputDialog("Saldo da conta: ");
				saldo = Float.parseFloat(aux);
				// mover o mouse encima da classe para mostrar documentação
				ContaPoupanca cp = new ContaPoupanca();
				cp.setNumConta(numConta);
				cp.setSaldo(saldo);
				aux = JOptionPane.showInputDialog("Escolha: \n1.Sacar\n2.Depositar");
				opcao = Integer.parseInt(aux);
				aux = JOptionPane.showInputDialog("Digite o valor: ");
				valor = Float.parseFloat(aux);
				switch (opcao) {
				case 1:
					JOptionPane.showMessageDialog(null, "Dados da conta: " + "\nNúmero da conta: " + cp.getNumConta()
							+ "\nSaldo atual: " + cp.sacar(valor));
					break;

				case 2:
					JOptionPane.showMessageDialog(null, "Dados da conta: " + "\nNúmero da conta: " + cp.getNumConta()
					+ "\nSaldo atual: " + cp.depositar(valor));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Escolha incorreta!");
					break;
				}
				escolha = JOptionPane.showInputDialog("Deseja continuar? ");
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Fim do programa!");
	}

}
