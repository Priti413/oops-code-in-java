class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b ) {
        return a + b ;
    }
}

class Student {
    String name;
    int age;

    Student(){
        name = "Priti";
        age = 19;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display(){
        System.out.println("Name: "+ name +"Age" + age);
    }

    Student getStudent() {
        return this;
    }
}

    public class FunctionDemo {
        public static void main(String[] args) {

            Calculator calc= new Calculator();
            System.out.println("Add two integers: " + calc.add(6, 7 ));
            System.out.println("Add three integers: " + calc.add(4, 9, 6 ));
            System.out.println("Add two doubles: " + calc.add(5, 4.7 ));


            Student s1 = new Student();
            Student s2 = new Student("Trupti", 23);
            Student s3 = new Student(s2);

            s1.display();
            s2.display();
            s3.display();

            Student s4 = s2.getStudent();
            System.out.println("Student s4 details (reference to s2):");
            s4.display();
            

        }
        
    }
