package MenuView;

import ConsoleKit.MenuItem;
import SalesTrackerModel.Agent;
import java.util.List;

/**
 *
 * @author Curits
 */

public class BallerAgent implements MenuItem {
    private Agent baller;
    
    public BallerAgent(List<Agent> agent)        // think about what you require when an instance of this class is instantiated
    {
        Agent baller;
        int highest = 0;
        
        for(Agent temp : agent)
        {
            if(temp.getSales() > highest)
            {
                highest = temp.getSales();
                baller = temp;
            }
        }
    }
    
    public void execute(){
        // display baller agent;
        System.out.println("Agent with Highest sales:");
        System.out.println(baller);
    }

    @Override
    public String toString() {
        return "Get the balling Agent";
    }
    
    
    
}
