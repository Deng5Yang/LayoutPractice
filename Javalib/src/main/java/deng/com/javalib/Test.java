package deng.com.javalib;

public class Test {

    public static void main(String[] args) {
        Student Tom = new Student("0001","Tom",60,55);
        Student Gary = new Student("0002","Gary",90,80);
        Tom.score();
        Gary.score();
    }

}
