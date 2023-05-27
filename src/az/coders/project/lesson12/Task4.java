package az.coders.project.lesson12;

public class Task4 {
    public static void main(String[] args) {
        Outer.Inner a= new Outer.Inner();
        a.write();
    }
    class Outer{
                static class Inner{
            public void write(){
                System.out.println("hiii");
            }
        }
    }
}
