package MenuView;

import ConsoleKit.Menu;
import ConsoleKit.MenuItem;
import ConsoleKit.MenuStack;
import ConsoleKit.ReturnFromMenu;
import SalesTrackerModel.Agent;

/**
 *
 * @author Tim
 */
public class AgentStatus implements MenuItem{

    private final Agent agent;
    private static MenuStack menus;
    private static Menu prevMenu;
    
    public AgentStatus(MenuStack menus, Menu prevMenu, Agent agent)
    {
        this.menus = menus;
        this.prevMenu = prevMenu;
        this.agent = agent;
    }

    @Override
    public void execute() {     // compute logic here.
        
        Menu subMenu = new Menu(this.toString(),this.menus);
        subMenu.add(new ReturnFromMenu(prevMenu.toString(),menus));
        //subMenu.add(new BookAgent(this.agent))
        
        System.out.println("Status info for Agent " + this.agent.getName());    // could probably add a Book feature here as well. as well as qeueing one
        System.out.println(agent.toString());
        
        subMenu.execute();
        
    }

    @Override
    public String toString() {
        return "Status for Agent: " + this.agent.getName();
    }
    
}