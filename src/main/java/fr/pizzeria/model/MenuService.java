package fr.pizzeria.model;

import java.util.Scanner;

import exception.StockageException;

public abstract class MenuService {
	/**
	 * Methode
	 * 
	 * Execution d'un cas d'utilisation du menu de la gestion de la pizzeria.
	 * 
	 * @param scanner
	 *            permet d'intéragir avec l'utilisateur
	 * @param dao
	 *            gère la persistance des pizzas
	 * @throws StockageException
	 *             si l'utilisateur saisit une information incorrecte lors de
	 *             l'execution d'un cas d'utilisation
	 */
	public abstract void executeUC(Scanner scanner, PizzaMemDao dao) throws StockageException;

	public MenuService() {
		// TODO Auto-generated constructor stub
	}
}
