package programmer.zaman.now.classes;

public class RuntimeApp {
    public static void main(String[] args) {
        //mengakses fungsi getRUntime di kelas static Runctime
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        //memori yang dimaksud adalah memori jvm
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());

    }
}
