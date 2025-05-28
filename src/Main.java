public class Main {
    public static void main(String[] args) {
        // Создание авторов
        Author author1 = new Author("Leo", "Tolstoy");
        Author author2 = new Author("Jane", "Austen");

        // Создание книг
        Book book1 = new Book("War and Peace", author1, 1865);
        Book book2 = new Book("Pride and Prejudice", author2, 1813);

        // Вывод информации о книгах
        System.out.println("Book 1: " + book1.getTitle() + " by " +
                book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() +
                ", published in " + book1.getPublicationYear());
        System.out.println("Book 2: " + book2.getTitle() + " by " +
                book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() +
                ", published in " + book2.getPublicationYear());

        // Изменение года публикации для первой книги
        book1.setPublicationYear(1869);
        System.out.println("Updated Book 1: " + book1.getTitle() + " by " +
                book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() +
                ", published in " + book1.getPublicationYear());
    }
}