package Student;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] fullName = {"Абай", "Баглан", "Орунбасар", "Абдуразак", "Абдухуддус", "Абылайхан", "Адилбек", "Aдилет", "Азат", "Азимбек",
                "Абай", "Баглан", "Орунбасар", "Абдуразак", "Абдухуддус", "Абылайхан", "Адилбек", "Aдилет", "Азат", "Азимбек",
                "Абай", "Баглан", "Орунбасар", "Абдуразак", "Абдухуддус", "Абылайхан", "Адилбек", "Aдилет", "Азат", "Азимбек"};
        int[] age = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        String[] studentInstance = new String[30];
        Student[] student1 = new Student[30];
        Random random = new Random();
        double sum = 0;
        int cnt = 0;

        for (int i = 0; i < fullName.length; i++) {
            double mark = random.nextInt((10 - 2) + 1) + 2;
            Student student = new Student(fullName[i],age[i],mark);
            Student studentAnother = new Student(fullName[i], age[i], mark);
            studentInstance[i] = student + "";
            sum += studentAnother.getMark();
            cnt++;
        }
        System.out.println(Arrays.toString(studentInstance));
        int temp = 0;

        for (Student i : student1) {
            System.out.println("Данные студента №:" + temp + " = " + i);
            temp++;
        }

        System.out.println("Your average mark equals to " + sum / cnt);
        System.out.println();
    }
}
