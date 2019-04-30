package fr.pizzeria.model;

public class Pizza {

	private static int id = 0;
	private String code;
	private String libelle;
	private double prix;

	/**
	 * Constructeur de la classe pizza
	 * 
	 * @param id
	 * @param code
	 * @param libelle
	 * @param prix
	 */
	public Pizza(String code, String libelle, double prix) {

		id++;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}

}
