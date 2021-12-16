package itClassWorkEnimals;

public class Tiger extends Animal {
    private String bread;

    public Tiger(String sleep, String eat, String sound, double weight, int age, String color, String rest, String bread) {
        super(sleep, eat, sound, weight, age, color, rest);
        this.bread = bread;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "bread='" + bread + '\'' +
                '}';
    }
}
