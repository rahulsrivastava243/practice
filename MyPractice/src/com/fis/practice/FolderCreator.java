package com.fis.practice;

import java.io.File;

public class FolderCreator {

	public static void main(String[] args) {
		String directoryName = "OASIS";
		File theDir = new File(directoryName);

		// if the directory does not exist, create it
		if (!theDir.exists()) {
		    System.out.println("creating directory: " + directoryName);
		    boolean result = false;

		    try{
		        
		        result = theDir.mkdir();
		    } 
		    catch(SecurityException se){
		        //handle it
		    }        
		    if(result) {    
		        System.out.println("DIR created");  
		    }
		    else{
		    	System.out.println("Unable to create");
		    }
		}
	}

}
