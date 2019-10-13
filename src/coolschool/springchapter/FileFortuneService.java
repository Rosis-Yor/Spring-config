package coolschool.springchapter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import coolschool.utilities.MagicWand;

@Component("fromFile")
public class FileFortuneService implements FortuneService {

	List<String> fortuna = new ArrayList<String>();

	

	@Override
	public String getFortune() {

		

		BufferedReader luckDistro  = MagicWand.fortunesReader();

		String luck;
		try {
			while ((luck = luckDistro.readLine()) != null) {

				// System.out.println(luck);
				fortuna.add(luck);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		try {
			luckDistro.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int idx = ((int) (Math.random() * 10000)) % fortuna.size();

		return fortuna.get(idx);
	}

}
