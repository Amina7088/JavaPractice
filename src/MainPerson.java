
public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Amina", 18);

        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");

        person1.setAge(19);
        person1.setName("Aminkhishig");

        System.out.println("Set new age and name:");
        System.out.println(person1.getName() + " is now " + person1.getAge() + " years old.");
        person1.greet();
    }
} 
