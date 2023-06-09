package br.com.cod3r.builder.meal.fluent;

import br.com.cod3r.builder.meal.fluent.model.Carro;
import br.com.cod3r.builder.meal.fluent.model.FastFoodMeal;
import br.com.cod3r.builder.meal.fluent.model.builder.CarroBuilder;
import br.com.cod3r.builder.meal.fluent.model.builder.FastFoodMealBuilder;

public class Client {

	public static void main(String[] args) {
//		FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
//				.andMain("CheeseBurger")
//				.forDrink("Code")
//				.thatsAll();
//		System.out.println(burguerCombo);
//
//		FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
//		System.out.println(justFries);
//
//		FastFoodMeal heartAtackCombo = new FastFoodMealBuilder("Large Fries")
//				.andMain("Monster Burguer")
//				.forDrink("Milk Shake")
//				.andDessert("Fudge Cake")
//				.andGift("2 Kilograms")
//				.thatsAll();
//		System.out.println(heartAtackCombo);

		Carro build = new CarroBuilder().cor("azul").nome("vermelho").modelo("abs").build();
		System.out.println(build);

		Carro build1 = Carro.builder().modelo("azul").cor("verde").build();
		System.out.println(build1);

	}
}
