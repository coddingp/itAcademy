package Student;

public class Student {
    String fullName;
    int age;
    double mark;

    public Student(String fullName,
            int age,
            double mark){
        this.fullName = fullName;
        this.age = age;
        this.mark = mark;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
