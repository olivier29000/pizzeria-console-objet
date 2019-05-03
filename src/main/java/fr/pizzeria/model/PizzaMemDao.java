package fr.pizzeria.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PizzaMemDao implements IPizzaDao {

	public List<Pizza> listeDesPizzas;

	public PizzaMemDao() {

		Pizza pizza0 = new Pizza("PEP", "Pépéroni", 12.50, CategoriePizza.VIANDE);
		Pizza pizza1 = new Pizza("MAR", "Margherita", 14.00, CategoriePizza.VIANDE);
		Pizza pizza2 = new Pizza("REIN", "La Reine", 11.50, CategoriePizza.POISSON);
		Pizza pizza3 = new Pizza("FRO", "La 4 fromages", 12.00, CategoriePizza.SANS_VIANDE);
		Pizza pizza4 = new Pizza("CAN", "La cannibale", 12.50, CategoriePizza.VIANDE);
		Pizza pizza5 = new Pizza("SAV", "La savoyarde", 13.00, CategoriePizza.VIANDE);
		Pizza pizza6 = new Pizza("ORI", "L’orientale", 13.50, CategoriePizza.POISSON);
		Pizza pizza7 = new Pizza("IND", "L’indienne", 14.00, CategoriePizza.SANS_VIANDE);

		listeDesPizzas = new ArrayList<>();
		listeDesPizzas.addAll(Arrays.asList(pizza0, pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7));

	}

	public CategoriePizza TrouverLaCategorieDeLapizza(int codeDeLaCategorie) {
		CategoriePizza[] tabPizza = CategoriePizza.values();
		for (CategoriePizza categoriePizza : tabPizza) {
			if (categoriePizza.getCodePizza() == codeDeLaCategorie) {
				return categoriePizza;
			}
		}
		return null;
	}

	@Override
	public List<Pizza> findAllPizzas() {
		// TODO Auto-generated method stub
		return listeDesPizzas;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		listeDesPizzas.add(pizza);
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		deletePizza(codePizza);
		saveNewPizza(pizza);

	}

	@Override
	public void deletePizza(String codePizza) {
		findAllPizzas().remove(findPizzaByCode(codePizza));

	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub

		for (int i = 0; i < findAllPizzas().size(); i++) {
			if (findAllPizzas().get(i).getCode().equals(codePizza)) {
				return findAllPizzas().get(i);

			}
		}
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		for (int i = 0; i < findAllPizzas().size(); i++) {
			if (findAllPizzas().get(i).getCode().equals(codePizza)) {
				return true;

			}
		}

		return false;
	}

}
