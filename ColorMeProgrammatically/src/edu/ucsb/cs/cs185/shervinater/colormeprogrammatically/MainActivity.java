package edu.ucsb.cs.cs185.shervinater.colormeprogrammatically;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
		final LinearLayout layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.HORIZONTAL);
		
		
			//LinearLayout row = new LinearLayout(this);
			//row.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
			
			Button red = new Button(this);
			red.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT, 1f));
			red.setText(R.string.red);
			red.setId(1);
			red.setOnClickListener(new View.OnClickListener() {
	             public void onClick(View v) {
	                 // Perform action on click
	            	 layout.setBackgroundColor(getResources().getColor(R.color.red));
	             }
	         });
			
			Button green = new Button(this);
			green.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT, 1f));
			green.setText(R.string.green);
			green.setId(2);
			green.setOnClickListener(new View.OnClickListener() {
	             public void onClick(View v) {
	                 // Perform action on click
	            	 layout.setBackgroundColor(getResources().getColor(R.color.green));
	             }
	         });
			
			Button blue = new Button(this);
			blue.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT, 1f));
			blue.setText(R.string.blue);
			blue.setId(3);
			blue.setOnClickListener(new View.OnClickListener() {
	             public void onClick(View v) {
	                 // Perform action on click
	            	 layout.setBackgroundColor(getResources().getColor(R.color.blue));
	             }
	         });
			
			Button yellow = new Button(this);
			yellow.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT, 1f));
			yellow.setText(R.string.yellow);
			yellow.setId(4);
			yellow.setOnClickListener(new View.OnClickListener() {
	             public void onClick(View v) {
	                 // Perform action on click
	            	 layout.setBackgroundColor(getResources().getColor(R.color.yellow));
	             }
	         });
			
				
			layout.addView(red);
			layout.addView(green);
			layout.addView(blue);
			layout.addView(yellow);
		
		
		
		setContentView(layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
