package com.nl.fg;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		String[] companies = new String[] { "Google", "Apple", "Facebook",
        	"Blackberry", "Samsung", "Twitter", "Intel", "HTC", "Asus" };

        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, companies);
        ListView listView = (ListView) findViewById(R.id.mainListView1);
		listView.setAdapter(adapter);
    }
	

    @Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate main_menu.xml 
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return true;
	}
}



	
