package az.coders.project.lesson12;

public  class OuterInnerClass {

    public static void main(String[] args) {
        Outer out=new Outer();
        Outer.Inner in=out.new Inner();
        in.writeToConsole();
    }
    static class Outer{
        class Inner{
            public void writeToConsole(){
                System.out.println("Hello world!");
            }
        }
    }
}
