package org.example;

import org.example.Entities.Book;
import org.example.Entities.Library;
import org.example.Entities.Member;

import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        Book book1 = new Book("Physics" , "Mohamed", "b-1" , "15-09-2024");
        Book book2 = new Book("Arabic" , "Samaan", "b-2" , "13-07-2023");

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Ali Gadallah" , "m-1" , "ali@gamil.com");
        Member member2 = new Member("Omar Ashraf" , "m-2" , "omar@gamil.com");

        library.registerMember(member1);
        library.registerMember(member2);

        library.borrowBook("b-2" , "m-1");

        library.printBooks();
        library.printMembers();
    }
}