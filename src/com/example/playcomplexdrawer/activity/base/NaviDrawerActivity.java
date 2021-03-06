package com.example.playcomplexdrawer.activity.base;

import com.example.playcomplexdrawer.R;
import com.example.playcomplexdrawer.R.array;
import com.example.playcomplexdrawer.R.drawable;
import com.example.playcomplexdrawer.R.id;
import com.example.playcomplexdrawer.R.layout;
import com.example.playcomplexdrawer.R.menu;
import com.example.playcomplexdrawer.R.string;
import com.example.playcomplexdrawer.activity.HomeActivity;
import com.example.playcomplexdrawer.activity.PlayTabActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;


public class NaviDrawerActivity extends FragmentActivity implements OnItemClickListener {
	
	private DrawerLayout mDrawerLayout;
	private LinearLayout mDrawerListLayout;
	private ListView drawerList;
	
	private ActionBarDrawerToggle mDrawerToggle;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi_drawer);
        
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerListLayout = (LinearLayout) findViewById(R.id.drawerListLayout);
        drawerList = (ListView) findViewById(R.id.drawer_list);
        drawerList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        drawerList.setItemChecked(0, true);
        drawerList.setOnItemClickListener(this);
        drawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_row, getResources().getStringArray(R.array.navi_drawer_list)));
        
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.drawable.ic_drawer, R.string.drawer_open, R.string.drawer_close){
        	
        	@Override
        	public void onDrawerOpened(View drawerView) {
        		// TODO Auto-generated method stub
        		super.onDrawerOpened(drawerView);
        		invalidateOptionsMenu();
        	}
        	
        	@Override
        	public void onDrawerSlide(View drawerView, float slideOffset) {
        		// TODO Auto-generated method stub
        		super.onDrawerSlide(drawerView, slideOffset);
        		if (slideOffset > 0.2) {
					
				}
        	}
        	
        	@Override
        	public void onDrawerClosed(View drawerView) {
        		// TODO Auto-generated method stub
        		super.onDrawerClosed(drawerView);
        		invalidateOptionsMenu();
        	}
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
    }


    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
    	// TODO Auto-generated method stub
    	
    	boolean isDrawerOpen = mDrawerLayout.isDrawerOpen(mDrawerListLayout);
    	menu.findItem(R.id.action_settings).setVisible(! isDrawerOpen);
    	menu.findItem(R.id.action_create).setVisible(! isDrawerOpen);
    	return super.onPrepareOptionsMenu(menu);
    }
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
	public void onItemClick(AdapterView<?> listview, View row, int position, long id) {
		// TODO Auto-generated method stub
		drawerList.setItemChecked(position, true);
		Intent intent;
		if (position == 0) {
			intent = new Intent(this, HomeActivity.class);
			startActivity(intent);
		}else if (position == 1) {
			intent = new Intent(this, PlayTabActivity.class);
			startActivity(intent);
		}
		
		mDrawerLayout.closeDrawers();
	}
	
	
	  @Override
	    protected void onPostCreate(Bundle savedInstanceState) {
	        super.onPostCreate(savedInstanceState);
	        // Sync the toggle state after onRestoreInstanceState has occurred.
	        mDrawerToggle.syncState();
	    }

	    @Override
	    public void onConfigurationChanged(Configuration newConfig) {
	        super.onConfigurationChanged(newConfig);
	        mDrawerToggle.onConfigurationChanged(newConfig);
	    }

	    @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	        // Pass the event to ActionBarDrawerToggle, if it returns
	        // true, then it has handled the app icon touch event
	        if (mDrawerToggle.onOptionsItemSelected(item)) {
	          return true;
	        }
	        // Handle your other action bar items...

	        return super.onOptionsItemSelected(item);
	    }
}
