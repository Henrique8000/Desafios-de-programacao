package application;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class JavaAbstractClass {
	
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)){
            
            String title = sc.nextLine();
            
            Book b = new MyBook(title);
            
            System.out.println("The title is: " + b.getTitle());
              
        }
        catch (RuntimeException e) {
            e.getMessage();
        }
    }    
}

abstract class Book {
    String title;
    
    public Book() {
    }
    
    public Book(String title) {
        this.title = title;
    }
    
    abstract void setTitle(String s);
    
    String getTitle() {
        return title;
    }
} 

class MyBook extends Book{
    
    public MyBook() {
    }
    
    public MyBook(String title) {
        super(title);
    }
    
    @Override
    void setTitle(String title) {
        this.title = title;
    }
}
