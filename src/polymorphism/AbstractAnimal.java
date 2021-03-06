package polymorphism;

public class AbstractAnimal {
    private String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "name='" + name + '\'' +
                '}';
    }
}
