package fr.diginamic.pizzeria_console_objet;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");

		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		while (str != 1 && str != 2 && str != 3 && str != 4 && str != 99) {
			System.out.println("Veuillez saisir un chiffre entre 1, 2, 3, 4 ou 99 svp");
			str = sc.nextInt();
		}

		System.out.println("Vous avez saisi le nombre : " + str);

		if (str == 1) {
			System.out.println("Liste des pizzas");
		} else if (str == 1) {
			System.out.println("Ajout d’une nouvelle pizza");
		} else if (str == 1) {
			System.out.println("Mise à jour d’une pizza");
		} else if (str == 1) {
			System.out.println("Suppression d’une pizza");
		} else if (str == 1) {
			System.out.println("Aurevoir ☹");
		}

	}

}
