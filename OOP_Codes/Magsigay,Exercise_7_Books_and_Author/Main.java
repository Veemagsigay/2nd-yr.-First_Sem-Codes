import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<Person> authors = new ArrayList<>();
        ArrayList<Book> book = new ArrayList<>();
        boolean selection = true;
        String menuItems = "y";

        while (selection) {
            System.out.println("-----------------------------------------------");
            System.out.println("A: Add Authors");
            System.out.println("B: Add Book and assign Authors");
            System.out.println("C: View Books and Authors");
            System.out.println("D: View Authors and Books");
            System.out.println("Q: Quit");
            System.out.print("Enter choice: ");
            menuItems = input.nextLine();
            System.out.println("-----------------------------------------------");

            switch (menuItems.toUpperCase()) {
                case "A":
                    addAuthors(authors);
                    break;
                case "B":
                    addBook(authors, book);
                    break;
                case "C":
                    bookAndAuthor(book);
                    break;
                case "D":
                    authorAndBook(authors, book);
                    break;
                case "Q":
                    selection = false;
                    break;
            }

        }

        input.close();
    }

    private static void addAuthors(ArrayList<Person> authors) {
        boolean addiftrue = true;

        while (addiftrue) {
            System.out.print("Enter Author's Name: ");
             String author = input.nextLine();
            Author auth = new Author(author);

            boolean check = true;
            for(Person author2 : authors){
                if(author2.getName().equalsIgnoreCase(author)){
                    System.out.println("The name is Already Existed! ");
                    check = false;
                }
            }
            if(check != false){
                Author authorlist = new Author(author);
                authors.add(authorlist);
                break;
            }
        }
    }

    
    private static void addBook(ArrayList<Person> authors, ArrayList<Book> book) {

        
        boolean addiftrue = true;
        while (addiftrue) {
            System.out.print("Enter Author's Book: ");
             String books = input.nextLine();
            Book newbook = new Book(books);

            boolean check = true;
            for(Person author2 : authors){
                if(author2.getName().equalsIgnoreCase(books)){
                    System.out.println("The book is Already Existed! ");
                    check = false;
                }
            }
            if(check != false){
                Book booklist = new Book(books);
                book.add(booklist);
                break;
            }
        }
    }

    
}