import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
	private List<Integer> readFile(String filePath) {
		List<Integer> numbers = new ArrayList<>();
		try {
			File file = new File(filePath);
			
			if (!file.exists()) {
				throw new FileNotFoundException();
			}
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line;
			while ((line = br.readLine()) != null) {
				numbers.add(Integer.parseInt(line));
			}
			br.close();
		
		} catch (Exception e) {
			System.err.printf("File không tồn tại or nội dung có lỗi!%n");
		}
		
		return numbers;
	}
	
	private static int findMax(List<Integer> numbers) {
		
		int maxValue = numbers.get(0);
		for (int i = 0; i < numbers.size(); i++) {
			if (maxValue < numbers.get(i)) {
				maxValue = numbers.get(i);
			}
		}
		return maxValue;
	}
	
	private void writeFile(String filePath, int maxValue) {
		try {
			FileWriter writer = new FileWriter(filePath, true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write("Giá trị lớn nhất là %d", maxValue);
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void main(String[] args) {
		ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
		List<Integer> numbers = readAndWriteFile.readFile("D:\\CodeGym\\Exercises\\CodeGym_Java\\16-Text-File\\File-text\\numbers.txt");
		int maxValue = findMax(numbers);
		
		ReadAndWriteFile.writeFile("D:\\CodeGym\\Exercises\\CodeGym_Java\\16-Text-File\\File-text\\numbers.txt",maxValue);
		
	}
	
	
}
