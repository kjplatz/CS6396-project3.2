package com.example.testgui;

import com.example.testgui.MyView;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends ActionBarActivity{

	Button button;
	private static MyView myview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myview = new MyView(this);
        setContentView(myview);
        
		myview.setYPos(114);
	}	
}
