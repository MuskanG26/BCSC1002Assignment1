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
}
