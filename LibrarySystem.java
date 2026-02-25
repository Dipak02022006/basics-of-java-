// Package Declaration
package LibraryManagement;

// Book Class
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

// Member Class
class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayMember() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
    }
}

// Main Class
public class LibrarySystem {
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "James Gosling", "12345");
        Member member1 = new Member("Rahul", 101);

        System.out.println("=== Book Details ===");
        book1.displayBook();

        System.out.println("\n=== Member Details ===");
        member1.displayMember();
    }
}
