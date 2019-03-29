/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuView;

import ConsoleKit.Menu;
import ConsoleKit.MenuItem;
import ConsoleKit.MenuStack;
import ConsoleKit.ReturnFromMenu;
import SalesTrackerModel.Customer;

/**
 *
 * @author Curtis
 */
public class CustomerStatus implements MenuItem{    // should probably make this a generic or super class. since AgentStatus has similar functionality
    private final Customer customer;
    private static MenuStack menus;
    private static Menu prevMenu;
    
    
    public CustomerStatus(MenuStack menus, Menu menu, Customer customer)
    {
        this.menus = menus;
        this.prevMenu = menu;
        this.customer = customer;
    }

    @Override
    public void execute() {
        Menu subMenu = new Menu(this.toString(),this.menus);
        subMenu.add(new ReturnFromMenu(prevMenu.toString(),menus));
        
        System.out.println("Status info for customer " + this.customer.getName());
        System.out.println(customer.toString());
        
        subMenu.execute();
    }

    @Override
    public String toString() {
        return "Status for customer: " + this.customer.getName();
    }
    
}
