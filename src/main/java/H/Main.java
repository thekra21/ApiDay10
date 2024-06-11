package H;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Thekra Alanezi", 22, "Riyadh");
        Person person2 = new Person("Lama Alq", 28, "Makah");
        System.out.println(person1.getName() + ", " + person1.getAge() + ", " + person1.getAddrees());
        System.out.println(person2.getName() + ", " + person2.getAge() + ", " + person2.getAddrees());
        System.out.println("_________________________________________________________");
        // Create and display Student objects


        Student student1 = new Student("Haya alq", 20, "Riyadh", 12345, "Computer Science");
        Student student2 = new Student("Fahad Alq", 22, "321 Pine Ave", 67890, "Business Administration");
        System.out.println(student1);
        System.out.println(student2);


        School sc = new School();
        sc.addStudent(student1);
        sc.addStudent(student2);
        sc.displayAllStudents();


        sc.writeFile("students.txt");
        School sc2 =new School();
        sc2.ReadFile("students.txt");
        sc2.displayAllStudents();
    }
}