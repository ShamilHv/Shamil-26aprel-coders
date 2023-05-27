package az.coders.project.lesson12;

public class Task3 {

    public static void main(String[] args) {
        OuterInnerClass.Outer out=new OuterInnerClass.Outer();
        OuterInnerClass.Outer.Inner in=out.new Inner();
        in.writeToConsole();
    }

    static class Outer{
        public void returna(){
            Inner in2=new Inner();
            in2.writeToConsole();
            ;
        }

        class Inner{
            public void writeToConsole(){
                System.out.println("Hello world!");
            }
        }
    }
}
