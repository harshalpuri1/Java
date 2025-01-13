public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.rollno = 101;
        s1.pass = "Yes";
        s1.marks = new int[]{90, 80, 70, 60, 80};


        Student s2 = new Student(s1); // Copy Constructor
        s2.pass = "No";

        for (int i = 0; i < s1.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name ;
    int rollno;
    String pass;
    int marks[];

    Student (){                    // Default Constructor
        System.out.println("Default Constructor....");
    }

    Student (Student s1){           // Copy Constructor
        this.name = s1.name;
        this.rollno = s1.rollno;
        marks = new int[3];
        this.marks = s1.marks;
    }


    Student(String name){          // Parameterized Constructor
        this.name = name;
        System.out.println(name);
    }
}