package com.example.testing;


import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainPageAdapter extends BaseAdapter {
	
	private Context mContext;
	
	public MainPageAdapter(Context c) {
		mContext = c;
	}
	
	
	@Override
	public int getCount() {
		return mThumbId.length;
		
	}

	
	@Override
	public Object getItem(int position) {
		return null;
	}

	
	@Override
	public long getItemId(int position) {
		return 0;
	}

	//Inflate the icons and text
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	
		View v = convertView;

		if (v == null) {
			
			//Activates GridItem Layout
			LayoutInflater li = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = li.inflate(R.layout.grid_item, null);
		
			//Display image
			ImageView iv = (ImageView)v.findViewById(R.id.grid_item_image);
			iv.setImageResource(mThumbId[position]);
			
			//Display text
			TextView tv = (TextView)v.findViewById(R.id.grid_item_text);
			tv.setTextColor(Color.WHITE);
			tv.setText(mText[position]);

				
		}
		return v;
	}
	
	//Reference to Icon Image and Text
	private int[] mThumbId = {
			R.drawable.ic_tab_chardonnay,
			R.drawable.ic_dialog_chardonnay,
			R.drawable.ic_action_glossary,			
			R.drawable.ic_tab_chardonnay
	};
	
	private String[] mText = {
			"Glossary",
			"Review",
			"Others",
			"About"
	};
	
}