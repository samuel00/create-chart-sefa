package sml.create.charts.modelo;

import java.io.Serializable;

public class TempoExecucaoMetodo implements Serializable{
	
	private static final long serialVersionUID = -4605023583356950562L;
	
	private Double media;
	private String metodo;
	
	public Double getMedia() {
		return media;
	}
	
	public void setMedia(Double media) {
		this.media = media;
	}
	
	public String getMetodo() {
		return metodo;
	}
	
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	
	
}
