package com.example.testing;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

public class Activity0 extends Activity {
	
		@SuppressLint ("NewApi")
		@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        
	    	super.onCreate(savedInstanceState);
	        setContentView(R.layout.grid_item);
	     
	    }

}
