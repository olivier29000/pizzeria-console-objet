/**
 * 
 */
package fr.pizzeria.model;

import java.util.List;

/**
 * @author Diginamic02
 *
 */
public interface IPizzaDao {
	List<Pizza> findAllPizzas();

	/**
	 * Methode crée une nouvelle pizza et l'intègre à l'arrayList contenant
	 * toutes les pizzas
	 * 
	 * @param pizza
	 */
	void saveNewPizza(Pizza pizza);

	/**
	 * Methode
	 * 
	 * @param codePizza
	 * @param pizza
	 *            Remplace une pizza prédéfinit par une autre pizza
	 */
	void updatePizza(String codePizza, Pizza pizza);

	/**
	 * Methode
	 * 
	 * @param codePizza
	 * 
	 *            Supprime une pizza définit dans l'arrayList contenant les
	 *            pizzas
	 */
	void deletePizza(String codePizza);

	/**
	 * Methode
	 * 
	 * @param codePizza
	 * @return Trouve et retourne une pizza dans l'arrayList contenant toutes
	 *         les pizzas en fonction d'un code défini
	 */
	Pizza findPizzaByCode(String codePizza);

	/**
	 * Methode
	 * 
	 * @param codePizza
	 * @return
	 * 
	 * 		Renvoi true ou false sur l'existence d'une pizza dans l'arrayList
	 *         contenant toutes les pizzas
	 */
	boolean pizzaExists(String codePizza);
}
