package com.example.layout;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@SuppressLint("NewApi") public class About extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
		getActionBar().setTitle("About");
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setDisplayUseLogoEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(false);

        WebView browser = (WebView) findViewById(R.id.detail);
        browser.loadUrl("file:///android_asset/about.html");
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		finish();
	    return true;

	}

}
