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
	public ArrayList<Fragment> getFragmentList() {
		ArrayList<Fragment> fragList = new ArrayList<Fragment>();
		fragList.add(NumberFragment.newInstance(1));
		fragList.add(NumberFragment.newInstance(2));
		fragList.add(NumberFragment.newInstance(3));
		return fragList;
	}



	
}
