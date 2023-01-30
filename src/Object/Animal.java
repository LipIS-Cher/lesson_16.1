package Object;

import java.util.Objects;

// 1 level
public class Animal {

    final String name;

    protected String year;

    public Animal(String name, String year) {
        if (name == null){
            this.name = "default";
        } else {
            this.name = name;
        }
        setYear(year);
    }

    public void eat(){
        System.out.println("Что поймают.");
    }

    public void sleep(){
        System.out.println("Где смогут.");
    }

    public void move(){
        System.out.println("Как смогут.");
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        if (year != null && !year.isEmpty() && !year.isBlank()) {
            this.year = year;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(year, animal.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
