package javaexamples;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCountex {
    public static void main(String[] args) throws Exception {

    	File file = new File("C:\\Users\\mmahe\\Downloads\\wordcount.txt");
    	String text = Files.readString(file.toPath());
    	
    
        

        System.out.println("Characters: " + text.length());
        System.out.println("Words: " + text.split("\\s+").length);
        System.out.println("Lines: " + text.split("\n").length);
    }
}