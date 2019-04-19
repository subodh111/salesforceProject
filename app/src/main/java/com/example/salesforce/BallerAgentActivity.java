package com.example.salesforce;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import com.example.salesforce.SalesTrackerModel.Agent;
import com.example.salesforce.SalesTrackerModel.AgentList;

/**
 *
 * @author Curits
 */

public class BallerAgentActivity extends AppCompatActivity {
    private AgentList list;
    private Agent agent;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview_list);
        getSupportActionBar().setTitle("Baller agent");
        list =  getIntent().getParcelableExtra("AGENT_LIST");
        recyclerView = findViewById(R.id.abstract_recycleview_list);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        Log.d("Application","Moved back");
        Intent result = new Intent();
        result.putExtra("AGENT_LIST", (Parcelable) list);
        setResult(RESULT_OK, result);
        finish();
    }
    
    public Agent getHighestAgent()
    {
        Agent baller = null;
        int highest = 0;
        
        for(Agent temp : list.getAgents())
        {
            if(temp.getSales() > highest)
            {
                highest = temp.getSales();
                baller = temp;
            }
        }
        return baller;
    }

}
