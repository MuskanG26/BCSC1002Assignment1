/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import javax.accessibility.AccessibleValue;
import java.util.Arrays;

public class Library {
    private Book[] AvailableBooks;
    public Library()
    {
        this.AvailableBooks= new Book[6];
        AvailableBooks[0]=new Book("Let us C","Yashwant Kanetkar","6747837387569");
        AvailableBooks[1]=new Book("Blue Umbrella","Ruskin Bond","8748473857698");
        AvailableBooks[2]=new Book("Angels and Demons","Dan Brown","7843KL9545444");
        AvailableBooks[3]=new Book("Java the complete Reference", "Herbert Schildt", "94548RL422887");
        AvailableBooks[4]=new Book("Database System", "Ramez Elmasri", "8794555227892");
        AvailableBooks[5]=new Book("Software Engineering", "Ian Sommerville", "7893264568712");

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
    /**
     * This method shows a list of all available books
     */
    public void AvailableBooksList(){
        for(Book book: AvailableBooks){
            System.out.println(book);
        }
    }
}

