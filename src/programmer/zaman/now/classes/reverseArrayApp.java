package programmer.zaman.now.classes;

public class reverseArrayApp {
    public static void main(String[] args) {
        String data1 = "ikhsan";
        String data2 = "ahmad";
        String data3 = "hanif";

        System.out.println(reverseArrrayApp(data1));
        System.out.println(reverseArrrayApp(data2));
        System.out.println(reverseArrrayApp(data3));
    }

    static char[] reverseArrrayApp(String values){
        char[] array = values.toCharArray();
        for(var nilai : array){
            System.out.println(nilai);
        }
        for(int i = 0; i < array.length/2; i++){
            char temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }

        return array;
    }


}
