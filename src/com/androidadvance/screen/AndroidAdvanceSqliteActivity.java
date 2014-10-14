package com.androidadvance.screen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class AndroidAdvanceSqliteActivity extends Activity implements
		OnClickListener {

	private Button btn_add, btn_view, btn_search;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		btn_add = (Button) findViewById(R.id.btn_add);
		btn_view = (Button) findViewById(R.id.btn_view);
		btn_search = (Button) findViewById(R.id.btn_search);
		btn_search.setOnClickListener(this);

		btn_add.setOnClickListener(this);
		btn_view.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_add:
			Intent addintent = new Intent(AndroidAdvanceSqliteActivity.this,
					AddRecord.class);
			startActivity(addintent);
			break;

		case R.id.btn_view:
			Intent viewintent = new Intent(AndroidAdvanceSqliteActivity.this,
					ViewRecord.class);
			startActivity(viewintent);
			break;
		case R.id.btn_search:
			Intent searchintent = new Intent(AndroidAdvanceSqliteActivity.this,
					SearchProduct.class);
			startActivity(searchintent);
			break;
		default:
			break;
		}

	}

	public void contactMe(View v) {

		final Intent emailIntent = new Intent(
				android.content.Intent.ACTION_SEND);
		emailIntent.setType("plain/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL,
				new String[] { "androiddevelopmentworld@gmail.com" });
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
				"Android sqlite tutorial");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,
				"Android sqlite tutorial contact Me");
		startActivity(Intent.createChooser(emailIntent, "Send mail..."));

	}
}