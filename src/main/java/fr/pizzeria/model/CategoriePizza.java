/**
 * 
 */
package fr.pizzeria.model;

/**
 * @author Diginamic02
 *
 */
public enum CategoriePizza {

	VIANDE(1, "Viande"), POISSON(2, "Poisson"), SANS_VIANDE(3, "Sans Viande");

	private String typeDePizza;
	private int codePizza;

	/**
	 * Constructeur
	 * 
	 * 
	 * 
	 * @param codePizza
	 * @param typeDePizza
	 */
	private CategoriePizza(int codePizza, String typeDePizza) {
		this.typeDePizza = typeDePizza;
		this.codePizza = codePizza;
	}

	/**
	 * @return the typeDePizza
	 */
	public String getTypeDePizza() {
		return typeDePizza;
	}

	/**
	 * Setter
	 * 
	 * @param typeDePizza
	 *            the typeDePizza to set
	 */
	public void setTypeDePizza(String typeDePizza) {
		this.typeDePizza = typeDePizza;
	}

	/**
	 * @return the codePizza
	 */
	public int getCodePizza() {
		return codePizza;
	}

	/**
	 * Setter
	 * 
	 * @param codePizza
	 *            the codePizza to set
	 */
	public void setCodePizza(int codePizza) {
		this.codePizza = codePizza;
	}
}
