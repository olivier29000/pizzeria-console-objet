package fr.pizzeria.model;

/**
 * @author Diginamic02
 *
 */
public class Pizza {

	/**id : int _ identifiant unique de l'objet pizza*/
	private int id = 0;
	/**code : String _ code unique de l'objet pizza */
	private String code;
	/**libelle : String _ identifiant unique de l'objet pizza */
	private String libelle;
	/**prix : double _ identifiant unique de l'objet pizza */
	private double prix;
	
	/**compteur : int_ variable permettant de générer un id unique pour chaque pizza */
	private static int compteur=0;
	
	/**Constructeur
	 * @param code
	 * @param libelle
	 * @param prix
	 */
	public Pizza(String code, String libelle, double prix) {

		
		this.id=compteur;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		compteur++;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter
	 * 
	 * @param libelle
	 *            the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		Pizza.id = id;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Setter
	 * 
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * Setter
	 * 
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

}
