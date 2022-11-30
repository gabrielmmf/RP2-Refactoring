
import java.util.Enumeration;

public abstract class Statement {

    abstract String showResultCustomer(Customer aCustomer);

    abstract String showResultRental(Enumeration rentals);

    abstract String showResultOwe(Customer aCustomer);

    abstract String showResultEarned(Customer aCustomer);

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = showResultCustomer(aCustomer);
        while (rentals.hasMoreElements()) {
            result += showResultRental(rentals);
        }
        // add footer lines
        result += showResultOwe(aCustomer);
        result += showResultEarned(aCustomer);
        return result;
    }
}
