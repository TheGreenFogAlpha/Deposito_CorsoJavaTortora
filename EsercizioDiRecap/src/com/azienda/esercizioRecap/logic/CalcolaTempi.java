package com.azienda.esercizioRecap.logic;

import com.azienda.esercizioRecap.model.Veicolo;

public interface CalcolaTempi {
	public Float calcolaTempiPercorrenza(Veicolo veicolo, Float distanza);
	public void informazioniMovimento(Veicolo veicolo); 
}
