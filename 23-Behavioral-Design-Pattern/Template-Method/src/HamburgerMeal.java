public class
HamburgerMeal extends Meal {
	
	@Override
	public void prepareIngredients() {
		System.out.printf("Getting burgers, buns, and french fries%n");
	}
	
	@Override
	public void cook() {
		System.out.printf("Cooking burgers on grill and fries in oven%n");
	}
	
	@Override
	public void cleanUp() {
		System.out.printf("Throwing away paper plates");
	}
}

