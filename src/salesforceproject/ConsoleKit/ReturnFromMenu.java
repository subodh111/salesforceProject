package ConsoleKit;

public class ReturnFromMenu implements MenuItem {   // this interface returns to the main menu.
    private final String msg;
    private final MenuStack menus;
    
    public ReturnFromMenu(String prevMenuName, MenuStack _menus) {
        msg = "Return to " + prevMenuName;
        menus = _menus;
    }

    @Override
    public void execute() {
        menus.toPreviousMenu();
    }
    
    @Override
    public String toString() {
        return msg;
    }
    
}