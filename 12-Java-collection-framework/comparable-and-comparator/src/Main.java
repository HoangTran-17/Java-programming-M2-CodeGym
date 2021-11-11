import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Student student = new Student("Na", 28, "Hue");
		Student student1 = new Student("Hoàng", 25, "HT");
		Student student2 = new Student("Tiến", 18, "QB");
		Student student3 = new Student("Tân", 20, "Hue");
		
		List<Student> lists = new ArrayList<>();
		lists.add(student);
		lists.add(student1);
		lists.add(student2);
		lists.add(student3);
		
		Collections.sort(lists);
		
		for (Student st : lists) {
			System.out.printf("%s%n",st.toString());
		}
		
		AgeComparator ageComparator = new AgeComparator();
		lists.sort(ageComparator);
		System.out.printf("%nSo sánh theo tuổi:%n");
		for (Student st : lists) {
			System.out.printf("%s%n",st.toString());
		}
	}
}
