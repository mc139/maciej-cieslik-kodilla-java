package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {

        //GIVEN
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> myBookSet = new HashSet<>();
        myBookSet.add(new Book("TEST Author1", "Test Title1", 2000, "TE1234"));
        myBookSet.add(new Book("TEST Author2", "Test Title2", 2001, "TE1233"));
        myBookSet.add(new Book("TEST Author3", "Test Title3", 2001, "TE1236"));
        myBookSet.add(new Book("TEST Author4", "Test Title4", 1999, "TE1239"));
        myBookSet.add(new Book("TEST Author5", "Test Title5", 1999, "TE1231"));

        //WHEN

        int median = medianAdapter.publicationYearMedian(myBookSet);


        //THEN

        Assertions.assertEquals(2000, median);

    }
}
