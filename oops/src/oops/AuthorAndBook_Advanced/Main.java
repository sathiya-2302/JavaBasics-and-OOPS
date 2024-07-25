package oops.AuthorAndBook_Advanced;

import oops.AuthorAndBook_Advanced.Author;
import oops.AuthorAndBook_Advanced.Book;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		Author Paul=new Author("Paul Tan", "paul@somewhere.com", 'm');
		System.out.println(ahTeck);  // Author's toString()
		System.out.println(Paul);
		Author[] authorArray= {ahTeck,Paul};
		Book dummyBook = new Book("Java for dummy",authorArray, 19.95, 99);  // Test Book's Constructor
		System.out.println(dummyBook);  // Test Book's toString()

		// Test Getters and Setters
		dummyBook.setPrice(29.95);
		dummyBook.setQTY(28);
		System.out.println("name is: " + dummyBook.getName());
		System.out.println("price is: " + dummyBook.getPrice());
		System.out.println("qty is: " + dummyBook.getQTY());
		Author[] Authors =dummyBook.getAuthor();
		for(int i=0;i<Authors.length;i++) {
		System.out.println("Author is: " + Authors[i]);  // Author's toString()
	System.out.println("Author's name is: " + Authors[i].getName());
	System.out.println("Author's email is: " + Authors[i].getEmail());
		}
	//	System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
		

//		// Use an anonymous instance of Author to construct a Book instance
//		Book anotherBook = new Book("more Java", 
//		      new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
//		System.out.println(anotherBook);  // toString()
	}

	

}
