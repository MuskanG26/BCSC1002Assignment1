/*  Created by IntelliJ IDEA.
 *  User: Muskan Gupta
 *  Date: 30/08/20
 *  Time: 7:27 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int NEW_BOOK=1;
    private static final int RETURN_BOOK=2;
    private static final int SHOW_ISSUED_BOOKS=3;
    private static final int EXIT=4;

    public static void main(String[] args) {
        int studentInput;
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        Student student = new Student();
        do{
            System.out.println("-=-=--=-=-Welcome to the FrontDesk-=-=--=-=-");
            System.out.println("How may i help you?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a  previously issued book for me.");
            System.out.println("3. Show me all my issued book.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice from (1..4):");
            studentInput=scanner.nextInt();
            switch (studentInput)
            {
                case NEW_BOOK:
                System.out.println("These are the list of books currently available:");
                    library.AvailableBooksList();
                    System.out.println("Enter the name of");
                    scanner.nextLine();
                    String BookName= scanner.next();
                    student.IssueNewBook(BookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter the book you want to return:");
                    scanner.next();
                    BookName = scanner.next ();
                    student.Return(BookName);
                case SHOW_ISSUED_BOOKS:
                    System.out.println("Your issued books are:");
                    student.NameOfIssuedBooks();
                    break;

                case EXIT:
                    System.out.println("Thanks for coming.");
                    break;
                default:
                    System.out.println("WRONG CHOICE");

            }
        } while (studentInput!=EXIT);
        scanner.close();
        }

    }

