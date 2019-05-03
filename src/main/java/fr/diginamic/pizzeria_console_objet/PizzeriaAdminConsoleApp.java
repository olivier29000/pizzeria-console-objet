package fr.diginamic.pizzeria_console_objet;

import java.util.Scanner;

import exception.StockageException;
import fr.pizzeria.model.AjouterPizzaService;
import fr.pizzeria.model.ListerPizzasService;
import fr.pizzeria.model.MenuService;
import fr.pizzeria.model.ModifierPizzaService;
import fr.pizzeria.model.PizzaMemDao;
import fr.pizzeria.model.SupprimerPizzaService;

public class PizzeriaAdminConsoleApp {

	/**
	 * Methode point d'entrée de l'application
	 * 
	 * @param args
	 *            non utilisé ici
	 * @throws StockageException
	 */
	public static void main(String[] args) throws StockageException {
		// TODO Auto-generated method stub

		// INITIALISATION
		// Création de la liste des pizzas
		PizzaMemDao dao = new PizzaMemDao();
		Scanner sc = new Scanner(System.in);
		int str;
		do {

			// Affichage du menu principal
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			str = Integer.parseInt(sc.nextLine());
			while (str != 1 && str != 2 && str != 3 && str != 4 && str != 99) {
				System.out.println("Veuillez saisir un chiffre entre 1, 2, 3, 4 ou 99 svp");
				str = Integer.parseInt(sc.nextLine());
			}

			System.out.println("Vous avez saisi le nombre : " + str);

			// Selection par l'utilisateur de l'option1
			// Accès à la liste des pizzas
			if (str == 1) {
				MenuService service = new ListerPizzasService();

				try {
					service.executeUC(sc, dao);
				} catch (StockageException msg) {
					System.out.println(msg.getMessage());
				}

				// Selection par l'utilisateur de l'option2
				// Ajout d'une nouvelle pizza
			} else if (str == 2) {
				MenuService service = new AjouterPizzaService();

				try {
					service.executeUC(sc, dao);
				} catch (StockageException msg) {
					System.out.println(msg.getMessage());
				}

				// Selection par l'utilisateur de l'option1
				// Modification d'une pizza déjà enregistrée
			} else if (str == 3) {
				MenuService service = new ModifierPizzaService();

				try {
					service.executeUC(sc, dao);
				} catch (StockageException msg) {
					System.out.println(msg.getMessage());
				}

			} else if (str == 4) {
				MenuService service = new SupprimerPizzaService();

				try {
					service.executeUC(sc, dao);
				} catch (StockageException msg) {
					System.out.println(msg.getMessage());
				}

			} else if (str == 99) {
				System.out.println("Aurevoir ☹");
			}

		} while (str != 99);

	}
}
