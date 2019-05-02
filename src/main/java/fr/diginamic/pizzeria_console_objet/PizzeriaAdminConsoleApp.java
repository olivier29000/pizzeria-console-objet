package fr.diginamic.pizzeria_console_objet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	/**
	 * Methode point d'entrée de l'application
	 * 
	 * @param args
	 *            non utilisé ici
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza pizza0 = new Pizza("PEP", "Pépéroni", 12.50);
		Pizza pizza1 = new Pizza("MAR", "Margherita", 14.00);
		Pizza pizza2 = new Pizza("REIN", "La Reine", 11.50);
		Pizza pizza3 = new Pizza("FRO", "La 4 fromages", 12.00);
		Pizza pizza4 = new Pizza("CAN", "La cannibale", 12.50);
		Pizza pizza5 = new Pizza("SAV", "La savoyarde", 13.00);
		Pizza pizza6 = new Pizza("ORI", "L’orientale", 13.50);
		Pizza pizza7 = new Pizza("IND", "L’indienne", 14.00);

		List<Pizza> listeDesPizzas = new ArrayList<>();
		listeDesPizzas.addAll(Arrays.asList(pizza0, pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7));

		// Affichage du menu principal
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");

		Scanner sc = new Scanner(System.in);
		int str = Integer.parseInt(sc.nextLine());
		while (str != 1 && str != 2 && str != 3 && str != 4 && str != 99) {
			System.out.println("Veuillez saisir un chiffre entre 1, 2, 3, 4 ou 99 svp");
			str = Integer.parseInt(sc.nextLine());
		}

		System.out.println("Vous avez saisi le nombre : " + str);

		// Selection par l'utilisateur de l'option1
		// Accès à la liste des pizzas
		if (str == 1) {
			System.out.println("Liste des pizzas");
			for (int i = 0; i < listeDesPizzas.size(); i++) {
				System.out.println(listeDesPizzas.get(i).toString());
			}

			// Selection par l'utilisateur de l'option2
			// Ajout d'une nouvelle pizza
		} else if (str == 2) {
			System.out.println("Ajout d’une nouvelle pizza");

			// Definition par l'utilisateur du code de la nouvelle pizza
			System.out.println("Veuillez saisir le code :");
			System.out.println("Au moins 3 caractères");
			String strCode = sc.nextLine();
			while (strCode.length() < 3) {
				System.out.println("Au moins 3 caractères");
				strCode = sc.nextLine();
			}
			System.out.println("Vous avez saisi le code " + strCode.substring(0, 3));

			// Definition par l'utilisateur du nom de la nouvelle pizza
			System.out.println("Veuillez saisir le nom (sans espace) :");
			System.out.println("Au moins 5 caractères, maximum 15 caractères");
			String strNom = sc.nextLine();
			while (strNom.length() < 6) {
				System.out.println("Au moins 5 caractères");
				strNom = sc.nextLine();
			}
			if (strNom.length() > 15) {
				strNom = strNom.substring(0, 15);
			}
			System.out.println("Vous avez saisi le nom " + strNom);

			// Definition par l'utilisateur du prix de la nouvelle pizza
			System.out.println("Veuillez saisir le prix (sans espace) :");
			System.out.println("supérieur à 0");
			double strPrix = Double.parseDouble(sc.nextLine());
			while (strPrix < 0) {
				System.out.println("supérieur à 0");
				strPrix = Double.parseDouble(sc.nextLine());
			}
			System.out.println("Vous avez saisi le prix " + strPrix);

			Pizza pizza = new Pizza(strCode, strNom, strPrix);
			listeDesPizzas.add(pizza);

			// Affichage du menu principal
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			// Affichage de la liste des pizzas
			System.out.println("Liste des pizzas");
			for (int i = 0; i < listeDesPizzas.size(); i++) {
				System.out.println(listeDesPizzas.get(i).toString());
			}

			// Selection par l'utilisateur de l'option1
			// Modification d'une pizza déjà enregistrée
		} else if (str == 3) {
			System.out.println("Mise à jour d’une pizza");

			// Accès à la liste des pizzas
			System.out.println("Liste des pizzas");
			for (int i = 0; i < listeDesPizzas.size(); i++) {
				System.out.println(listeDesPizzas.get(i).getCode() + " -> " + listeDesPizzas.get(i).getLibelle() + " ("
						+ listeDesPizzas.get(i).getPrix() + ") ");
			}

			// Recherche du code défini par l'utilisateur dans la liste des
			// pizzas
			boolean strCodePizzaModifierBienTrouveeDansLaListe = false;
			do {
				System.out.println("Veuillez choisir le code de la pizza à modifier:");
				String strCodePizzaModifier = sc.nextLine();

				for (int i = 0; i < listeDesPizzas.size(); i++) {

					// la pizza a été trouvée dans la liste
					if (listeDesPizzas.get(i).getCode().equals(strCodePizzaModifier)) {
						strCodePizzaModifierBienTrouveeDansLaListe = true;

						// Définition des nouvelles valeurs

						// Definition par l'utilisateur du code de la nouvelle
						// pizza
						System.out.println("Veuillez saisir le nouveau code");
						System.out.println("Au moins 3 caractères");
						String strCode = sc.nextLine();
						while (strCode.length() < 3) {
							System.out.println("Au moins 3 caractères");
							strCode = sc.nextLine();
						}
						System.out.println("Vous avez saisi le code " + strCode.substring(0, 3));

						// Definition par l'utilisateur du nom de la nouvelle
						// pizza
						System.out.println("Veuillez saisir le nouveau nom (sans espace) :");
						System.out.println("Au moins 5 caractères, maximum 15 caractères");
						String strNom = sc.nextLine();
						while (strNom.length() < 6) {
							System.out.println("Au moins 5 caractères");
							strNom = sc.nextLine();
						}
						if (strNom.length() > 15) {
							strNom = strNom.substring(0, 15);
						}
						System.out.println("Vous avez saisi le nom " + strNom);

						// Definition par l'utilisateur du prix de la nouvelle
						// pizza
						System.out.println("Veuillez saisir le nouveau prix (sans espace) :");
						System.out.println("supérieur à 0");
						double strPrix = Double.parseDouble(sc.nextLine());
						while (strPrix < 0) {
							System.out.println("supérieur à 0");
							strPrix = Double.parseDouble(sc.nextLine());
						}
						System.out.println("Vous avez saisi le prix " + strPrix);

						listeDesPizzas.get(i).setCode(strCode);
						listeDesPizzas.get(i).setLibelle(strNom);
						listeDesPizzas.get(i).setPrix(strPrix);
					}

				}
				if (!strCodePizzaModifierBienTrouveeDansLaListe) {
					System.out.println("Reférence de la pizza non trouvée");
				}
			} while (!strCodePizzaModifierBienTrouveeDansLaListe);

			// Affichage de la liste des pizzas
			System.out.println("Liste des pizzas");
			for (int i = 0; i < listeDesPizzas.size(); i++) {
				System.out.println(listeDesPizzas.get(i).toString());
			}

		} else if (str == 4) {
			System.out.println("Suppression d’une pizza");

			System.out.println("Mise à jour d’une pizza");

			// Accès à la liste des pizzas
			System.out.println("Liste des pizzas");
			for (int i = 0; i < listeDesPizzas.size(); i++) {
				System.out.println(listeDesPizzas.get(i).getCode() + " -> " + listeDesPizzas.get(i).getLibelle() + " ("
						+ listeDesPizzas.get(i).getPrix() + ") ");
			}

			// Recherche du code défini par l'utilisateur dans la liste des
			// pizzas
			boolean strCodePizzaModifierBienTrouveeDansLaListe = false;
			int indexPizzaSupprimer = 0;
			do {
				System.out.println("Veuillez choisir le code de la pizza à supprimer:");
				String strCodePizzaSupprimer = sc.nextLine();

				for (int i = 0; i < listeDesPizzas.size(); i++) {

					// la pizza a été trouvée dans la liste
					if (listeDesPizzas.get(i).getCode().equals(strCodePizzaSupprimer)) {
						strCodePizzaModifierBienTrouveeDansLaListe = true;
						indexPizzaSupprimer = i;
					}

				}
				if (!strCodePizzaModifierBienTrouveeDansLaListe) {
					System.out.println("Reférence de la pizza non trouvée");
				}
			} while (!strCodePizzaModifierBienTrouveeDansLaListe);
			listeDesPizzas.remove(indexPizzaSupprimer);

			// Affichage de la liste des pizzas
			System.out.println("Liste des pizzas");
			for (int i = 0; i < listeDesPizzas.size(); i++) {
				System.out.println(listeDesPizzas.get(i).toString());
			}

		} else if (str == 99) {
			System.out.println("Aurevoir ☹");
		}

	}

}
