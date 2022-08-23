package day09_ifStatement;

public class PayDay {
    public static void main(String[] args) {

        double hourlyRate = 60;
        int hoursPerWeek = 50;
        double netPay;

        if(hoursPerWeek > 40){
            // overtime calculation

            int overtimeHours = hoursPerWeek - 40;
            netPay = hourlyRate * 40; // calculate the normal pay for a week hour week
            netPay += hourlyRate * overtimeHours * 1.5; // total earned from overtime

        }else {

            // worked under or equal 40 hours, so no overtime

            netPay = hourlyRate * hoursPerWeek;


            // netpay = netPay + hourly * overtimeHours * 1.5;

        }
             System.out.println("Net pay: " + netPay);
        }
        }
