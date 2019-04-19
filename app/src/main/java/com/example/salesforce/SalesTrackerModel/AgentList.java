package com.example.salesforce.SalesTrackerModel;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Curtis
 */
public class AgentList implements Parcelable {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static List<Agent> listOfAgents;


    protected AgentList(Parcel in) {
        in.readList(listOfAgents, AgentList.class.getClassLoader());
    }


    public static final Creator<AgentList> CREATOR = new Creator<AgentList>() {
        @Override
        public AgentList createFromParcel(Parcel in) {
            return new AgentList(in);
        }

        @Override
        public AgentList[] newArray(int size) {
            return new AgentList[size];
        }
    };


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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(listOfAgents);
    }
}