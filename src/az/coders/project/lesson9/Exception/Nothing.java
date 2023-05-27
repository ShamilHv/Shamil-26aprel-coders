package az.coders.project.lesson9.Exception;

import java.io.IOException;

public class Nothing {
    public static void main(String[] args) throws Exception {
        int distance =3;
        dist(distance);
        System.out.println(dist(distance));





    }

    public static int dist(int dist)throws Exception{
        if(dist!=3){
            throw new IOException();
        }
return 4;
    }
}
