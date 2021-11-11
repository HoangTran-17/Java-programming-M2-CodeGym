package GetterSetter;
public class Example {
	private  int[] array;
	public void setArray(int[] array) {
		this.array = array.clone();
	}
	public void displayArr(){
		for (int a: this.array) {
			System.out.print(a);
		}
		System.out.println();
	}
}
