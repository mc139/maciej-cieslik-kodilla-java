package com.kodilla.stream.book;

public final class Book {

    private final String author;
    private  final String title;
    private final int yearOfPublication;
    private final String signature;



    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "anuthor='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    public String getAnuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Book(String anuthor, String title, int yearOfPublication,String signature) {
        this.author = anuthor;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }
}
