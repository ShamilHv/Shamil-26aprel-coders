package az.coders.project.lesson16;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {

        List<String> names= List.of("asd","asdnkja","asdnkjsakl","as","a","asdanl","sdsds","sdfnskj","sfdnjs","sdlfnm");
        List <String> sorted= names.stream().filter(x->x.length()>3).sorted(Comparator.comparingInt(String::length).reversed()).limit(5).map(String::toUpperCase).toList();
        sorted.stream().forEach(System.out::println);
    }

}
