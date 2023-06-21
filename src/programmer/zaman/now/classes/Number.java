package programmer.zaman.now.classes;

public class Number {
    public static void main(String[] args) {
        Integer intValue = 100;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short byteValues = doubleValue.shortValue();

        //string to number
        /*
        parseXxx(string) = digunakan untuk mengkonversi tipe data string ke number yang primitf
        valueOf(string) = digunakan untuk mengkonversi tipe data string ke number yang non primitf
         */

        String nilai = "100";

        Integer intNilai = Integer.valueOf(nilai);
        char[] nilaiCharArray = nilai.toCharArray();
        for(var karakter : nilaiCharArray){
            System.out.println(karakter);
        }

        System.out.println(intNilai);
    }
}
