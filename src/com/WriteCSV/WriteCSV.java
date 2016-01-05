package com.WriteCSV;

import java.io.FileWriter;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVWriter;


public class WriteCSV {

	public static void main(String[] args) throws IOException {
		
		String csv = "output.csv";
		WriteCSV writeCSV=new WriteCSV();
		writeCSV.generateCSV(csv);
		
	}
	
	public void generateCSV(String csvName) throws IOException{
		
		
		CSVWriter writer = new CSVWriter(new FileWriter(csvName));
		 
		String [] country = "India#China#United States".split("#");
		 
		writer.writeNext(country);
		System.out.println("CSV generated "); 
		writer.close();
	}
	
}
