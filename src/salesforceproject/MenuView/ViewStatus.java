package MenuView;

import ConsoleKit.Menu;
import ConsoleKit.MenuItem;
import ConsoleKit.MenuStack;
import ConsoleKit.QuitCmd;
import ConsoleKit.ReturnFromMenu;
import Database.Sakila;
import SalesTrackerModel.Agent;
import SalesTrackerModel.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Meshi
 */

public class ViewStatus implements MenuItem { // a prevMenu of it's own
                                            
    private static List<Customer> customers;   // don't just grab all customers right off the bat. very wasteful. wait for user command
    private static List<Agent> agents;
    private static Sakila database;
    private static Menu prevMenu;
    private static MenuStack menus;
    
    public ViewStatus(Menu prevMenu, MenuStack menus, Sakila database){            // constructs instance of database to grab all customers and agents
        this.database = database;
        this.prevMenu = prevMenu;
        this.menus = menus;
        this.agents = new ArrayList<>();
        this.customers = new ArrayList<>();
    }
    
    @Override
    public void execute()   // sub prevMenu
    {
        Menu subMenu = new Menu(this.toString(), menus);
        
        subMenu.add(new ViewCustomers(database.getAllCustomers(),subMenu,menus));  // it makes sense to reserve pulling sht out from db here. because what if u want to refresh?
        subMenu.add(new ViewAgents(database.getAllAgents(),subMenu,menus));
        
        subMenu.add(new QuitCmd());
        subMenu.add(new ReturnFromMenu(prevMenu.toString(), menus));
        
        System.out.println("Welcome to " + subMenu.toString());
        subMenu.execute();
        
    }
    
    @Override
    public String toString() {
        return "View Status Menu";
    }

}