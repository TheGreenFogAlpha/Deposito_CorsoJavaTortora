package com.azienda.esercizioRecap.logic;

import java.util.Scanner;

import com.azienda.esercizioRecap.exception.VeicoloNonValidoException;
import com.azienda.esercizioRecap.model.Aereo;
import com.azienda.esercizioRecap.model.Treno;
import com.azienda.esercizioRecap.model.Veicolo;
import com.azienda.esercizioRecap.utility.Constants;
import com.azienda.esercizioRecap.utility.Input;
import com.azienda.esercizioRecap.utility.Validator;

public class VeicoloFactory {
	 public static Veicolo creaVeicolo (String s, Scanner sc) throws VeicoloNonValidoException {
		 Validator.validatoreTipoVeicolo(s);
		 String tipo = s.trim().toLowerCase();
		 
		 String modello = Input.readString(sc, "Inserisci il modello del veicolo");
		 Float vel = Input.readFloat(sc, "Inserisci velocita' media (km/h)");
		 
		 if (tipo.equals(Constants.AEREO)) {
			 boolean diLinea = Input.readBoolean(sc, "L'aereo e' di linea?");
			 return new Aereo(modello, vel, diLinea);
		 } else {
			 boolean regionale = Input.readBoolean(sc, "Il treno e' regionale?");
			 return new Treno(modello,vel,regionale);
		 }
	 }
}
