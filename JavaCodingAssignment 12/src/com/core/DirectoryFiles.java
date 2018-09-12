package com.core;

import java.io.*;
import java.util.Scanner;

public class DirectoryFiles {

	static int countOfFiles = 0;
	static int countOfFolders = 0;

	public static String listFilesAndFilesSubDirectories(String directoryName) {

		// File has been changed
		File directory = new File(directoryName);
		// get all the files from a directory
		File[] fList = directory.listFiles();
		for (File file : fList) {

			if (file.isFile()) {
				countOfFiles++;
				System.out.println(file.getAbsolutePath());
			} else if (file.isDirectory()) {
				countOfFolders++;
				listFilesAndFilesSubDirectories(file.getAbsolutePath());
			}
		}
		return "Count of Files = : " + countOfFiles + " and Count of folders : " + countOfFolders;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Directory");

		System.out.println(listFilesAndFilesSubDirectories(scanner.nextLine()));

	}

}
