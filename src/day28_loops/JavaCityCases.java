package day28_loops;

import java.time.LocalDate;

public class JavaCityCases {
    public static void main(String[] args) {

        int totalCases = 0;
        for (int day = 1; day <= 30; day++) {
            if (totalCases % 7 == 0){
                totalCases += 500;
            }else {
                totalCases += 200;
            }
            System.out.println("day " + day + " | total cases : " + totalCases);
        }

        System.out.println("javaCity 11/2021 total cases " + totalCases);
    }
}
