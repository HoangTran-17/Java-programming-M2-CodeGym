import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Hồ Thị Na", 28);
		hashMap.put("Trần Nhật Hoàng", 25);
		hashMap.put("Trần Quang Tiến", 18);
		hashMap.put("Phan Văn Thanh Tân", 21);
		hashMap.put("Huỳnh Văn Thành", 28);
		hashMap.put("Bùi Xuân Tân", 24);
		hashMap.put("Trần Ngọc Hữu", 26);
		hashMap.put("Huỳnh Văn Giàu", 19);
		System.out.printf("Display entries in HashMap%n");
		System.out.printf("%s%n",hashMap);
		
		Map<String, Integer> treeMap = new TreeMap<>(hashMap);
		System.out.printf("Display entries in ascending order of key%n");
		System.out.printf("%s",treeMap);
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
		linkedHashMap.put("Hồ Thị Na", 28);
		linkedHashMap.put("Trần Nhật Hoàng", 25);
		linkedHashMap.put("Trần Quang Tiến", 18);
		linkedHashMap.put("Phan Văn Thanh Tân", 21);
		linkedHashMap.put("Huỳnh Văn Thành", 28);
		linkedHashMap.put("Bùi Xuân Tân", 24);
		linkedHashMap.put("Trần Ngọc Hữu", 26);
		linkedHashMap.put("Huỳnh Văn Giàu", 19);
		System.out.printf("%nThe age for Trần Nhật Hoàng is %s.",linkedHashMap.get("Trần Nhật Hoàng"));
	}
}
