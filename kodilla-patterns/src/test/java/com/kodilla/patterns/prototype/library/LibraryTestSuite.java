package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        Library library = new Library("Biblioteka");

        Book book1 = new Book("Tytuł 1", "Jan Kowlaski", LocalDate.of(2020, 1, 11));
        Book book2 = new Book("Tytuł 2", "Adam Nowak", LocalDate.of(2018, 5, 2));
        Book book3 = new Book("Tytuł 3", "Katarzyna Jankowska", LocalDate.of(2020, 1, 3));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Moja biblioteka - płytka kopia");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Moja biblioteka - głęboka kppia");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        library.removeBook(book2);

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
