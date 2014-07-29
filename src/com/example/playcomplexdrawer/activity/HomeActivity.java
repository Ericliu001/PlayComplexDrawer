package com.example.playcomplexdrawer.activity;

import com.example.playcomplexdrawer.R;
import com.example.playcomplexdrawer.R.id;
import com.example.playcomplexdrawer.R.layout;
import com.example.playcomplexdrawer.activity.base.NaviDrawerActivity;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeActivity extends NaviDrawerActivity  {
	MenuItem menuItem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ViewGroup layout = (ViewGroup) findViewById(R.id.content_frame);


	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		switch (id) {
		case R.id.action_refresh:

			menuItem = item;
			menuItem.setActionView(R.layout.progressbar);
			new UpdateTask().execute();
			break;

		default:
			break;
		}

		return super.onOptionsItemSelected(item);
	}





	private class UpdateTask extends AsyncTask<Void, Integer, Void> {

		@Override
		protected Void doInBackground(Void... params) {
			// TODO Auto-generated method stub
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
		}
		
		@Override
		protected void onPostExecute(Void result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
			
			menuItem.setActionView(null);
		}
	}
}
