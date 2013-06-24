package com.example.wifihotspots;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;

 
public class MainActivity extends Activity {
 
	private WebView webView;
	public void onCreate(Bundle savedInstanceState) {
 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 
		webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("file:///android_asset/index.html");
 
	}
 
}