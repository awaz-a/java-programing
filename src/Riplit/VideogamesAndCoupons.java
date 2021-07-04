package Riplit;
import java.util.Scanner;

public class VideogamesAndCoupons {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of coupons:");
    int couponsCNT = scan.nextInt();

    if(couponsCNT < 3){
        System.out.println("Not enough coupon");
    }else{
        int candyCount = couponsCNT/10;
        int remainingCoupons = couponsCNT % 10;
        int gumballsCount = remainingCoupons / 3;

        System.out.println("Number of Candies: " + candyCount);
        System.out.println("Number of Gumballs: " + gumballsCount);


    }
}}
