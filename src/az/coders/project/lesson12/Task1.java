package az.coders.project.lesson12;

public class Task1 {
    public static void main(String[] args) {
        int pts = 100;
        Grade myPts = Grade.A;
        if (pts > 90 && pts <= 100) {
            myPts = Grade.A;
        } else if (pts > 80 && pts <= 90) {
            myPts = Grade.B;
        } else if (pts > 70 && pts <= 80) {
            myPts = Grade.C;
        } else if (pts > 60 && pts <= 70) {
            myPts = Grade.D;
        } else if (pts > 50 && pts <= 60) {
            myPts = Grade.E;
        } else if (pts <= 50 && pts >= 0) {
            myPts = Grade.F;
        }else{
            myPts=Grade.Unvalid;
        }
        switch (myPts) {
            case A:
                System.out.println("A");
                break;
            case B:
                System.out.println("B");
                break;
            case C:
                System.out.println("C");
                break;
            case D:
                System.out.println("D");
                break;
            case E:
                System.out.println("E");
                break;
            case F:
                System.out.println("F");
                break;
            default:
                System.out.println("Unvalid");
        }


    }
    enum Grade {
        A,
        B,
        C,
        D,
        E,
        F,
        Unvalid

    }
}
