package ConsoleKit;
import java.util.Stack;

public class MenuStack {
    
    private Stack<Menu> menus;

    public MenuStack() {
        menus = new Stack<Menu>();   
    }

    public Menu getCurrent() {
        return menus.peek();
    }

    public void add(Menu menu) {
        //menus.add(menu);
        menus.push(menu);
    }
    
    public void toPreviousMenu() {
        menus.pop();
        menus.peek().execute();
    }
    
    public void run() {
        menus.peek().execute();
    }
    
    public void toFirstMenu(){
        for(int i = 0 ; i < menus.size() ; i++)
            menus.pop();
        
        menus.peek().execute();
    }
    

    public Stack<Menu> getMenus() {return menus;}

    public void setMenus(Stack<Menu> menus) {this.menus = menus;}
    
}