package homeWork10;

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
}
