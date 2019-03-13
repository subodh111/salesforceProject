import java.util.List;
import java.util.Scanner;

public class ViewStatus implements Feature{        // this is another feature that views a list of customers/agents and allows user to select one.
                                            
    private static List<Customer> customers;
    private static List<Agent> agents;
    private static Database db;
    
    public ViewStatus(){            // constructs instance of database to grab all customers and agents
        db = new Database();
        ViewStatus.customers = db.getAllCustomers();
        ViewStatus.agents = db.getAgents();
    }
    
    public String start()
    {
        System.out.println("View Status section!");
        int choice;
        //get agents or customers
        
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("View Customer or Agents?");
            System.out.println("1. View Agents");
            System.out.println("2. View Customers");
            choice = scan.nextInt();
            
            if(choice == 1)
                viewAgents();
            
            else if(choice == 2)
                viewCustomers();
            else
                break;
        }
        
        
        return "Ending ViewStatus Feature";
    }
    
    public static Agent getAgentByName(String name)
    {
        return db.getAgentByName(name);
    }
    
    public static Customer getCustomerById(String id)
    {
        return db.getCustomerById(id);
    }
    
    public static Agent viewAgents()
    {
        for(Agent nameOfAgent : agents)
        {
            System.out.println(nameOfAgent);
        }
         Scanner scan = new Scanner(System.in);
         String choice = scan.nextLine();
         
         return db.getAgentByName(choice);
        
    }
    
    public static Customer viewCustomers()
    {
        for(Customer customer : customers)
        {
            System.out.println(customer.getId());
        }
         Scanner scan = new Scanner(System.in);
         String choice = scan.nextLine();
          
         return db.getCustomerById(choice);
    }
    
    @Override
    public String toString() {
        return "ViewStatus";
    }
}
