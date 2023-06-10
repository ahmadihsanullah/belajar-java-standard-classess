package programmer.zaman.now.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
       try {
           Properties properties = new Properties();
           //mengakses file application.properties menggunakan FileInputStream()
           properties.load(new FileInputStream("application.properties"));

           //membaca value dari keynya dengan menggunakan fungsi getproperty
           System.out.println(properties.getProperty("name.first"));
           System.out.println(properties.getProperty("name.middle"));
           System.out.println(properties.getProperty("name.last"));
       }catch (FileNotFoundException exception){
           System.out.println("Error membuat file");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

       //mencoba menambah file properties baru
        try{
            Properties properties2 = new Properties();
            //memberikan key value dengan put
            properties2.put("name.first", "Hanif");
            properties2.put("name.middle", "Hizbul");
            properties2.put("name.last", "Haq");

//            simpan ke file baru menggunakan store(file(), komen ) lalu FIleOutputStream()
            properties2.store(new FileOutputStream("name.properties"), "KOnfigurasi Nama");
            //menmabh
        }catch (FileNotFoundException exception){
            System.out.println("file tidak ditemukan");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
