package itClassWorkEnimals;

public abstract class Animal  {
    private String sleep;
    private String eat;
    private String sound;
    private double weight;
    private int age;
    private String color;
    private String rest;

    public Animal(String sleep, String eat, String sound, double weight, int age, String color, String rest) {
        this.sleep = sleep;
        this.eat = eat;
        this.sound = sound;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.rest = rest;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRest() {
        return rest;
    }

    public void setRest(String rest) {
        this.rest = rest;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "sleep='" + sleep + '\'' +
                ", eat='" + eat + '\'' +
                ", sound='" + sound + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", rest='" + rest + '\'' +
                '}';
    }
}
