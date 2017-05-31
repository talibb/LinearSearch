/*
 * Done by: Talib Bacchus
 * This program demonstrates a linear search using "Book.java"
 * A book has an title, author, publisher, and a copyright date
 * The books are then added to an array list 
 * The books are then looked up using a Linear search algorithm 
 * using their titles
 */
import java.util.ArrayList;

public class LinearSearchLimitedLibrary {
	
	public static void main(String[] args) {
		
		Book b1 = new Book("A", "John", "Randy", 1900);
		Book b2 = new Book("B", "Smith", "Brian", 1800);
		Book b3 = new Book("C", "Alex", "Mark", 1700);
		Book b4 = new Book("D", "Tariq", "Matt", 1600);
		Book b5 = new Book("E", "Ahmad", "Luke", 1500);
		Book b6 = new Book("F", "Vic", "Cruz", 1400);
		Book b7 = new Book("G", "Lebron", "James", 1300);
		Book b8 = new Book("I", "Fechter","Ronald", 1200);
		Book b9 = new Book("J", "Kelly","Oher", 1100);
		Book b10 = new Book("K", "Micael","Jones", 1000);
		
		ArrayList <Book> b = new ArrayList <Book>();
		b.add(b1);
		b.add(b2);
		b.add(b3);
		b.add(b4);
		b.add(b5);
		b.add(b6);
		b.add(b7);
		b.add(b8);
		b.add(b9);
		b.add(b10);
		System.out.println(LinearSearch(b,"A"));
		
	}	
	
		
	
	public static String LinearSearch (ArrayList<Book> array, String title)
	{
		for(int i = 0; i < array.size(); i++)
		{
			System.out.print(array.get(i).getTitle() + " ");
			
		}
		
		
		
		for(int i = 0; i< array.size();i++)
		{	
			
			
			if(array.get(i).getTitle().equals(title))
			{
				return title;
			}
			else
				System.out.println("Book not found");
		}
		return title;
		
	}
}
	