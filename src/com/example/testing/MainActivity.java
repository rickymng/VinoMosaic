package com.example.testing;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;


public class MainActivity extends Activity {
	
		//Main function when program begins
		@Override
		public void onCreate(Bundle savedInstanceState) {
	
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
	
			GridView g = (GridView) findViewById(R.id.gridview);
			g.setAdapter(new MainPageAdapter(this));
			
			g.setOnItemClickListener(  new OnItemClickListener () {

				@Override
				public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
					
					CallSubPage (position);
				}
				
			});
			}
		
		
		//Sub function to trigger SubActivity from Main Menu
		public void CallSubPage (int position) {
			
			Intent intent = null;
			
			switch (position) {
			
			case 0:
				intent = new Intent (getApplicationContext(), Activity0.class);
				break;
			
			case 1:
				intent = new Intent (getApplicationContext(), Activity1.class);
				break;
				
			}
			
			startActivity(intent);
		}
		

}
