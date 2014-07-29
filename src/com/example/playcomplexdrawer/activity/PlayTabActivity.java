package com.example.playcomplexdrawer.activity;

import java.util.ArrayList;

import com.example.playcomplexdrawer.R;
import com.example.playcomplexdrawer.R.id;
import com.example.playcomplexdrawer.R.menu;
import com.example.playcomplexdrawer.activity.base.ActionTabActivity;
import com.example.playcomplexdrawer.fragment.NumberFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.Menu;
import android.view.MenuItem;

public class PlayTabActivity extends ActionTabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.play_tab, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public ArrayList<Fragment> getFragmentList() {
		ArrayList<Fragment> fragList = new ArrayList<Fragment>();
		fragList.add(NumberFragment.newInstance(1));
		fragList.add(NumberFragment.newInstance(2));
		fragList.add(NumberFragment.newInstance(3));
		return fragList;
	}



	
}
