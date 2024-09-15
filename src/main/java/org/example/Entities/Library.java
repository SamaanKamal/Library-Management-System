package org.example.Entities;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;
    private static Library libraryInstance;

    public static Library getInstance(){
        if (libraryInstance == null) libraryInstance = new Library();
        return libraryInstance;
    }

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(Book book){
        if(books.contains(book)){
            books.remove(book);
            System.out.println("Book Removed: " + book.getTitle());
        }
        else System.out.println("Book " + book.getTitle() + " not found");
    }

    public void registerMember(Member member){
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public Book findBoodByIsbn(String isbn){
        for (Book book : books){
            if(book.getISBN().equalsIgnoreCase(isbn)){
                return book;
            }
        }
        System.out.println("Book not found");
        return null;
    }

    public Member findMemberById(String id){
        for(Member m : members){
            if (m.getMembershipID().equalsIgnoreCase(id)) return m;
        }
        System.out.println("Member not found");
        return null;
    }

    public void borrowBook(String isbn, String id){
        Member member = findMemberById(id);
        Book book = findBoodByIsbn(isbn);

        if(member != null && book != null) member.borrowBook(book);
    }

    public void returnBook(String isbn, String id){
        Member member = findMemberById(id);
        Book book = findBoodByIsbn(isbn);

        if(member != null && book != null) member.returnBook(book);
    }

    public void printBooks(){
        System.out.println();
        System.out.println("Books in library : ");
        for (Book book : books){
            System.out.println(book);
        }
    }

    public void printMembers(){
        System.out.println();
        System.out.println("Members :");
        for(Member member : members){
            System.out.println(member);
        }
    }
}
