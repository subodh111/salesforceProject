package MenuView;

import ConsoleKit.Menu;
import ConsoleKit.MenuItem;
import ConsoleKit.MenuStack;
import ConsoleKit.ReturnFromMenu;
import SalesTrackerModel.Customer;
import SalesTrackerModel.CustomerList;
import java.util.List;

/**
 *
 * @author Meshi
 */

public class ViewCustomers implements MenuItem{  // thinking about what resource to input in here. Db or just a simple List. perhaps DB. depends on how u want things oriented
    private static CustomerList customerList;
    private static MenuStack menus;
    private static Menu prevMenu;
    
    public ViewCustomers(List<Customer> customers, Menu prevMenu, MenuStack menus)
    {
        this.customerList = new CustomerList(customers);
        this.prevMenu = prevMenu;
        this.menus = menus;
    }
    
    @Override
    public void execute()
    {
        Menu subMenu = new Menu(this.toString(),menus);
        subMenu.add(new ReturnFromMenu(prevMenu.toString(),menus));
        
        for(Customer customer: this.customerList.getCustomers())
            subMenu.add(new CustomerStatus(menus,subMenu,customer));
        
        System.out.println("Welcome to " + subMenu.toString());
        subMenu.execute();
        
    }

    @Override
    public String toString() {
        return "Choose from list of customers";
    }
    
}
