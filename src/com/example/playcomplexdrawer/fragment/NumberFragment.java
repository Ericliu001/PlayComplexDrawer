package com.example.playcomplexdrawer.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.playcomplexdrawer.R;
import com.example.playcomplexdrawer.fragment.base.TabListFragment;

public class NumberFragment extends TabListFragment {
	
	public static final String POSITION = null;


	public NumberFragment(){}
	
	
	public static NumberFragment newInstance(int position){
		NumberFragment frag = new NumberFragment();
		Bundle args = new Bundle();
		args.putInt(POSITION, position);
		frag.setArguments(args);
		return frag;
	}
	
	
	


	@Override
	public String getTabTitle() {
		// TODO Auto-generated method stub
		return  (getArguments().getInt(POSITION)) +  "日";
	}


	@Override
	public View getTabView() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		Log.d("fragment", "onAttach " + "\"Frag" + getArguments().getInt(POSITION) +"\"");
		super.onAttach(activity);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.d("fragment", "onCreate " + "\"Frag" + getArguments().getInt(POSITION) +"\"");
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.d("fragment", "onCreateView " + "\"Frag" + getArguments().getInt(POSITION) +"\"");
		
		View rootView = inflater.inflate(R.layout.fragment_number, container, false);
		TextView tvMain = (TextView) rootView.findViewById(R.id.tvMain);
		int position = getArguments().getInt(POSITION);
		tvMain.setText("Position: "+ position);
		
		return rootView;
	}
	
	
	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.d("fragment", "onActivityCreated " + "\"Frag" + getArguments().getInt(POSITION) +"\"");
		super.onActivityCreated(savedInstanceState);
	}
	
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		Log.d("fragment", "onStart " + "\"Frag" + getArguments().getInt(POSITION) +"\"");
		super.onStart();
	}
	
	
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		Log.d("fragment", "onResume " + "\"Frag" + getArguments().getInt(POSITION) +"\"");
		super.onResume();
	}
	
	
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		Log.d("fragment", "onPause " + "\"Frag" + getArguments().getInt(POSITION) +"\"");
		super.onPause();
	}
	
	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		Log.d("fragment", "onStop " + "\"Frag" + getArguments().getInt(POSITION) +"\"");
		super.onStop();
	}
	
	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		Log.d("fragment", "onDestroyView " + "\"Frag" + getArguments().getInt(POSITION) +"\"");
		super.onDestroyView();
	}
	
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.d("fragment", "onDestroy " + "\"Frag" + getArguments().getInt(POSITION) +"\"");
		super.onDestroy();
	}
	
	
	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		Log.d("fragment", "onDetach " + "\"Frag" + getArguments().getInt(POSITION) +"\"");
		super.onDetach();
	}
	

}
