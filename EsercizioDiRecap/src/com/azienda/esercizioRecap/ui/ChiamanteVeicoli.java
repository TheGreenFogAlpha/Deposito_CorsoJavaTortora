package com.azienda.esercizioRecap.ui;


import java.util.Scanner;

import com.azienda.esercizioRecap.exception.VeicoloNonValidoException;
import com.azienda.esercizioRecap.logic.CalcolaTempi;
import com.azienda.esercizioRecap.logic.CalcoloTempiAereo;
import com.azienda.esercizioRecap.logic.CalcoloTempiTreno;
import com.azienda.esercizioRecap.logic.VeicoloFactory;
import com.azienda.esercizioRecap.model.Aereo;
import com.azienda.esercizioRecap.model.Treno;
import com.azienda.esercizioRecap.model.Veicolo;
import com.azienda.esercizioRecap.utility.Input;

public class ChiamanteVeicoli {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {


			String s=null;
			do {
				System.out.println("Scrivi aereo o treno per creare il rispettivo veicolo \t( esc termina il programma )");
				s=sc.nextLine().trim();
				if(s==null) continue;
				if(s.trim().equalsIgnoreCase("esc")) {
					break;
				}
				try {
					Veicolo v=VeicoloFactory.creaVeicolo(s, sc);
					Float distanza = Input.readFloat(sc, "Quanta distanza percorre in km?");

					CalcolaTempi c=null;
					if (v instanceof Aereo) {
						c=new CalcoloTempiAereo();
					} else if(v instanceof Treno){
						c=new CalcoloTempiTreno();
					}

					System.out.println(v.toString());
					c.informazioniMovimento(v);
					Float ore =c.calcolaTempiPercorrenza(v, distanza);
					System.out.println("tempo di percorrenza "+ ore);




				} catch(VeicoloNonValidoException e){
					System.out.println("attenzione: "+e.getMessage());
				}

			}while(!s.equalsIgnoreCase("esc"));
			System.out.println("Programma Terminato!");


		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("errore imprevisto" +e.getMessage());
		}
	}

	}
