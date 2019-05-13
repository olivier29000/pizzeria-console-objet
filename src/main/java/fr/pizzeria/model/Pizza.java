package fr.pizzeria.model;

/**
 * @author Diginamic02 Représente une Pizza
 */
public class Pizza {

	/** id : int _ identifiant unique de l'objet pizza */
	private int id = 0;
	/** code : String _ code unique de l'objet pizza */
	private String code;
	/** libelle : String _ identifiant unique de l'objet pizza */
	private String libelle;
	/** prix : double _ identifiant unique de l'objet pizza */
	private double prix;
	/** categoriePizza : CategoriePizza */
	private CategoriePizza categoriePizza;

	/**
	 * compteur : int_ variable permettant de générer un id unique pour chaque
	 * pizza
	 */
	private static int compteur = 0;

	/**
	 * Constructeur
	 * 
	 * @param code
	 * @param libelle
	 * @param prix
	 * @param categoriePizza
	 */
	public Pizza(String code, String libelle, double prix, CategoriePizza categoriePizza) {

		this.id = compteur;
		this.categoriePizza = categoriePizza;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		compteur++;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString() La nouvelle méthode toString retourne
	 * une donnée du type "PEP -> Pépéroni (12.50 €)" permettant d'afficher plus
	 * simplement les differentes pizzas.
	 */
	public String toString() {
		return this.code + " -> " + this.libelle + " (" + this.prix + ") " + this.categoriePizza;
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
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + id;
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prix);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (id != other.id)
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (Double.doubleToLongBits(prix) != Double.doubleToLongBits(other.prix))
			return false;
		return true;
	}

	/**
	 * @return the categoriePizza
	 */
	public CategoriePizza getCategoriePizza() {
		return categoriePizza;
	}

	/**
	 * Setter
	 * 
	 * @param categoriePizza
	 *            the categoriePizza to set
	 */
	public void setCategoriePizza(CategoriePizza categoriePizza) {
		this.categoriePizza = categoriePizza;
	}

}
