package org.example.model;

public class EBook extends Book implements Downloadable {
    private double fileSize;

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        if (fileSize < 0) {
            throw new IllegalArgumentException("File size cannot be negative");
        }
        this.fileSize = fileSize;
    }
    public EBook(String title, String author, double price, double fileSize) {
        super(title,author,price);
        this.setFileSize(fileSize);
    }
    @Override
    public void displayDetails() {
        System.out.println("Ebook Details:");
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Price: " + this.getPrice());
        System.out.println("File Size: " + this.getFileSize());
    }
    @Override
    public void readBook() {
        System.out.println("Reading EBook as PDF");
    }
    @Override
    public void download() {
        System.out.println("Downloading EBook "+ this.getTitle());


    }
}
