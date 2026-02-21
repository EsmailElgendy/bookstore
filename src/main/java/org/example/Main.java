package org.example;

import org.example.model.Book;
import org.example.model.EBook;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Our BOOK STORE!");

        Book myBook = new EBook("Ramadan","Esmail", 22,50);

        myBook.displayDetails();
    }
}