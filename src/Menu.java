//import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {     // main app interface for starting the features.
    
    private static List<Feature> menu;      // this menu list carries SalesTracer. It can store any additional features we may wish to add later on
    
    public static void main(String[] args) {
            System.out.println("Select an item");
            
            menu = new ArrayList<>();
            
            menu.add(new SalesTracker());
            menu.add(new ViewStatus());
            
            for(Feature feature: menu)
                System.out.println(feature.toString());
            
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            
            String feature = menu.get(choice).start();
            
            
    }
    
    public static Feature selectFeature(String featureToStart)      // method to manually select a feature
    {
        menu = new ArrayList<>();
        menu.add(new SalesTracker());
        menu.add(new ViewStatus());
            
        for(Feature feature : menu)
        {
            if(feature.toString().equals(featureToStart));
            return feature;
        }
        
        return null;
    }
}
