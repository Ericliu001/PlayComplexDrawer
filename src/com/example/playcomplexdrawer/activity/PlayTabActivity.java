package com.example.playcomplexdrawer.activity;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.playcomplexdrawer.activity.base.ActionTabActivity;
import com.example.playcomplexdrawer.fragment.NumberFragment;
import com.example.playcomplexdrawer.fragment.base.TabListFragment;

public class PlayTabActivity extends ActionTabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}


	@Override
	public ArrayList<TabListFragment> getFragmentList() {
		ArrayList<TabListFragment> fragList = new ArrayList<TabListFragment>();
		fragList.add(NumberFragment.newInstance(1));
		fragList.add(NumberFragment.newInstance(2));
		fragList.add(NumberFragment.newInstance(3));
		fragList.add(NumberFragment.newInstance(4));
		fragList.add(NumberFragment.newInstance(5));
		fragList.add(NumberFragment.newInstance(6));
		fragList.add(NumberFragment.newInstance(7));
		fragList.add(NumberFragment.newInstance(8));
		fragList.add(NumberFragment.newInstance(9));
		fragList.add(NumberFragment.newInstance(10));
		fragList.add(NumberFragment.newInstance(11));
		fragList.add(NumberFragment.newInstance(12));
		
		return fragList;
	}


	@Override
	public String getActionbarTitle() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getActionbarSubTitle() {
		// TODO Auto-generated method stub
		return null;
	}





	
}
