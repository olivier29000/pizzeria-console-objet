package fr.pizzeria.model;

import java.util.Scanner;

import exception.DeletePizzaException;

public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao dao) throws DeletePizzaException {
		// TODO Auto-generated method stub
		System.out.println("Suppression d’une pizza");

		// Accès à la liste des pizzas
		System.out.println("Liste des pizzas");
		for (int i = 0; i < dao.findAllPizzas().size(); i++) {
			System.out.println(dao.findAllPizzas().get(i).toString());
		}

		// Recherche du code défini par l'utilisateur dans la liste des
		// pizzas

		String strCodePizzaModifier;
		System.out.println("Veuillez choisir le code de la pizza à modifier:");
		while (!dao.pizzaExists(strCodePizzaModifier = scanner.nextLine())) {
			System.out.println("Reférence de la pizza non trouvée");
			System.out.println("Veuillez choisir le code de la pizza à modifier:");

		}

		dao.deletePizza(strCodePizzaModifier);

		// Affichage de la liste des pizzas
		System.out.println("Liste des pizzas");
		for (int i = 0; i < dao.findAllPizzas().size(); i++) {
			System.out.println(dao.findAllPizzas().get(i).toString());
		}
	}

}
