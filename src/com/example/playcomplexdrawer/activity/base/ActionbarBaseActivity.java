package com.example.playcomplexdrawer.activity.base;

import android.R;
import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public abstract class ActionbarBaseActivity extends FragmentActivity {
	
	
	public abstract String getActionbarTitle();
	public abstract String getActionbarSubTitle();
	
	
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		
		getActionBar().setTitle(getActionbarTitle());
		getActionBar().setSubtitle(getActionbarSubTitle());
		
	}
	
	
	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(com.example.playcomplexdrawer.R.menu.menu_base, menu);
		return true;
	}
	
	
	
}
