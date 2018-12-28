package com.mobile.xcode.final1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WmMenu extends ListActivity{
	String [] menu = {"Makanan", "Minuman"};
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wm_menu);
		
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu));
	}
	
	protected void onListItemClick(ListView menu, View v, int position,long id)
    {
    	super.onListItemClick(menu, v, position, id);
    	Object pilihmenu = this.getListAdapter().getItem(position);
    	String pilihan = pilihmenu.toString();
    	tampilkanpilihan (pilihan);
    }

	private void tampilkanpilihan(String pilihan) {
		// TODO Auto-generated method stub
		try
		{
			Intent pindah = null;
			if(pilihan.equals("Makanan"))
				{
					pindah = new Intent(WmMenu.this, WmMakanan.class);
				}
			else if(pilihan.equals("Minuman"))
			{
				pindah = new Intent(this, WmMinuman.class);
			}
			
				startActivity(pindah);	
				
		}catch (Exception b){
			b.printStackTrace();
		}
	}
}
