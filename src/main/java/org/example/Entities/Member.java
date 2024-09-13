package org.example.Entities;

import java.util.List;

public class Member {
    private String name;
    private String membershipID;
    private String contactInfo;
    private List<Book> borrowedBooks;

    public Member() {
    }

    public Member(String name, String membershipID, String contactInfo, List<Book> borrowedBooks) {
        this.name = name;
        this.membershipID = membershipID;
        this.contactInfo = contactInfo;
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
        } else {
            System.out.println("This member didn't borrow this book.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(String membershipID) {
        this.membershipID = membershipID;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    @Override
    public String toString() {
        return "Member[Name: " + name + ", MembershipID: " + membershipID + ", Contact: " + contactInfo + "]";
    }
}
