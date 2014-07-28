package com.example.playcomplexdrawer.action;

import com.example.playcomplexdrawer.R;

import android.content.Context;
import android.view.ActionProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class CommunicateActionProvider extends ActionProvider implements OnClickListener {
	private Context mContext;

	public CommunicateActionProvider(Context context) {
		super(context);
		mContext = context;
	}

	@Override
	public View onCreateActionView() {
		LayoutInflater inflater = LayoutInflater.from(mContext);
		View rootView = inflater.inflate(R.layout.actionprovider_communicate, null);
		
		ImageButton bt1 = (ImageButton) rootView.findViewById(R.id.imageButton1);
		ImageButton bt2 = (ImageButton) rootView.findViewById(R.id.imageButton2);
		ImageButton bt3 = (ImageButton) rootView.findViewById(R.id.imageButton3);
		ImageButton bt4 = (ImageButton) rootView.findViewById(R.id.imageButton4);
		
		

		bt1.setOnClickListener(this);
		bt2.setOnClickListener(this);
		bt3.setOnClickListener(this);
		bt4.setOnClickListener(this);
		return rootView;
	}

	@Override
	public void onClick(View v) {

		Toast.makeText(mContext, "Action Received", Toast.LENGTH_SHORT).show();
	}

}
