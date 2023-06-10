package programmer.zaman.now.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "#", "#");

        joiner.add("Ahmad");
        joiner.add("Ihsanullah");
        joiner.add("Rabbani");

        String value = joiner.toString();
        System.out.println(value);


        String[] names = {"Ahmad", "Fauzi", "Ariyanto"};

        for(var nilai : names){
            joiner.add(nilai);
        }
        System.out.println(joiner.toString());


    }
}
