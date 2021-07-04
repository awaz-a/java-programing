package OfficeHours.Practice_03_08_2021;

public class Castingpractice {
    public static void main(String[] args) {

        // byte -
        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (short)d;
        int i2 = (int)d;
        System.out.println(i);
        System.out.println((double)i);

        float f = 3.54f;
        float f2 = (float)3.54;

        float f3 = 5;
        float f4 = 5.5f;

        long l = 22313;
        long l2 = 32123433321232L;
        System.out.println(l);
        System.out.println((double)l);
        System.out.println((float)l);
        System.out.println(l2);

        double million = 1_000_000;
        System.out.println(million);

    }
}
