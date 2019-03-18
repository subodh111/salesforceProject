import java.util.ArrayList;
import java.util.List;
import javax.management.Query;

public class Database {     // this database class is meant to mimic a framework that connects to the database.
    private static String getAgentByName = "SELECT agent FROM Sakila c WHERE agent.name = ";
    private static String getCustomerById = "SELECT customer FROM Customer c WHERE customer.customerId = ";
    
    public static Customer getCustomerById(String id)       // hard coded values for now
    {
       Query query = new Query();
       return new Customer(id);
      // return query.execute(getCustomerById + id);
    }
    
    public static Agent getAgentByName(String name) // hard coded values for now
    {
        Query query = new Query();
        //return query.execute(getAgentByName + name);
        return new Agent(name);
    }
    
    public static List<Agent> getAgents()       // hard coded values for now
    {
        List<Agent> agents = new ArrayList<>();
        agents.add(new Agent("Bob"));
        agents.add(new Agent("Tim"));
        
        return agents;
    }
    
    public List<Product> getTopDeals()      // returns heard coded Values for products
    {
        // returns top 10 products
         List<Product> topProducts = new ArrayList<>();
        topProducts.add(new Product("Something",102.21));
        topProducts.add(new Product("Something2",21.23));
        
        return topProducts;
    }
    
    public List<Customer> getAllCustomers()     // returns hard coded values for Customers
    {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Bob"));
        customers.add(new Customer("Tim"));
        
        return customers;
    }
    
    
}
