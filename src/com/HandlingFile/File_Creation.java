package com.HandlingFile;
package com.HandlingFile;
import java.io.FileWriter;
import java.io.IOException;
//This Is For File Creation And Write Of Data		   
public class File_Creation
{
  public static void main(String[] args) throws IOException 
  {
 	 String input="Your Welcome";

 	 FileWriter fw=new FileWriter("zxc.txt",true);

 	 fw.write(input);
 	 System.out.println("data has been put into the file ");

 	 
 	 fw.close();
 	 
  }
}

