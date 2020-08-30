/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

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
}

