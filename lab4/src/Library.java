public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    
    public void addBook(Book book, int slot){
        switch (slot) {
            case 1 -> book1 = book;
            case 2 -> book2 = book;
            case 3 -> book3 = book;
            default -> {
            }
        }
    }
    public void removeBook(int slot){
        
    } 
    public void printLibraryDetails(){
        System.out.println("Library: "+libraryName);
        System.out.println();
        System.out.println("Title: "+book1.title);
        System.out.println("Author: "+book1.author);
        System.out.println("Publisher: "+book1.publisher);
        System.out.println("Year Published: "+book1.yearPublished);
        System.out.println("Price: $"+book1.price);
        if (book1.isAvailable == true){
            System.out.println("Available: Yes");
        }else{
            System.out.println("Available: No");
        }
        System.out.println();
        System.out.println("Title: "+book2.title);
        System.out.println("Author: "+book2.author);
        System.out.println("Publisher: "+book2.publisher);
        System.out.println("Year Published: "+book2.yearPublished);
        System.out.println("Price: $"+book2.price);
        if (book2.isAvailable == true){
            System.out.println("Available: Yes");
        }else{
            System.out.println("Available: No");
        }
        System.out.println();
        System.out.println("Title: "+book3.title);
        System.out.println("Author: "+book3.author);
        System.out.println("Publisher: "+book3.publisher);
        System.out.println("Year Published: "+book3.yearPublished);
        System.out.println("Price: $"+book3.price);
        if (book3.isAvailable == true){
            System.out.println("Available: Yes");
        }else{
            System.out.println("Available: No");
        }
    }
    public void checkBookAvailability(int slot){
        if (slot == 1 && book1 == null){
            System.out.println("book in slot "+slot+" is not available.");
        }else if (slot == 1 && book1 != null){
            System.out.println(book1.title+" is available.");
        }else if (slot == 2 && book2 == null){
            System.out.println("book in slot "+slot+" is not available.");
        }else if (slot == 2 && book2 != null){
            System.out.println(book2.title+" is available.");
        }else if (slot == 3 && book3 == null){
            System.out.println("book in slot "+slot+" is not available.");
        }else if (slot == 3 && book3 != null){
            System.out.println(book3.title+" is available.");
    }
    public void updateBookPrice(int slot, double newPrice){
        
    }
    public void printBookDetails(Book book){
        if (book == null){
            System.out.println("No book in this slot.");
        }else{
            System.out.println("Title: "+book.title);
            System.out.println("Author: "+book.author);
            System.out.println("Publisher: "+book.publisher);
            System.out.println("Year Published: "+book.yearPublished);
            System.out.println("Price: $"+book.price);
            if (book.isAvailable == true){
                System.out.println("Available: Yes");
            }else{
                System.out.println("Available: No");
            }
        }
    }
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.price = 450;
        book1.publisher = "Head First";
        book1.yearPublished = 2006;
        book1.isAvailable = false;
        book1.author = "John Smith";

        Book book2 = new Book();
        book2.title = "Python Programming";
        book2.price = 225;
        book2.publisher = "KM";
        book2.yearPublished = 2020;
        book2.isAvailable = true;
        book2.author = "Elon Potter";

        Library lib = new Library();
        lib.libraryName = "IT Library";
        lib.addBook(book2, 1);
        lib.addBook(book1, 3);

        lib.updateBookPrice(2, 1000);
        lib.updateBookPrice(3, 320);

        lib.printLibraryDetails();
    }
}
