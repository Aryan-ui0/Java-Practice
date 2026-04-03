package questions_first.hard;
import java.lang.*;
import java.util.Scanner;

class book{
    String title;
    String author; 
    int isbn;
    void displaybook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }


}

class library{
    book[] books;
    int maxbooks = 5;
    void addbook(book b, int index){
        if(index < maxbooks){
            books[index] = b;
        }
        else{
            System.out.println("Library is full");
        }
    }
        void displaybooks(){
        for(int i=0; i<books.length; i++){
            books[i].displaybook();
        }
    }
}
public class que21 {
    public static void main(String[] args) {
        library lib = new library();
        lib.books = new book[lib.maxbooks];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            book b = new book();
            b.title = sc.next();
            b.author = sc.next();
            b.isbn = sc.nextInt();
            lib.addbook(b, i);
        }

    }
}
