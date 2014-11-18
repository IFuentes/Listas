package com.example.ingfuentes.listas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Button;
import java.util.ArrayList;


public class listMain extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_main);

        ArrayList <ListItem> mArrayList;
        Button btnHeader = (Button)findViewById(R.id.btnHeader);
        ListView lvHeader = (ListView)findViewById(R.id.list_test);
        //Instancia de los objetos arrayList y listItem
        mArrayList = new ArrayList<ListItem>();
        ListItem listItem = new ListItem();

        listItem.setImageUser(getResources().getDrawable(R.drawable.timmy));
        listItem.setHeader("Ignacio");
        listItem.setSubHeader("Fuentes");
        mArrayList.add(listItem);

        listItem = new ListItem();
        listItem.setImageUser(getResources().getDrawable(R.drawable.vicky));
        listItem.setHeader("Mary");
        listItem.setSubHeader("Fuentes");
        mArrayList.add(listItem);

        listItem = new ListItem();
        listItem.setImageUser(getResources().getDrawable(R.drawable.timmy));
        listItem.setHeader("Timmy");
        listItem.setSubHeader("Turner");
        mArrayList.add(listItem);

        listItem = new ListItem();
        listItem.setImageUser(getResources().getDrawable(R.drawable.vicky));
        listItem.setHeader("Vicky");
        listItem.setSubHeader("Crazy");
        mArrayList.add(listItem);
        //Instancia de listItemAdapter to set the final view
        final ListItemAdapter listItemAdapter = new ListItemAdapter(getBaseContext(),mArrayList);
        lvHeader.setAdapter(listItemAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
