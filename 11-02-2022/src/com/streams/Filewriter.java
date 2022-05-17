package com.streams;
	
	import java.io.FileWriter;  
	public class Filewriter {  
	    public static void main(String args[]){    
	         try{    
	           FileWriter fw=new FileWriter("E:\\javaprograms\\file.txt");    
	           fw.write("Theey inserted in filewriter class.... ");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    
	}  



