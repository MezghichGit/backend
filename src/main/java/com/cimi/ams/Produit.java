package com.cimi.ams;

public class Produit {
String nom;
double prix;
public Produit(String nom, double prix) {
	super();
	this.nom = nom;
	this.prix = prix;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
}
