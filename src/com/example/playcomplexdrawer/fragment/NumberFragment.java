package com.example.playcomplexdrawer.fragment;

import com.example.playcomplexdrawer.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NumberFragment extends Fragment {
	
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
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View rootView = inflater.inflate(R.layout.fragment_number, container, false);
		TextView tvMain = (TextView) rootView.findViewById(R.id.tvMain);
		int position = getArguments().getInt(POSITION);
		tvMain.setText("Position: "+ position);
		
		return rootView;
	}

}