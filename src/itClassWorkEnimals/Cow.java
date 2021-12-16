package itClassWorkEnimals;

public class Cow extends Animal{
    private String name;
    private String bread;

    public Cow(String sleep, String eat, String sound, double weight, int age, String color, String rest, String name, String bread) {
        super(sleep, eat, sound, weight, age, color, rest);
        this.name = name;
        this.bread = bread;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                '}';
    }
}
