package com.example.layout;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

@SuppressLint("NewApi") public class List_data_rumah_sakit extends Activity implements OnItemClickListener {
	
	ListView lvItem;
	
	@SuppressLint("NewApi") @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_data);
		
		ActionBar actionBar = getActionBar();
        actionBar.setTitle("Daftar Rumah Sakit");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);
        
        lvItem = (ListView) findViewById(R.id.list_data);

        final String[] menuLokasi = new String[]{"RSUP Dr. Mohd.Hoesin","RS. RK. Charitas Palembang",
                "Rumkit Tk II Dr. AK Gani Palembang", "RSUD Palembang Bari"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(List_data_rumah_sakit.this, android.R.layout.simple_list_item_1,
                android.R.id.text1, menuLokasi);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> l, View v, int position, long id) {

                Object o = menuLokasi[position];
                String pilihan = o.toString();
                tampilkanpihan(pilihan);
            }
        });
		
	}
	
	private void tampilkanpihan(String pilihan) {
        try {
            Intent i = null;

            if (pilihan.equals("RSUP Dr. Mohd.Hoesin")) {
                i = new Intent(List_data_rumah_sakit.this, RmHoesin.class);
            }
            
            if (pilihan.equals("RS. RK. Charitas Palembang")) {
                i = new Intent(List_data_rumah_sakit.this, RmCharitas.class);
            }

            startActivity(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	

	public boolean onOptionsItemSelected(MenuItem item){
	    finish();
	    return true;

	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}


}
