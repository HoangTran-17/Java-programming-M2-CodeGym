package GetterSetter;

public class HelloWorld {
	public static void main(String[] args) {
		Example a = new Example();
		int[] mang = {1,2,3};
		a.setArray(mang);
		a.displayArr();
		mang[1] = 4;
		a.displayArr();
	}
}
