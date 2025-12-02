package com.azienda.esercizioRecap.logic;

import com.azienda.esercizioRecap.model.Aereo;
import com.azienda.esercizioRecap.model.Veicolo;

public class CalcoloTempiAereo extends AstrattaCalcolaTempi{
	@Override
	public void informazioniMovimento(Veicolo veicolo) {
		if(veicolo instanceof Aereo) {
			((Aereo) veicolo).vola();
		} else {
			System.out.println("Veicolo non aereo ricevuto: "+ veicolo.getClass());
		}
	}
}
