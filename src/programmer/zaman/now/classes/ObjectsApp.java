package programmer.zaman.now.classes;

import java.util.Objects;

public class ObjectsApp {
    private static class Data{
         private String data;

        public Data(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Data data1 = (Data) o;

            return Objects.equals(data, data1.data);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }

        @Override
        public int hashCode() {
            return data != null ? data.hashCode() : 0;
        }
    }
    public static void main(String[] args) {
        execute(null);
    }

    public static void execute(Data data){

        //sebelum menggunakan class objects
        /**
         * if(data!= null){
         * System.out.println(data.toString());
         * System.out.println(data.hashCode());
        }*/

//        seduah menggunakan class objects
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));

    }

}
