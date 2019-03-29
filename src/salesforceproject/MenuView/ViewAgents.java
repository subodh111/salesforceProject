package MenuView;

import ConsoleKit.Menu;
import ConsoleKit.MenuItem;
import ConsoleKit.MenuStack;
import ConsoleKit.ReturnFromMenu;
import SalesTrackerModel.Agent;
import SalesTrackerModel.AgentList;
import java.util.List;

/**
 *
 * @author Meshi
 */

public class ViewAgents implements MenuItem {
    private static AgentList agentList;
    private static MenuStack menus;
    private static Menu prevMenu;
    
    public ViewAgents(List<Agent> agents, Menu prevMenu, MenuStack menus)
    {
        this.agentList = new AgentList(agents);
        this.prevMenu = prevMenu;
        this.menus = menus;
    }
    
    @Override
    public void execute()
    {
        Menu subMenu = new Menu(this.toString(),menus);
        subMenu.add(new ReturnFromMenu(prevMenu.toString(),menus));
    
        for(Agent agent: this.agentList.getAgents())
            subMenu.add(new AgentStatus(menus,subMenu,agent));
        
        System.out.println("Welcome to " + subMenu.toString());
        
        subMenu.execute();
        
    }

    @Override
    public String toString() {
        return "Choose from list of agents";
    }
}
