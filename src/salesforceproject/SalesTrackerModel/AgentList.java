package SalesTrackerModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Curtis
 */
public class AgentList {
    private static List<Agent> listOfAgents;
    
    public AgentList()
    {
        listOfAgents = new ArrayList<>();
    }
    
    public AgentList(List<Agent> list)
    {
        listOfAgents = list;
    }
    
    public void addAgent(Agent agent)
    {
        listOfAgents.add(agent);
    }
    public void removeAgent(String name)
    {
        for(Agent agent : listOfAgents)
            if(agent.getName().equals(name))
                listOfAgents.remove(agent);
                
    }
    
    public Agent getAgentWithHighestSales()
    {
        int highest = 0;
        Agent baller = null;
        for(Agent agent : listOfAgents)
        {
            if(agent.getSales() > highest)
                baller = agent;
        }
        
        return baller;
    }
    
    public Agent getAgentByName(String name)
    {
        for(Agent agent : listOfAgents)
        {
            if(agent.getName().equals(name))
                return agent;
        }
        
        return null;
    }
    
    public boolean isEmpty()
    {
        return listOfAgents.isEmpty();
    }
    
    public int size()
    {
        return listOfAgents.size();
    }
    
    public List<Agent> getAgents(){
        return listOfAgents;
    }
}