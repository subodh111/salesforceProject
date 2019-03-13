
import java.util.List;
import java.util.Scanner;

public class SalesTracker implements Feature { // this class is the main feature for implementing the sales tracking logic
    
    private static List<Agent> agents;      // list that carries agents 
    private static List<Customer> customers;    //list to carry customers extracted from database, should it be necessary for later implementations
    private static Database db;       // instantiation of database object. Hardcoded values stored in this class for now
        
    public SalesTracker(){
        
      db = new Database();
      SalesTracker.agents = db.getAgents();
        
        
    }
    
    public String start()
    {   
        System.out.println("Sales Tracker feature!");
        
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int choice;
        
        while(true)
        {
            System.out.println("1. List Deals");
            System.out.println("2. Track Sales");
            choice = scan.nextInt();
            
            if(choice == 1)
                getTopDeals();

            else if(choice == 2)
                System.out.println(getHighestSales());
            else
                break;
        }
        
        return "Ending SalesTracker Feature";
    }
    
    public static int getHighestSales()       // method that returns agent carrying highest sales.
    {
        Agent agentWithHighestSales = null;
        int sale = 0;
        for(Agent agent: SalesTracker.agents)
            if(agent.getSales() > sale)
                agentWithHighestSales = agent;
        
        return agentWithHighestSales.getSales();
    }
    
    public static void getTopDeals()
    {
        System.out.println(db.getTopDeals());
    }

    @Override
    public String toString() {
        return "SalesTracker";
    }
    
    
}
