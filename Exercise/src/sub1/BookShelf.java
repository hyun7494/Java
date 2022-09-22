package sub1;

public class BookShelf {
   private String title;
   public BookShelf(String title){
      this.title=title;
   }
   public String toString(){
      return title;
   }
}


package sub1;

public class BookList {

   private BookNode list;

   public BookList() {
      list = null;
   }

   public void add(Book book) {
      BookNode node = new BookNode(book);
      BookNode tmpnode;
      if (list == null)
         list = node;
      else {
         tmpnode = list;
      while (tmpnode.next != null)
         tmpnode = tmpnode.next;
         tmpnode.next = node;
      }
   }

   public String toString() {
      String str = "";
      BookNode tmpnode = list;
      while (tmpnode != null) {
         str += tmpnode.book + "n";
         tmpnode = tmpnode.next;
      }
      return str;
   }

   // BookNode is a inner class
   private class BookNode {
      public Book book;
      public BookNode next;

      public BookNode(Book book) {
         this.book = book;
         next = null;
      }
   }
}

package sub1;

import java.awt.print.Book;

public class BookShelf {
   public static void main(String[] args) {

      BookList shelf = new BookList();
      shelf.add(new Book("Harry Potter"));
      shelf.add(new Book("Around the World in 80 Days"));
      shelf.add(new Book("Count of Monte Cristo"));
      shelf.add(new Book("Jataka Tales"));
      shelf.add(new Book("Aesop's Fables"));

      System.out.println(shelf);
   }
}