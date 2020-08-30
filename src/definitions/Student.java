/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private long URno;
    private int NoOfIssuedBooks;
    private static Book[] IssuedBooks;

    public Student() {
        IssuedBooks = new Book[3];
    }

    public Student(String FirstName, String MiddleName, String LastName, Long URno, Integer NoOfIssuedBooks) {
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.URno = URno;
        this.NoOfIssuedBooks = NoOfIssuedBooks;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        this.MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }
}


