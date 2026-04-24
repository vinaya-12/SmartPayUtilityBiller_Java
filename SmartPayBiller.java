import java.util.Scanner;

public class SmartPayBiller {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UtilityBill bill = new UtilityBill();

        while (true) {
            try {
                System.out.println("\nEnter Customer Name (or type Exit to stop): ");
                String name = sc.nextLine();

                if (name.equalsIgnoreCase("Exit")) {
                    break;
                }

                System.out.print("Enter Previous Meter Reading: ");
                int prev = sc.nextInt();

                System.out.print("Enter Current Meter Reading: ");
                int curr = sc.nextInt();
                

                int units = bill.calculateUnits(prev, curr);

                double totalAmount = bill.calculateTotal(units);
                double tax = totalAmount * 0.05;
                double finalAmount = totalAmount + tax;

                
                System.out.println("\nDIGITAL RECEIPT");
                System.out.println("Customer Name   : " + name);
                System.out.println("Units Consumed  : " + units);
                System.out.println("Base Amount     : Rs." + totalAmount);
                System.out.println("Tax (5%)        : Rs." + tax);
                System.out.println("Final Amount    : Rs." + finalAmount);
               
            } 
            catch (InvalidMeterReadingException e) {
                System.out.println(e.getMessage());
            } 
            catch (Exception e) {
                System.out.println("Invalid input");
                sc.nextLine(); 
            }

        }

        sc.close();
    }
    

    
}
