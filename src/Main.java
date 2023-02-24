public class Main {
    public static void main(String[] args) {
        Author author = new Author("Джен Синсеро :","Djensirego@gmail.com",'M');
        Author author1 = new Author("Марк Мэнсон:","mensonmark@gmail.com",'M');
        System.out.println(author);
        System.out.println(author1);
        Book book = new Book("Не тупи:",author,10000.3  ,1000000);
        Book book1 = new Book("Тонкое исскуство пофигизма",author1,123,5600);
        System.out.println(book);
        System.out.println(book1);
    }
}