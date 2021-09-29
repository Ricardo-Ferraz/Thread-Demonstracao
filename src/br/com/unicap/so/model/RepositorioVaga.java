package br.com.unicap.so.model;

import java.util.ArrayList;
import java.util.List;

public class RepositorioVaga implements IRepositorioVaga {
	
	private List<Vaga> list;
	private static RepositorioVaga instance;
	
	private RepositorioVaga() {
		this.list= new ArrayList<Vaga>();
	}
	
	public static RepositorioVaga getInstance() {
		if(instance == null) {
			instance = new RepositorioVaga();
		}
		return instance;
	}

	@Override
	public void add(String placa) throws Exception {
		int pos= search(placa);
		
		if(pos != -1) {
			throw new Exception("Placa já existente");
		}
		Vaga v = new Vaga(placa);
		this.list.add(v);
	}

	@Override
	public void remove(String placa) throws Exception {
		int pos= search(placa);
		
		if(pos == -1) {
			throw new Exception("Placa não existente");
		}
		this.list.get(pos).pararThread();
		this.list.remove(pos);
	}

	@Override
	public long checkTime(String placa) throws Exception {
		int pos= search(placa);
		
		if(pos == -1) {
			throw new Exception("Placa não existente");
		}
		
		return this.list.get(pos).getTempo();
	}

	@Override
	public String getList(){
		StringBuffer buffer= new StringBuffer();
		for(Vaga v : this.list) {
			buffer.append(v).append("\n");
		}
		
		return buffer.toString();
	}
	
	public void stopAll() {
		for(Vaga v : list) {
			v.pararThread();
		}
	}
	
	private int search(String placa) {
		for(int i=0; i < this.list.size(); i++) {
			if(this.list.get(i).getPlaca().equals(placa)) {
				return i;
			}
		}
		
		return -1;
	}

}
