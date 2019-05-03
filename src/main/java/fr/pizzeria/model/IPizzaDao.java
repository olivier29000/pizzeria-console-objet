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

	void saveNewPizza(Pizza pizza);

	void updatePizza(String codePizza, Pizza pizza);

	void deletePizza(String codePizza);

	Pizza findPizzaByCode(String codePizza);

	boolean pizzaExists(String codePizza);
}
