package com.example.salesforce;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.example.salesforce.SalesTrackerModel.AgentList;

public class AppManagerActivity extends AppCompatActivity {

	private Button viewStatus;
	private Button getBallerAgent;
	private AgentList agentList = new AgentList();

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		agentList = getIntent().getParcelableExtra("AGENT_LIST");
		viewStatus = (Button) findViewById(R.id.abstract_recycleview_list);
		viewStatus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(AppManagerActivity.this, AppManagerActivity.class);
				intent.putExtra("AGENT_LIST", (Parcelable) agentList);
				startActivity(intent);
			}
		});
		getBallerAgent = (Button) findViewById(R.id.recycleview_l);
		getBallerAgent.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(AppManagerActivity.this, AppManagerActivity.class);
				intent.putExtra("LIST", (Parcelable) agentList);
				startActivityForResult(intent, 1);
			}
		});
	}

	@Override
	public void onBackPressed() {
		Log.d("Application","Moved back");
		Intent result = new Intent();
		result.putExtra("LIST", (Parcelable) agentList);
		setResult(RESULT_OK, result);
		finish();
	}
}

