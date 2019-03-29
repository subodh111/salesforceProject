package MenuView;

import ConsoleKit.Menu;
import ConsoleKit.MenuItem;
import ConsoleKit.MenuStack;
import ConsoleKit.QuitCmd;
import Database.Sakila;
import SalesTrackerModel.AgentList;

class AppManager implements MenuItem {

        private MenuStack menus;
	private Menu mainMenu;
        private AgentList agentList;
	
	public AppManager(AgentList agentList, Menu _mainMenu, MenuStack _menus) {
		this.agentList = agentList;
		mainMenu = _mainMenu;
		menus = _menus;
	}
	
	@Override
	public void execute() {
		Menu subMenu = new Menu("App Manager", menus);
                
                subMenu.add(new ViewStatus(mainMenu,menus, new Sakila()));
                subMenu.add(new BallerAgent(this.agentList.getAgents()));
                subMenu.add(new QuitCmd());
		//subMenu.add(new ReturnFromMenu(mainMenu.toString(), menus));
                
                System.out.println("Welcome to " + subMenu.toString());
                subMenu.execute();
	}
	
	@Override
	public String toString() {
		return "Manage tasks.";
	}    
}
