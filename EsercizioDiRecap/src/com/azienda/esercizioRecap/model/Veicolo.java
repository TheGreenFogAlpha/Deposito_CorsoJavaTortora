package com.azienda.esercizioRecap.model;

public class Veicolo {
private String modello;
private Float velocita;

public Veicolo(String modello, Float velocita) {
	super();
	this.modello = modello;
	this.velocita = velocita;
}

public String getModello() {
	return modello;
}

public void setModello(String modello) {
	this.modello = modello;
}

public Float getVelocita() {
	return velocita;
}

public void setVelocita(Float velocita) {
	this.velocita = velocita;
}

@Override
public String toString() {
	return "Veicolo [modello=" + modello + ", velocita=" + velocita + "]";
}


}
