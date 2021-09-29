package br.com.unicap.so.model;

public interface IRepositorioVaga {
	
	void add(String placa) throws Exception;
	
	void remove(String placa) throws Exception;
	
	long checkTime(String placa) throws Exception;
	
	String getList();
	
	void stopAll();

}
