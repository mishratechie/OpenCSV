package com.WriteCSV;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import au.com.bytecode.opencsv.CSVWriter;


public class CSVCreationForDuration {

	public static void main(String[] args) throws IOException {
		
		
		String Prjname="C:\\Users\\asmishra\\Documents\\NeoLoad Projects\\RollbaseMobileBasicTest_V10\\RollbaseMobileBasicTest_V10.nlp";
		String itrName="MainInt_SimpleApp_Scenario_Iteration1";
		int HourstoRun=24;
		int ExpSceTimeMinutes=5;
		int NumofItePerHour=(60/ExpSceTimeMinutes);
		int TotalnumOfitr = (HourstoRun *NumofItePerHour);
		System.out.println("TotalnumOfitr   "+TotalnumOfitr);
		
		
		
		
		
		
		String csv = "C:/output.csv";
		CSVCreationForDuration createCSV=new CSVCreationForDuration();
		createCSV.generateCSV(csv,Prjname,itrName,TotalnumOfitr);
		
	}
	
	public void generateCSV(String csvName,String p1,String p2,int count) throws IOException{
		

		String finalConcat=p1+","+p2;
		System.out.println("finalConcat String :"+finalConcat);
		
		ArrayList<String> alist=new ArrayList<String>();
		File file=new File(csvName);
		if (!file.exists()) {
			file.createNewFile();
		}
		
		else{
			
			for(int i=0 ; i<count;i++){
						
				alist.add(finalConcat);
			}
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);	
	 Iterator<String> its=alist.iterator();
	 while(its.hasNext()) {
         String element = its.next();
         System.out.print(element + "\n ");
         bw.write(element+"\n");
         
      }
		
	 bw.close();
		
	System.out.println("CSV generated "); 
	
	}
	
}
