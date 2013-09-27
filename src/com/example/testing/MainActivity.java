package com.example.testing;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;


public class MainActivity extends Activity {

		private CustomAdapter mAdapter;
	
		private ArrayList<String> mItems = new ArrayList<String>();
	
		@Override

		public void onCreate(Bundle savedInstanceState) {
	
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
	
	
			for (int i = 0; i<4; i++) {
			mItems.add(Integer.toString(i));
			}
	
		mAdapter = new CustomAdapter(this, mItems);
		GridView g = (GridView) findViewById(R.id.gridview);
	
		g.setAdapter(mAdapter);
		registerForContextMenu(g);
	}
}
