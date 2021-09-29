package br.com.unicap.so.model;

public class Vaga extends Thread{
	
	private String placa;
	private long tempo;
	
	public Vaga(String placa) {
		this.placa= placa;
		this.tempo= 0;
		this.start();
	}
	
	
	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public long getTempo() {
		return tempo;
	}


	public void setTempo(long tempo) {
		this.tempo = tempo;
	}
	
	public void pararThread() {
		this.stop();
	}

	@Override
	public void run() {
		while(true) {
			
			try {
				this.sleep(1000);
			}catch(Exception e) {
				e.getMessage();
			}
			this.tempo++;
		}
	}
	
	@Override
	public String toString() {
		return "Placa: "+this.placa+" / Tempo da Thread: "+this.tempo;
	}
}
