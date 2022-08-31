package homeWork10;

import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int yearPublishing;

    public Book(String title, Author author, int yearPublishing) {
        this.title = title;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthorName() {
        return this.author;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        return "Книга {" + "название = '" + title + '\'' + ", автор = " + author + ", год публикации = " + yearPublishing + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublishing);
    }
}

