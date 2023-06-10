package programmer.zaman.now.classes;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String query = "Ahmad Ihsanullah Rabbani";

        //melakukan enkripsi
        String encode = Base64.getEncoder().encodeToString(query.getBytes(StandardCharsets.UTF_8));
        System.out.println(encode);

        //mencoba dekrip kembali dari hasil enkripsi
        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println(decode);

    }
}
