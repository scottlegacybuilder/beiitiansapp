package com.PhoneApp;

import com.phonegap.*;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

public class MyPhoneGapActivity extends DroidGap {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/mLogin.html",5000);
		// super.setStringProperty("loadingDialog", "Welcome to BeIITIANS...");
		    super.setIntegerProperty("splashscreen", R.drawable.front_logo);
		    
	}
} 


