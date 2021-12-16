package itClassWorkEnimals;

public abstract class Cats extends Animal {
    private int claws;
    private double tailLength;
    private int whiskers;
    private String myao;
    private String sharpenClaws;
    private String landOnFeet;

    public Cats(String sleep, String eat, String sound, double weight, int age, String color, String rest, int claws, double tailLength, int whiskers, String myao, String sharpenClaws, String landOnFeet) {
        super(sleep, eat, sound, weight, age, color, rest);
        this.claws = claws;
        this.tailLength = tailLength;
        this.whiskers = whiskers;
        this.myao = myao;
        this.sharpenClaws = sharpenClaws;
        this.landOnFeet = landOnFeet;
    }

    public int getClaws() {
        return claws;
    }

    public void setClaws(int claws) {
        this.claws = claws;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public int getWhiskers() {
        return whiskers;
    }

    public void setWhiskers(int whiskers) {
        this.whiskers = whiskers;
    }

    public String getMyao() {
        return myao;
    }

    public void setMyao(String myao) {
        this.myao = myao;
    }

    public String getSharpenClaws() {
        return sharpenClaws;
    }

    public void setSharpenClaws(String sharpenClaws) {
        this.sharpenClaws = sharpenClaws;
    }

    public String getLandOnFeet() {
        return landOnFeet;
    }

    public void setLandOnFeet(String landOnFeet) {
        this.landOnFeet = landOnFeet;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "claws=" + claws +
                ", tailLength=" + tailLength +
                ", whiskers=" + whiskers +
                ", myao='" + myao + '\'' +
                ", sharpenClaws='" + sharpenClaws + '\'' +
                ", landOnFeet='" + landOnFeet + '\'' +
                '}';
    }
}
