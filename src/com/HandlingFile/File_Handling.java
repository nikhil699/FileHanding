package com.HandlingFile;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class File_Handling
{
	 
		///This Is For Read FileData
		      public static void main(String[] args) throws IOException 
		      {
		    	  FileInputStream fi=new FileInputStream("abc.txt");
		    	  int i=0;
			        while((i=fi.read())!=-1) 
			        {
			     	 System.out.print((char)i);
			        } 
		      }      
		    
}		     	 
		     	 
		     	 


	 
	    