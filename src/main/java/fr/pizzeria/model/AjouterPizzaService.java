package fr.pizzeria.model;

import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

import exception.StockageException;

/**
 * 
 * Execute le cas d'utilisation "2": Ajouter une nouvelle Pizza
 * 
 * @author Diginamic02
 *
 */
public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao dao) throws StockageException {
		// TODO Auto-generated method stub

		System.out.println("Ajout d’une nouvelle pizza");

		// Definition par l'utilisateur du code de la nouvelle pizza
		System.out.println("Veuillez saisir le code :");
		System.out.println("Au moins 3 caractères");
		String strCode = scanner.nextLine();
		if (strCode.length() < 3) {
			throw new StockageException("Au moins 3 caractères");
		}

		System.out.println("Vous avez saisi le code " + strCode.substring(0, 3));

		// Definition par l'utilisateur du nom de la nouvelle pizza
		System.out.println("Veuillez saisir le nom (sans espace) :");
		System.out.println("Au moins 5 caractères, maximum 15 caractères");
		String strNom = scanner.nextLine();

		if (strNom.length() < 6) {
			throw new StockageException("Au moins 5 caractères");
		}

		if (strNom.length() > 15) {
			strNom = strNom.substring(0, 15);
		}
		System.out.println("Vous avez saisi le nom " + strNom);

		// Definition par l'utilisateur du prix de la nouvelle pizza
		System.out.println("Veuillez saisir le prix (sans espace) :");
		System.out.println("supérieur à 0");

		String strPrixVerif = scanner.nextLine();
		if (!NumberUtils.isCreatable(strPrixVerif)) {
			throw new StockageException("le prix doit être un chiffre");
		}
		double strPrix = Double.parseDouble(strPrixVerif);

		if (strPrix < 0) {
			throw new StockageException("supérieur à 0");
		}

		System.out.println("Vous avez saisi le prix " + strPrix);

		// Definition par l'utilisateur du prix de la nouvelle pizza
		System.out.println("Veuillez choisir le type de pizza :");
		System.out.println("1 : VIANDE");
		System.out.println("2 : POISSON");
		System.out.println("3 : SANS_VIANDE");

		String strTypeDePizzaVerif = scanner.nextLine();
		if (!NumberUtils.isCreatable(strTypeDePizzaVerif)) {
			throw new StockageException("sélectionnez une des valeurs proposées svp (1, 2 ou 3)");
		}
		int strTypeDePizza = Integer.parseInt(strTypeDePizzaVerif);

		CategoriePizza typeDePizza = dao.TrouverLaCategorieDeLapizza(strTypeDePizza);
		if (typeDePizza == null) {
			throw new StockageException("sélectionnez la bonne valeur svp");
		}

		dao.saveNewPizza(new Pizza(strCode, strNom, strPrix, typeDePizza));
		executer(new Pizza(strCode, strNom, strPrix, typeDePizza).toString());

	}

	@Override
	public void executer(String param) {
		// TODO Auto-generated method stub
		LOG.debug("Traitement 1 : Création d'une pizza = {}", param);
	}

}
