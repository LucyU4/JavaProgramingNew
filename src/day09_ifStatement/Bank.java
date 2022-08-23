package day09_ifStatement;

import com.sun.security.jgss.GSSUtil;

public class Bank {
    public static void main(String[] args) {

        double balance = 1_000_000;
        double amountToWithdraw = 500_000;

        balance -= amountToWithdraw; // balance = balance - amountToWithdraw;
        System.out.println("Withdraw: " + amountToWithdraw); amountToWithdraw = -500_000;

        if (balance >=0){
            System.out.println("Account balance is: " + balance);
    }

        if(balance<0){
            System.out.println("Overdraft penalty");
            System.out.println("penalty due: " + amountToWithdraw * 0.25);

        }
    }
}
