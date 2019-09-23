package book01;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();

        Booksell[] book = new Booksell[n];
        if (n==0) {
            System.out.println("N/A");
        }
        else
        {
            ob.nextLine().trim();
            for (int i = 0; i < n ; i = i+1) {
                String Bookname = ob.nextLine().trim();
                String Authorname = ob.nextLine().trim();

                String Isbn = ob.nextLine().trim();
                book[i] = new Booksell(Bookname,Authorname,Isbn);
            }
            for (int i = 0; i < book.length ; i++) {
                System.out.println(book[i]);

            }
            ob.close();

        }
    }
}

class Booksell {
    private String Bookname;
    private String Authorname;
    private String Isbn;
    public String getBookname(){
        return Bookname;
    }
    public String getAuthorname(){
        return  Authorname;
    }
    public String getIsbn(){
        return Isbn;
    }
    public String toString(){
        return "--------------------------------------\n"+"Book Name: \t"+Bookname+"\n"+"Author Name:\t" +Authorname+"\n"+"ISBN:\t"+Isbn+"\n"+"-------------------------------------";

    }
    public Booksell(String Bookname,String Authorname,String Isbn){
        this.Bookname = Bookname;
        this.Authorname = Authorname;
        this.Isbn = Isbn;
    }

}
