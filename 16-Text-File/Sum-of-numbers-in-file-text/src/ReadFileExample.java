import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
	public void readFileText(String filePath) {
		try {
			// Đọc file theo hướng dẫn
			File file = new File(filePath);

			// Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
			if (!file.exists()) {
				throw new FileNotFoundException();
			}

			// Dọc từng dòng của file và tiến hành cộng tổng lại
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			int sum = 0;
			while ((line = br.readLine()) != null) {
				System.out.printf("%s%n",line);
				sum += Integer.parseInt(line);
			}
			br.close();

			// Hiển thị ra màn hình tổng các số nguyên trong file.
			System.out.printf("Tổng = %d.%n", sum);
		} catch (Exception e) {
			// TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
			System.err.printf("File không tồn tại ỏ nội dung có lỗi!%n");
		}
	}

	public static void main(String[] args) {
		System.out.printf("Nhập đường dẫn file: %n");
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();

		ReadFileExample readFileEx = new ReadFileExample();
		readFileEx.readFileText(path);
	}
}


