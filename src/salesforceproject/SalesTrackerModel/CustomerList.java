package SalesTrackerModel;

/**
 *
 * @author Curtis
 */

import java.util.List;

public class CustomerList { // like allreminder
    private static List<Customer> customers;
    
    public CustomerList(List<Customer> customers)
    {
        this.customers = customers;
    }

    public static List<Customer> getCustomers() {
        return customers;
    }
}
