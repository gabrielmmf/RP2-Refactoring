import java.util.Enumeration;

public class TextStatement extends Statement {
    public String showResultCustomer(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() +
                "\n";
    }

    public String showResultRental(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" +
                String.valueOf(each.getCharge()) + "\n";
    }

    public String showResultOwe(Customer aCustomer) {
        return "Amount owed is " +
                String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    public String showResultEarned(Customer aCustomer) {
        return "You earned " +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
    }

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = showResultCustomer(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for each rental
            result += showResultRental(each);
        }
        // add footer lines
        result += showResultOwe(aCustomer);
        result += showResultEarned(aCustomer);
        return result;
    }
}