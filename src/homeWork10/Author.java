package homeWork10;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getTotalName() {
        return this.name + " " + this.surname;
    }

    @Override
    public String toString() {
        return getTotalName();
    }
}
