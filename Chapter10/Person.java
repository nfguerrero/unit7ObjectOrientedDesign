import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person>
{
    private String name;
    
    public Person(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int compareTo(Person person)
    {
        return this.name.compareTo(person.getName());
    }
    
    
    public static void main(String[] args)
    {
        ArrayList<Person> people = new ArrayList<Person>();
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Name: ");
            Person person = new Person(scan.nextLine() );
            people.add(person);
        }
        
        Collections.sort(people);
        
        System.out.println(people.get(0));
        System.out.println(people.get(9));
    }
}