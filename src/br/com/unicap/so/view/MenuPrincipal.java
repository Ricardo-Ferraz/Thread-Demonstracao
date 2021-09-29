package br.com.unicap.so.view;

import br.com.unicap.so.util.Leitor;

public class MenuPrincipal {
	
	
	
	public static void main(String[] args) {
		int opcao;
		ViewVaga acesso= new ViewVaga();
		do {
			System.out.println("*********************");
			System.out.println("1- Adicionar na Vaga");
			System.out.println("2- Remover da Vaga");
			System.out.println("3- Checar o tempo da Thread de uma vaga");
			System.out.println("4- Mostrar todos os tempos de Thread de todas as vagas");
			System.out.println("5- Sair");
			opcao= Leitor.getLeitor().nextInt();
			
			switch(opcao) {
				case 1:
					acesso.add();
					break;
				
				case 2:
					acesso.remove();
					break;
					
				case 3:
					acesso.checkTime();
					break;
					
				case 4:
					acesso.getList();
					break;
				
			}
			
		}while(opcao != 5);
		acesso.stopAll();
	}

}
