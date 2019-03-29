package MenuView;

import ConsoleKit.Menu;
import ConsoleKit.MenuItem;
import ConsoleKit.MenuStack;
import Database.Sakila;

/**
 *
 * @author Curtis
 */
public class BookAgent implements MenuItem {    // requires database to grab agents along with their availability schedules. perhaps make this a submenu of agent

    private static MenuStack menus;
    private static Menu prevMenu;
    
    public BookAgent(MenuStack menus, Menu prevMenu, Sakila db)
    {
        
    }
    
    @Override
    public void execute() {
        
    }
    
    
}
