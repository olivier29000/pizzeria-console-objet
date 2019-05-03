package fr.pizzeria.model;

import java.util.Scanner;

import exception.StockageException;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao dao) throws StockageException {
		// TODO Auto-generated method stub
		if (dao.findAllPizzas().size() == 0) {
			throw new StockageException("il n'y a aucune pizza dans la liste");
		}
		System.out.println("Liste des pizzas");
		for (int i = 0; i < dao.findAllPizzas().size(); i++) {
			System.out.println(dao.findAllPizzas().get(i).toString());
		}
	}

}
