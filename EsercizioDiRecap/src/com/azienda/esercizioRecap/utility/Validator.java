package com.azienda.esercizioRecap.utility;

import com.azienda.esercizioRecap.exception.VeicoloNonValidoException;

public class Validator {
 public static void validatoreTipoVeicolo(String tipo) throws VeicoloNonValidoException{
	 if (tipo==null) throw new VeicoloNonValidoException("Tipo null");
	 String trimTipo = tipo.trim().toLowerCase();
	 if (!trimTipo.equals(Constants.AEREO) && !trimTipo.equals(Constants.TRENO) ) {
		 throw new VeicoloNonValidoException("Tipo veicolo non valido");
	 }
 }
}
