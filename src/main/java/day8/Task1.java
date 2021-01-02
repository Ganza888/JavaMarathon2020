package day8;

public class Task1 {
    public static long measure1() {
        long start = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            String string = new String(String.valueOf(i + " "));
            System.out.print(string);
        }
        long end = System.nanoTime();
        long time1 = end - start;
        return time1;
    }
    public static long measure2() {
        long st = System.nanoTime();
        for (int i = 0; i <= 20000; i++){
            StringBuilder sb = new StringBuilder(i + " ");
            System.out.print(sb.toString());
        }
        long en = System.nanoTime();
        long time2 = en - st;
        return time2;
    }
    public static void main(String[] args) {
        System.out.println(String.format("%,12d",measure1()) + " ns");
        System.out.println(String.format("%,12d",measure2()) + " ns");
    }
}
