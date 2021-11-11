public class FactoryDemo {
	public static void main(String[] args) {
		FactoryAnimal factoryAnimal = new FactoryAnimal();
		
		Animal a1 = factoryAnimal.getAnimal("feline");
		System.out.printf("a1 sound: \"%s\".%n", a1.makeSound());
		
		Animal a2 = factoryAnimal.getAnimal("canine");
		System.out.printf("a2 sound: \"%s\".%n", a2.makeSound());
	}
}
