package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        //GIVEN

        Library originalLibrary = new Library("Original Library");
        Book book1 = new Book("Clean Code1", "Uncle Bob", LocalDate.of(2008, 8, 1));
        Book book2 = new Book("Clean Code2", "Uncle Bob", LocalDate.of(2008, 8, 1));
        Book book3 = new Book("Clean Code3", "Uncle Bob", LocalDate.of(2008, 8, 1));
        Book book4 = new Book("Clean Code4", "Uncle Bob", LocalDate.of(2008, 8, 1));
        originalLibrary.books.add(book1);
        originalLibrary.books.add(book2);
        originalLibrary.books.add(book3);
        originalLibrary.books.add(book4);

        //WHEN

        //Shallow copy
        Library shallowCopyOfLibrary = null;
        try {
            shallowCopyOfLibrary = originalLibrary.shallowCopy();
            shallowCopyOfLibrary.setName("Shallow Copy Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Deep Copy

        Library deepCopyOfLibrary = null;
        try {
            deepCopyOfLibrary = originalLibrary.deepCopy();
            deepCopyOfLibrary.setName("Deep Copy Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //THEN

        System.out.println("-------------ORIGINAL----------------");
        System.out.println(originalLibrary);
        System.out.println(originalLibrary.getHashCode());
        System.out.println("-------------SHALLOW COPY------------");
        System.out.println(shallowCopyOfLibrary);
        System.out.println(shallowCopyOfLibrary.getHashCode());
        System.out.println("-------------DEEP COPY---------------");
        System.out.println(deepCopyOfLibrary);
        System.out.println(deepCopyOfLibrary.getHashCode());

        assertEquals(originalLibrary.getBooks(), shallowCopyOfLibrary.getBooks());
        assertNotEquals(originalLibrary.getName(), shallowCopyOfLibrary.getName());

        assertNotEquals(originalLibrary.getHashCode(), deepCopyOfLibrary.getHashCode());
        assertNotEquals(originalLibrary.getBooks(), deepCopyOfLibrary.getBooks());

    }

}
