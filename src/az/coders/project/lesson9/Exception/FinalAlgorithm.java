package az.coders.project.lesson9.Exception;

public class FinalAlgorithm {

    public static void main(String[] args) {
        try{  String str="sjdnfakj";
            String real=str;
            str="jsadf";
if (real!=str){
    checkCondition(str,real);
}
        }catch (CompileTimeException e){
            System.out.println("You cannot change value of final variable");
        }
    }

public static void checkCondition (String value,String real) throws CompileTimeException{
if(value!=real){
    throw new CompileTimeException("Final value cannot be changed");
}

}
}
