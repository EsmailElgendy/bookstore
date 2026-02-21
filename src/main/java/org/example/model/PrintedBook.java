package org.example.model;

public class PrintedBook extends Book {
    private int pages;


    public PrintedBook(String title, String author, int price, int pages) {
        super(title, author, price);
        this.setPages(pages);
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        if(pages < 1){
            throw new IllegalArgumentException("Pages cannot be less than 1");
        }
        this.pages = pages;
    }

    @Override
    public void readBook(){
        System.out.println("Reading Printed Book Normally");
    }
}
