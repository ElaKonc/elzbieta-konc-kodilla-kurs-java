package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    private List<Book> generateListOfBorrowedBooks(int booksQuantity) {
        List<Book> listBorrowedBooks = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book book = new Book("Title " + n, "Author " + n, 1970 + n);
            listBorrowedBooks.add(book);
        }
        return listBorrowedBooks;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfIsEmpty() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        List<Book> resultListOf0Books = generateListOfBorrowedBooks(0);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("jan","kowalski","123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(resultListOf0Books);

        List<Book> theListOf0Books = bookLibrary.listBooksInHandsOf(libraryUser);

        assertEquals(0, theListOf0Books.size());
        verify(libraryDatabaseMock, atLeastOnce()).listBooksInHandsOf(libraryUser);
    }

    @Test
    public void testListBooksInHandsOfJustOne() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        List<Book> resultListOf1Book = generateListOfBorrowedBooks(1);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("jan","kowalski","123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(any(LibraryUser.class)))
                .thenReturn(resultListOf1Book);

        List<Book> theListOf1Book = bookLibrary.listBooksInHandsOf(libraryUser);

        assertEquals(1, theListOf1Book.size());
    }

    @Test
    public void testListBooksInHandsOfBorrowed5() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        List<Book> resultListOf5Books = generateListOfBorrowedBooks(5);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("jan","kowalski","123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(any(LibraryUser.class)))
                .thenReturn(resultListOf5Books);

        List<Book> theListOf5Books = bookLibrary.listBooksInHandsOf(libraryUser);

        assertEquals(5, theListOf5Books.size());
    }
}
