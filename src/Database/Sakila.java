package Database;
 
import Inventory.Product;
import SalesTrackerModel.Agent;
import SalesTrackerModel.Customer;
import java.util.ArrayList;
import java.util.List;

public class Sakila {
    private static String getAgentByName = "SELECT agent FROM Sakila c WHERE agent.name = ";
    private static String getCustomerById = "SELECT customer FROM Customer c WHERE customer.customerId = ";
    
    public static Customer getCustomerById(String id)       // hard coded values for now
    {
       return new Customer(id);
      // return query.execute(getCustomerById + id);
    }
    
    public static Agent getAgentByName(String name) // hard coded values for now
    {
        //return query.execute(getAgentByName + name);
        return new Agent(name);
    }
    
    public static List<Product> getTopDeals()      // shouldn't really be here. more of a menu interface method
    {
        // returns top 10 products
         List<Product> topProducts = new ArrayList<>();
        topProducts.add(new Product("Something",102.21));
        topProducts.add(new Product("Something2",21.23));
        
        return topProducts;
    }
    
    public static List<Customer> getAllCustomers()     // returns hard coded values for Customers
    {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Meshi"));
        customers.add(new Customer("Raj"));
        
        return customers;
    }
    
    public static List<Agent> getAllAgents()
    {
        List<Agent> agents = new ArrayList<>();
        agents.add(new Agent("Tim"));
        agents.add(new Agent("Curtis"));
        
        return agents;
    }
    
    
}
