package com.example.androidtablayout;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MyApp extends Activity {

	private Spinner spinner1;
	private Button btnSubmit;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main3);

		
		addListenerOnButton();
		addListenerOnSpinnerItemSelection();

	}

	public void addListenerOnSpinnerItemSelection(){
		
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		
	}
	
	//get the selected dropdown list value
	public void addListenerOnButton() {

		spinner1 = (Spinner) findViewById(R.id.spinner1);
		
		
		btnSubmit = (Button) findViewById(R.id.btnSubmit);

		btnSubmit.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				
				String text1="O'Connor Hospital,2105 Forest Ave,CA 95128";

				Intent geoIntent = new Intent (android.content.Intent.ACTION_VIEW, Uri.parse ("geo:0,0?q=" + text1)); // Prepare intent
				startActivity(geoIntent);
			}

		});

	}

}