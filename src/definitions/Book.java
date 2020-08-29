/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String BookName;
    private String AuthorName;
    private String ISBN_NO;

    public Book()
    {
        BookName="The Alchemist";
        AuthorName="Paulo Coelho";
        ISBN_NO="2ABA23728856N";
    }
    public Book(String BookName, String AuthorName, String ISBN_NO)
    {
        this.BookName=BookName;
        this.AuthorName=AuthorName;
        this.ISBN_NO=ISBN_NO;
    }


}
