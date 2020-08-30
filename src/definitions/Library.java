/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] AvailableBooks;
    public Library()
    {
        this.AvailableBooks= new Book[10];
    }
    public Library(Book[]AvailableBooks)
    {
        this.AvailableBooks=AvailableBooks;
    }

    public Book[] getAvailableBooks() {
        return AvailableBooks.clone();
    }

    public void setAvailableBooks(Book[] AvailableBooks) {
        this.AvailableBooks = AvailableBooks;
    }

    @Override
    public String toString() {
        return Arrays.toString(AvailableBooks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Library library = (Library) o;
        return Arrays.equals(getAvailableBooks(), library.getAvailableBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAvailableBooks());
    }
}

