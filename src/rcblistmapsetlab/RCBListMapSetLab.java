package rcblistmapsetlab;

import java.util.*;

/**
 *
 * @author rbath1
 */
public class RCBListMapSetLab {

    public static void main(String[] args) {
//        Using instructor samples as a guide, create a List 
//        (choose from Vector or ArrayList) of your favorite hobby items,
//        where each item is represented as a String value. Do not use generics. 
//        Populate the list with at least three items. Then loop through the list
//        and print out the contents to the console. Don’t forget to cast items as 
//        your retrieve them for output.
        
        //LAB #1 -10/15
        List hobbyItems = new ArrayList();
        
        hobbyItems.add("Stuff");
        hobbyItems.add("Stuff2");
        hobbyItems.add("Stuff3");
        hobbyItems.add("Stuff4");
        hobbyItems.add("Stuff5");
        hobbyItems.add("Stuff2");
        
        for (int i=0; i < hobbyItems.size();i++){
            String s = (String)hobbyItems.get(i);
            System.out.println(s);
//            or
//            Object obj = hobbyItems.get(i);
//            String item = (String)obj;
//            System.out.println(item);
//            or (with toString)
//            System.out.println(hobbyItems.get(i);
        }
        
        
//        Create a new List consisting of three Employee objects. Use generics 
//        to create your list. Now loop through the list (using the new for-each
//        style) and print out some meaningful information about each object. 
//        Verify that no cast was necessary.
        System.out.println("");
        //LAB #2 - 10/15    GENERICS
        Employee e1 = new Employee(123,"Doe", "John", "333-33-3333");
        Employee e2 = new Employee(345,"Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee(965,"Evans", "Bob", "444-44-4444");
        Employee e4 = new Employee(542,"Mallay", "Fred", "222-22-2222");
        
        List<Employee> Employees = new ArrayList<Employee>();
        
        Employees.add(e1);
        Employees.add(e2);
        Employees.add(e3);
        Employees.add(e4);
        
        
        //sort by compareTo method (empID)
//        Collections.sort(Employees);
        
        //custom class sorts by last name (EmployeeByLastName)
        Collections.sort(Employees, new EmployeeByLastName());
        
        for (Employee e : Employees){
            System.out.println(e);
        }
        //OR oldschool
//        for(int i = 0; i < Employees.size();i++){
//            System.out.println(Employees.get(i));
//        }
        
//        Create a new List consisting of one or more Employee objects, plus one or
//        more Dog objects. Do not use generics. Now loop through the list and print
//        out some meaningful information about each object. What challenges does
//        this present? How can you overcome these challenges?
        System.out.println("");
        //LAB #3 - 10/15
        List PersonDogCollection = new ArrayList();
         
         Employee e5 = new Employee(123,"Mallid", "John", "333-33-3333");
         Employee e6 = new Employee(345,"Frank", "Sally", "111-11-1111");
         Dog d1 = new Dog("Fluffy", 2);
         Dog d2 = new Dog("Sachmo", 7);
         
         PersonDogCollection.add(e5);
         PersonDogCollection.add(e6);
         PersonDogCollection.add(d1);
         PersonDogCollection.add(d2);
         
         //with toString overridden (all data)
//         for (int i=0; i<PersonDogCollection.size();i++){
//             System.out.println(PersonDogCollection.get(i));
//         }
         
         //loop for specific data
         for (int i=0; i<PersonDogCollection.size();i++){
             Object obj = PersonDogCollection.get(i);
             if(obj instanceof Employee) {
                 Employee e = (Employee)obj;
                 System.out.println(e.getLastName());
             } else if (obj instanceof Dog) {
                 Dog d = (Dog)obj;
                 System.out.println(d.getAge());
             }
         }
         
//         As in #2 above create three Employee objects, but this time make sure
//         at least two have the same social security number. Now add them
//         to a HashSet. Then loop through the HashSet and verify that only two 
//         employees can be printed out because the duplicate (last item that 
//         matches) has been removed. Now pass the Set to a List constructor and 
//         verify that your list contains the transformed Set.
         System.out.println("");
         //LAB #4 - 10/15
         Employee e7 = new Employee(123,"Mallid", "John", "333-33-3333");
         Employee e8 = new Employee(345,"Frank", "Sally", "111-11-1111");
         Employee e9 = new Employee(12,"Mallid", "John", "333-33-3333");
         Employee e10 = new Employee(345,"Frank", "Sally", "345-34-3453");
         
         //TreeSet sorts........HashSet does not
         Set Employees2 = new TreeSet();
         Employees2.add(e7);
         Employees2.add(e8);
         Employees2.add(e9);
         Employees2.add(e10);
         
       
         List EmpSetted = new ArrayList(Employees2);
         
         for (int i=0;i<Employees2.size();i++){
             System.out.println(EmpSetted.get(i));
         }
//         for (Employee e : Employees2){
//             System.out.println(e);
//         }
         
        
         
         

        
        
    }
}
