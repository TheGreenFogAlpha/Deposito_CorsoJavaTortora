package com.azienda.esercizioRecap.logic;

import com.azienda.esercizioRecap.model.Veicolo;

public abstract class AstrattaCalcolaTempi implements CalcolaTempi {
	@Override
	public Float calcolaTempiPercorrenza(Veicolo veicolo, Float distanza) {
		if (veicolo==null) throw new IllegalArgumentException("veicolo Null");
		if(veicolo.getVelocita()==null||veicolo.getVelocita()<=0F) throw new IllegalArgumentException("Velocita' non valida");
		return distanza/veicolo.getVelocita();
	}
	
	@Override
	public void informazioniMovimento(Veicolo veicolo) {

	}
}
