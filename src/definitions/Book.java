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

    public Book() {
        BookName = "The Alchemist";
        AuthorName = "Paulo Coelho";
        ISBN_NO = "2ABA23728856N";
    }

    public Book(String BookName, String AuthorName, String ISBN_NO) {
        this.BookName = BookName;
        this.AuthorName = AuthorName;
        this.ISBN_NO = ISBN_NO;
    }


    /**
     * method for checking length of ISBN NUMBER.
     */


    public void checkISBN(String ISBN_No) {
        int N = ISBN_No.length();
        if (N != 13) {
            System.out.println("Invalid ISBN Number, enter again!");
        }
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName)
    {
        BookName = bookName;
    }

    public String getAuthorName()
    {
        return AuthorName;
    }

    public void setAuthorName(String AuthorName)
    {
        this.AuthorName = AuthorName;
    }

    public String getISBN_NO()
    {
        return ISBN_NO;
    }

    public void setISBN_NO(String ISBN_NO)
    {
        this.ISBN_NO=ISBN_NO;
    }
    public String toString()
    {
        return String.format("BookName: %s, Author of Book: %s, ISBN no.of Book: %s",getBookName(),getAuthorName(),getISBN_NO());

    }


}






