package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends PrototypeLibrary<Library> {

    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int getHashCode() {
        return books.hashCode();
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library deepCopyOfLibrary = super.clone();
        deepCopyOfLibrary.books = new HashSet<>();
        for (Book book : getBooks()) {
            deepCopyOfLibrary.addBook(new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate()));
        }
        return deepCopyOfLibrary;
    }

    @Override
    public String toString() {
        return
                "name:" + name + '\'' +
                        ", books: " + books;
    }
}
