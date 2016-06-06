package com.example.homepage;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends Activity {

	private GridView mGridView;
	private List<TypeInfo> list = new ArrayList<TypeInfo>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mGridView = (GridView) findViewById(R.id.GV_home);
		for(int i=0;i<13;i++){
			TypeInfo info = new TypeInfo();
			info.name="×¨Ìâ"+i;
			list.add(info);
		}
		TypeAdapter adapter = new TypeAdapter();
		mGridView.setAdapter(adapter);
	}
	
	private class TypeAdapter extends BaseAdapter{

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return list.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return list.get(position);
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View view = View.inflate(getBaseContext(), R.layout.item_gridview_new, null);
			TextView tvTitle = (TextView) view.findViewById(R.id.tv_title);
			String nameStr = list.get(position).name;
			tvTitle.setText(nameStr);
			return view;
		}
		
	}


}
