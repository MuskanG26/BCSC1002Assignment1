/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    public int getNoOfIssuedBooks() {
        return NoOfIssuedBooks;
    }

    public void setNoOfIssuedBooks(int NoOfIssuedBooks) {
        this.NoOfIssuedBooks = NoOfIssuedBooks;
    }

    public long getURno() {
        return URno;
    }

    public void setURno(long URno) {
        this.URno = URno;
    }

    public Book[] getIssuedBooks() {
        return IssuedBooks;
    }

    public void setIssuedBooks(Book[] IssuedBooks) {
        Student.IssuedBooks = IssuedBooks.clone();
    }


    /**
     * This method is for listing all the books issued by student.
     */
    public void NameOfIssuedBooks() {
        for (Book book : IssuedBooks) {
            System.out.println(book);
        }

    }

    public String toString() {
        String string = String.format("Student's First Name: %s, Student's Middle Name: %s, Student's Last Name: %s, Student's University RollNo: %s, Number of Books Issued By Student: %s",

                getFirstName(), getMiddleName(), getLastName(), getURno(), getNoOfIssuedBooks());

        string = string + Arrays.toString(IssuedBooks);
        return string;
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
        Student that = (Student) o;
        return
                Objects.equals(this.getFirstName(), that.getFirstName()) &&
                Objects.equals(this.getMiddleName(), that.getMiddleName()) &&
                Objects.equals(this.getLastName(), that.getLastName())&&
                        this.getURno()==that.getURno()&&
                        this.getNoOfIssuedBooks()==that.getNoOfIssuedBooks()&&
                        Arrays.equals(getIssuedBooks(),that.getIssuedBooks());
    }

    @Override
    public int hashCode()
    {
        int result=Objects.hash(getFirstName(), getMiddleName(), getLastName(), getURno(), getNoOfIssuedBooks());
        result= result + Arrays.hashCode(getIssuedBooks());
        return result;

    }
}



