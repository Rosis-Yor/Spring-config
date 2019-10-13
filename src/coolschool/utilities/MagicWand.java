package coolschool.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MagicWand {
	
	public static BufferedReader fortunesReader() {

		String root = Paths.get("").toAbsolutePath().toString();
		Path filePath = FileSystems.getDefault().getPath(root, "src");
		File fortunePot = new File(filePath.toString() + "/fortunes.txt");

		BufferedReader luckDistro;
		try {
			luckDistro = new BufferedReader(new FileReader(fortunePot));
			return luckDistro;
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			return null;
		}

	}

}
