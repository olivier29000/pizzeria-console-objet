package fr.pizzeria.model;

import java.util.Scanner;

import exception.StockageException;

public abstract class MenuService {
	public abstract void executeUC(Scanner scanner, PizzaMemDao dao) throws StockageException;

	public MenuService() {
		// TODO Auto-generated constructor stub
	}
}
