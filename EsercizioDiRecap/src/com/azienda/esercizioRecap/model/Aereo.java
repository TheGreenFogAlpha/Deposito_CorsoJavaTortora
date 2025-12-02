package com.azienda.esercizioRecap.model;

import com.azienda.esercizioRecap.exception.VeicoloNonValidoException;


public class Aereo extends Veicolo {

	private Boolean diLinea;

	public Aereo(String modello, Float velocita, Boolean diLinea) throws VeicoloNonValidoException {
		super(modello, velocita);
		
		if (velocita<=0) throw new VeicoloNonValidoException("la velocita deve essere positiva");
		if (velocita<200f ||  velocita>900f) {
			throw new VeicoloNonValidoException("Velocita out of range (200-900 km/h)");
		}
		
		if(modello.equalsIgnoreCase("Boeing 737") && !diLinea) {
			throw new VeicoloNonValidoException("Il boeing 737 deve essere di linea");
		}
		
		this.diLinea = diLinea;
	}

	@Override
	public String toString() {
		return "Aereo [ "+super.toString()+" diLinea=" + diLinea + "]";
	}

	public void vola() {
		System.out.println("L'aereo "+toString()+" sta volando!!!");
	}

	public Boolean getDiLinea() {
		return diLinea;
	}

	public void setDiLinea(Boolean diLinea) {
		this.diLinea = diLinea;
	}



}
