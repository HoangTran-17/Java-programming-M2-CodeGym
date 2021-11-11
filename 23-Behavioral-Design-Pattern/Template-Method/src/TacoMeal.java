public class TacoMeal extends Meal {
	
	@Override
	public void prepareIngredients() {
		System.out.printf("Getting ground beef and shells%n");
	}
	
	@Override
	public void cook() {
		System.out.printf("Cooking ground beef in pan%n");
	}
	
	@Override
	public void eat() {
		System.out.printf("The tacos are tasty%n");
	}
	
	@Override
	public void cleanUp() {
		System.out.printf("Doing the dishes%n");
	}
}

