// Nama: Nikah Suchia Panjaitan
// NIM: 12S24041

import java.util.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String soal = sc.next();

        if (soal.equals("Soal1")) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = a + b;

            if ((a > 0 && b > 0 && sum < 0) ||
                (a < 0 && b < 0 && sum > 0)) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(sum);
            }

        } else if (soal.equals("Soal2")) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            float floatSum = (float) x + (float) y;
            double doubleSum = x + y;

            double diff = Math.abs(doubleSum - (double) floatSum);
            System.out.printf(Locale.US, "%.6f%n", diff);

        } else if (soal.equals("Soal3")) {
            int n = sc.nextInt();

            Integer a = n;
            Integer b = a;

            a = a + 1;

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        } else if (soal.equals("Soal4")) {
            String s = sc.next();

            String a = s;
            String b = new String(s);

            a = a + "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        } else if (soal.equals("Soal5")) {
            String intStr = sc.next();
            String doubleStr = sc.next();
            String boolStr = sc.next();

            int i = Integer.parseInt(intStr);
            double d = Double.parseDouble(doubleStr);
            boolean b = Boolean.parseBoolean(boolStr);

            double result = i * d;
            if (!b) result *= -1;

            System.out.printf(Locale.US, "%.2f%n", result);
        }
    }
}