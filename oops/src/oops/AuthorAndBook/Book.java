package oops.AuthorAndBook;

public class Book {

	private String Name="";
	private Author Author ;
	private double price = 0.00;
	private int quantity = 0;
	Book(String Name, Author Author, double price , int quantity) {
		
		this.Name=Name ;
		this.Author = Author;
		this.price = price;
		this.quantity = quantity;
	}
	Book(String Name, Author Author, double price) {
		
		this.Name=Name ;
		this.Author = Author;
		this.price = price;
		
	}

	public String getName() {
		return Name;
	}
	public Author getAuthor() {
		   return Author;  
		}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	public int getQTY() {
		 return quantity;		 
	 }
	public void setQTY(int QTY){
		  this.quantity=QTY;
	  }
	
	public String toString() {
		return "Book[name="+this.Name+","+Author.toString() +",price="+this.price+",quantity="+this.quantity+"]";
	}
	
	
	public String getAuthorName() {
		   return Author.getName();  
		}
}


