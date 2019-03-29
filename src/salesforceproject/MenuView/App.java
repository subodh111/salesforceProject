package MenuView;

import ConsoleKit.Menu;
import ConsoleKit.MenuStack;
import SalesTrackerModel.Agent;
import SalesTrackerModel.AgentList;
import java.util.ArrayList;
import java.util.List;



public class App {  // add another interace where user can book an Agent and carry a list of Agents. perhaps even add a queue of booking agents
    
    public static void main(String[] args) {
        
        // instantiate instance of list of Agents from here.
        // makes sense since if it's pulled from the DB, it's an object of it's own

        // perhaps make this a static method? Like a console kit
        
        List<Agent> agents = new ArrayList<>();
        AgentList agentList = new AgentList(agents);
        MenuStack menuStack = new MenuStack();
        Menu menu = new Menu("Main Menu for tasks",menuStack);
     //   ViewStatus viewStatus = new ViewStatus(menu,menuStack,new Sakila());    // hardcode sakila for now since it's not setup yet
        AppManager app = new AppManager(agentList,menu,menuStack);
        
        while(true)
            app.execute();
    }
}