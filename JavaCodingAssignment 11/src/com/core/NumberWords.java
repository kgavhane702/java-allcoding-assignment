package com.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberWords {

	public static void countWords() {
		String textFileLocation = "C:\\Users\\kgavhan\\Documents\\myfile.txt";

		Map<String, Integer> countOfWords = new HashMap<>();

		try {
			List<String> words = null;

			BufferedReader br = new BufferedReader(new FileReader(new File(textFileLocation)));
			String line = null;
			while ((line = br.readLine()) != null) {
				words = null;
				System.out.println("Line : " + line);

				words = Arrays.asList(line.split("\\s"));
				System.out.println(words);
				for (String newword : words) {
					if (countOfWords.containsKey(newword)) {
						int count = countOfWords.get(newword);
						countOfWords.put(newword, ++count);
					} else
						countOfWords.put(newword, 1);
				}
			}

			System.out.println(countOfWords);

		} catch (IOException ioException) {

			ioException.printStackTrace();
		}
	}

	public static void main(String args[]) {
		countWords();

	}

}
