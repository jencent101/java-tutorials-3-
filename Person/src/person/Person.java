
package person;


public class Person {
    String name;
    String places;
    int age;
    
    Person(String n, int a, String p){
        name = n;
        places = p;
        age = a;
    }
    void printPerson(){
        System.out.println("Hi, my name is " + name);
        System.out.println(". I am " + age + " years old.");
        System.out.println("I live at " + places);
    }
    public static void main(String[] args) {
        Person p;
        
        p = new Person("Laura", 21, "Laura 143 St.");
        p.printPerson();
        System.out.println("-----------");
        p = new Person("Tommy", 25, "Tommy 213 St.");
        p.printPerson();
        System.out.println("-----------");
    }   
}
