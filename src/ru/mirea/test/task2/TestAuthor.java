package ru.mirea.test.task2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Nikolai Nosov", "n.nosov@yandex.ru", 'M');
        Author author2 = new Author("Alexander Pushkin", "a.s.pushkin@gmail.com", 'U');
        author2.setEmail("asp@yandex.ru");
        author1.setEmail("nosov@mail.ru");
        System.out.println(author1);
        System.out.println(author2);
    }
}
