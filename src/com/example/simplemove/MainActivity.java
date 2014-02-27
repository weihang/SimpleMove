package com.example.simplemove;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private TextView textView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView = (TextView) findViewById(R.id.textView1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void moveLeft(View view){
		RelativeLayout.LayoutParams params = (LayoutParams) textView.getLayoutParams();
		params.leftMargin--;
		textView.setLayoutParams(params);
	}

	public void moveRight(View view){
		RelativeLayout.LayoutParams params = (LayoutParams) textView.getLayoutParams();
		params.leftMargin++;
		textView.setLayoutParams(params);
	}
}
