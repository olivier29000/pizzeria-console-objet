package fr.pizzeria.model;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

	public static final Logger LOG = LoggerFactory.getLogger(MenuService.class);

	/**
	 * Methode Logging permettant d'espionner les moindres faits et gestes de
	 * l'utilisateur exemple: l'utilisateur vient de supprimer telle pizza les
	 * informations sont stockés dans le fichier "app.log"
	 * 
	 * @param param
	 */
	public abstract void executer(String param);

	public MenuService() {
		// TODO Auto-generated constructor stub
	}
}
