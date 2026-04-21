public class UtilityBill implements Billable {

    public double calculateTotal(int units) {
        double amount = 0;

        if (units <= 100) {
            amount = units * 1.0;
        } 
        else if (units <= 300) {
            amount = (100 * 1.0) + ((units - 100) * 2.0);
        } 
        else {
            amount = (100 * 1.0) + (200 * 2.0) + ((units - 300) * 5.0);
        }

        return amount;
    }

    public int calculateUnits(int prev, int curr) throws InvalidMeterReadingException {
        if (curr < prev) {
            throw new InvalidMeterReadingException("Current reading cannot be less than previous reading!");
        }
        else if (curr < 0) {
            throw new InvalidMeterReadingException("Meter reading cannot be negative!");
        }
        return curr - prev;
    }
}