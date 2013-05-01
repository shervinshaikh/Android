package edu.ucsb.cs.cs185.shervinater.colormexml;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
//	
	public void turnRed(View view){
		//setContentView(R.layout.main);
		LinearLayout main = (LinearLayout)findViewById(R.id.background);
		main.setBackgroundColor(getResources().getColor(R.color.red));
	}
	
	public void turnGreen(View view){
		//setContentView(R.layout.main);
		LinearLayout main = (LinearLayout)findViewById(R.id.background);
		main.setBackgroundColor(getResources().getColor(R.color.green));
	}
	
	public void turnBlue(View view){
		//setContentView(R.layout.main);
		LinearLayout main = (LinearLayout)findViewById(R.id.background);
		main.setBackgroundColor(getResources().getColor(R.color.blue));
	}
	
	public void turnYellow(View view){
		//setContentView(R.layout.main);
		LinearLayout main = (LinearLayout)findViewById(R.id.background);
		main.setBackgroundColor(getResources().getColor(R.color.yellow));
	}

}
