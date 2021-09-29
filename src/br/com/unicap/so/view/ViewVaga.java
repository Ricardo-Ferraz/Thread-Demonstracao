package br.com.unicap.so.view;

import br.com.unicap.so.controller.ControllerVaga;
import br.com.unicap.so.util.Leitor;

public class ViewVaga {
	
	private ControllerVaga controller = new ControllerVaga();
	
	public void add() {
		
		try {
			System.out.println("Informe a placa a ser adicionada: ");
			String placa = Leitor.getLeitor().next();
			this.controller.add(placa);
			System.out.println("Placa adicionada com sucesso! A Thread começou a contar!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void remove(){
		
		try {
			System.out.println("Informe a placa a ser removida: ");
			String placa = Leitor.getLeitor().next();
			this.controller.remove(placa);
			System.out.println("A placa foi removida com sucesso e sua Thread foi encerrada!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void checkTime() {
		
		try {
			System.out.println("Informe a placa para checar o tempo da Thread ativa: ");
			String placa = Leitor.getLeitor().next();
			long time= this.controller.checkTime(placa);
			System.out.println("A Thread da placa informada está ativa a: "+time+" segundos");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void getList() {
		System.out.println("Todas as Thread com placas ativas: ");
		System.out.println(this.controller.getList());
	}
	
	public void stopAll() {
		this.controller.stopAll();
	}

}
