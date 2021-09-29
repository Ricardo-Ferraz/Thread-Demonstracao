package br.com.unicap.so.controller;

import br.com.unicap.so.model.IRepositorioVaga;
import br.com.unicap.so.model.RepositorioVaga;

public class ControllerVaga {
	
	private IRepositorioVaga repo = RepositorioVaga.getInstance();
	
	public void add(String placa) throws Exception{
		this.repo.add(placa);
	}
	
	public void remove(String placa) throws Exception{
		this.repo.remove(placa);
	}
	
	public long checkTime(String placa) throws Exception{
		return this.repo.checkTime(placa);
	}
	
	public String getList(){
		return this.repo.getList();
	}
	
	public void stopAll() {
		this.repo.stopAll();
	}

}
