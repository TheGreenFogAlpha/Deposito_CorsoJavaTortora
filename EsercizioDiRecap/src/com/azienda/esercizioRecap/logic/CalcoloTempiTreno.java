package com.azienda.esercizioRecap.logic;

import com.azienda.esercizioRecap.model.Treno;
import com.azienda.esercizioRecap.model.Veicolo;

public class CalcoloTempiTreno extends AstrattaCalcolaTempi{
	@Override
	public void informazioniMovimento(Veicolo veicolo) {
		if (veicolo instanceof Treno) {
			((Treno)veicolo).percorreBinari();
		} else {
			System.out.println("Veicolo non trenp ricevuto: "+ veicolo.getClass());
		}
	}
}
