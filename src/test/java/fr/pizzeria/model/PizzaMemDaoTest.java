package fr.pizzeria.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PizzaMemDaoTest {

	public void testPizzaMemDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testTrouverLaCategorieDeLapizza1() {

		PizzaMemDao listeDepizza = new PizzaMemDao();
		CategoriePizza categoriePizza = CategoriePizza.POISSON;

		assertEquals(categoriePizza, listeDepizza.TrouverLaCategorieDeLapizza(2));

	}

	@Test
	public void testTrouverLaCategorieDeLapizza2() {

		PizzaMemDao listeDepizza = new PizzaMemDao();
		CategoriePizza categoriePizza = CategoriePizza.VIANDE;

		assertEquals(categoriePizza, listeDepizza.TrouverLaCategorieDeLapizza(1));
	}

	@Test
	public void testTrouverLaCategorieDeLapizza3() {

		PizzaMemDao listeDepizza = new PizzaMemDao();
		CategoriePizza categoriePizza = CategoriePizza.SANS_VIANDE;

		assertEquals(categoriePizza, listeDepizza.TrouverLaCategorieDeLapizza(3));

	}

	@Test
	public void testTrouverLaCategorieDeLapizza4() {

		PizzaMemDao listeDepizza = new PizzaMemDao();
		CategoriePizza categoriePizza = null;

		assertEquals(categoriePizza, listeDepizza.TrouverLaCategorieDeLapizza(4));

	}

	@Test
	public void testFindAllPizzas1() {

		Pizza pizza0 = new Pizza("PEP", "Pépéroni", 12.50, CategoriePizza.VIANDE);

		List<Pizza> listeDesPizzas;
		listeDesPizzas = new ArrayList<>();
		listeDesPizzas.addAll(Arrays.asList(pizza0));

		PizzaMemDao listeDepizza = new PizzaMemDao();

		assertEquals(listeDesPizzas.get(0).toString(), listeDepizza.findAllPizzas().get(0).toString());
	}

	@Test
	public void testFindAllPizzas2() {

		Pizza pizza0 = new Pizza("PEP", "Pépéroni", 12.50, CategoriePizza.VIANDE);
		Pizza pizza1 = new Pizza("MAR", "Margherita", 14.00, CategoriePizza.VIANDE);
		Pizza pizza2 = new Pizza("REIN", "La Reine", 11.50, CategoriePizza.POISSON);
		Pizza pizza3 = new Pizza("FRO", "La 4 fromages", 12.00, CategoriePizza.SANS_VIANDE);

		List<Pizza> listeDesPizzas;
		listeDesPizzas = new ArrayList<>();
		listeDesPizzas.addAll(Arrays.asList(pizza0, pizza1, pizza2, pizza3));

		PizzaMemDao listeDepizza = new PizzaMemDao();
		assertEquals(listeDesPizzas.get(0).toString(), listeDepizza.findAllPizzas().get(0).toString());
		assertEquals(listeDesPizzas.get(1).toString(), listeDepizza.findAllPizzas().get(1).toString());
		assertEquals(listeDesPizzas.get(2).toString(), listeDepizza.findAllPizzas().get(2).toString());
		assertEquals(listeDesPizzas.get(3).toString(), listeDepizza.findAllPizzas().get(3).toString());
	}

	@Test
	public void testSaveNewPizza1() {
		PizzaMemDao listeDepizza = new PizzaMemDao();
		int a = listeDepizza.findAllPizzas().size();
		listeDepizza.saveNewPizza(new Pizza("AAA", "La pizza de test", 12.00, CategoriePizza.SANS_VIANDE));
		int b = listeDepizza.findAllPizzas().size();
		assertEquals(a + 1, b);
	}

	@Test
	public void testSaveNewPizza2() {
		PizzaMemDao listeDepizza = new PizzaMemDao();
		int a = listeDepizza.findAllPizzas().size();
		listeDepizza.saveNewPizza(null);
		int b = listeDepizza.findAllPizzas().size();
		assertEquals(a, b);
	}

	@Test
	public void testUpdatePizza1() {
		PizzaMemDao listeDepizza = new PizzaMemDao();
		int a = listeDepizza.findAllPizzas().size();
		listeDepizza.updatePizza(listeDepizza.findAllPizzas().get(0).getCode(),
				(new Pizza("AAA", "La pizza de test", 12.00, CategoriePizza.SANS_VIANDE)));
		int b = listeDepizza.findAllPizzas().size();
		assertEquals(a, b);
		assertEquals(listeDepizza.findAllPizzas().get(listeDepizza.findAllPizzas().size() - 1).getCode(), "AAA");
		assertEquals(listeDepizza.findAllPizzas().get(listeDepizza.findAllPizzas().size() - 1).getLibelle(),
				"La pizza de test");
		assertEquals(12.00, listeDepizza.findAllPizzas().get(listeDepizza.findAllPizzas().size() - 1).getPrix(),
				0.0000001);
		assertEquals(listeDepizza.findAllPizzas().get(listeDepizza.findAllPizzas().size() - 1).getCategoriePizza(),
				CategoriePizza.SANS_VIANDE);
	}

	public void testUpdatePizza2() {
		PizzaMemDao listeDepizza = new PizzaMemDao();

		listeDepizza.updatePizza("", (new Pizza("AAA", "La pizza de test", 12.00, CategoriePizza.SANS_VIANDE)));

	}

	public void testUpdatePizza3() {
		PizzaMemDao listeDepizza = new PizzaMemDao();

		listeDepizza.updatePizza(listeDepizza.findAllPizzas().get(0).getCode(), null);

	}

	public void testUpdatePizza4() {
		PizzaMemDao listeDepizza = new PizzaMemDao();

		listeDepizza.updatePizza("", null);

	}

	public void testUpdatePizza5() {
		PizzaMemDao listeDepizza = new PizzaMemDao();

		listeDepizza.updatePizza("FRO", null);

	}

	public void testDeletePizza1() {
		PizzaMemDao listeDepizza = new PizzaMemDao();
		int a = listeDepizza.findAllPizzas().size();
		listeDepizza.deletePizza(listeDepizza.findAllPizzas().get(0).getCode());
		;
		int b = listeDepizza.findAllPizzas().size();
		assertEquals(a, b - 1);
	}

	public void testDeletePizza2() {
		PizzaMemDao listeDepizza = new PizzaMemDao();
		int a = listeDepizza.findAllPizzas().size();
		String codePizzaQuiExistePas = "a";
		listeDepizza.deletePizza(codePizzaQuiExistePas);
		int b = listeDepizza.findAllPizzas().size();
		assertEquals(a, b);
	}

	public void testDeletePizza3() {
		PizzaMemDao listeDepizza = new PizzaMemDao();
		int a = listeDepizza.findAllPizzas().size();
		String codePizzaQuiExistePas = "";
		listeDepizza.deletePizza(codePizzaQuiExistePas);
		int b = listeDepizza.findAllPizzas().size();
		assertEquals(a, b);
	}

	public void testFindPizzaByCode() {
		fail("Not yet implemented");
	}

	public void testPizzaExists() {
		fail("Not yet implemented");
	}

}
