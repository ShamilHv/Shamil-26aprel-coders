package az.coders.project.lesson20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

public class Task2{

    public static void main(String[] args) {

        Developer emp1= new Developer(); emp1.name="Furkan";
        Developer emp2= new Developer();emp2.name="Tural";
        Developer emp3= new Developer();emp3.name="Emin";
        Manager emp4 = new Manager();emp4.name="Alim";
        Manager emp5 = new Manager();emp5.name="Elnur";
        Manager emp6 = new Manager();emp6.name="Akif";
        Tester emp7= new Tester();emp7.name="Gunel";
        Tester emp8= new Tester();emp8.name="Arzu";
        Tester emp9= new Tester();emp9.name="Elman";

        List<Employer> list=new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        list.add(emp7);
        list.add(emp8);
        list.add(emp9);

        List<Employer> sortedlist= list.stream().sorted(Comparator.comparing(Employer::getName)).toList();
        sortedlist.stream().forEach(e-> System.out.println(e.getName()));
    }



}



abstract class Employer {
    public abstract String getName();
 public String name;
}
     class  Manager extends Employer{
    public String getName(){
        return name;
    }
    }
     class Developer extends Employer{
         public String getName(){
             return name;
         }
    }
    class Tester extends Employer{
        public String getName(){
            return name;
        }
    }

