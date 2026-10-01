// Case Study 3. Book Sorting System
// A library maintains book details containing book ID, title, and number of pages.
// Requirements:
// •	Sort books by number of pages in ascending order. 
// •	If two books have the same number of pages, sort them by book title alphabetically. 
// •	Use Comparator to perform the sorting. 
// Example:
// 101 Java Basics       150
// 104 Data Structures   150
// 103 Computer Networks 250
// 102 Operating Systems 400

public class BookSortingSystem {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Basics", 150);
        Book b2 = new Book(102, "Operating Systems", 400);
        Book b3 = new Book(103, "Computer Networks", 250);
        Book b4 = new Book(104, "Data Structures", 150);

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);

        Collections.sort(bookList, new BookComparator()); // Sorts using custom comparator
        System.out.println("Sorted books by number of pages and titles:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
