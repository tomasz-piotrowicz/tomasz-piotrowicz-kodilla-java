package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        MedianAdapter adapter = new MedianAdapter();
        HashSet<Book> bookSet = new HashSet<Book>();
        bookSet.add(new Book("Stephen King", "Misery", 1990, "ABC"));
        bookSet.add(new Book("Charles Bukowsky", "Californication", 2001,"DEF"));
        bookSet.add(new Book("Frank Herbert", "Diuna", 1970, "GHI"));
        //When
        int medianYear = adapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(1990, medianYear);
    }
}
