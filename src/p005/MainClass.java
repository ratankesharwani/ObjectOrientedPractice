package p005;

import p002.Animal;
import p002.Dog;

public class MainClass {
    public static void main(String[] args) {

        Student student = new Student(
                "Rajana",
                "13-10-1991",
                new Address(
                        "Kua ke aage",
                        "4850",
                        "Uttar Pradesh",
                        "Naini",
                        "India",
                        "4665656"
                ),
                "rajankesharwani1718@gmail.com",
                "Om Prakash Kesharwani",
                "7499027271",
                Gender.MALE
        );

        System.out.println(student.toString());

    }
}
