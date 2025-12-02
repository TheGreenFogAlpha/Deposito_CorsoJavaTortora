package com.azienda.esercizioRecap.model;

import com.azienda.esercizioRecap.exception.VeicoloNonValidoException;

public class Treno extends Veicolo {
	private Boolean regionale;

	public Treno(String modello, Float velocita, Boolean regionale) throws VeicoloNonValidoException {
		super(modello, velocita);
		if (velocita <= 0) throw new VeicoloNonValidoException("la velocita deve essere positiva");
		if (velocita < 30f || velocita > 350f) {
		throw new VeicoloNonValidoException("velocita out of range (30-350 km/h)");
		}
		if(modello.equalsIgnoreCase("Freccia Rossa") && regionale) {
			throw new VeicoloNonValidoException("Il Freccia Rossa non e' un treno regionale");
		}
		this.regionale = regionale;
	}

	public Boolean getRegionale() {
		return regionale;
	}

	public void setRegionale(Boolean regionale) {
		this.regionale = regionale;
	}

	@Override
	public String toString() {
		return "Treno [ "+super.toString()+" regionale=" + regionale + "]";
	}
	
	public void percorreBinari() {
		System.out.println("Il treno "+toString()+" e' sui binari!!!");
	}
	
	
	
}
