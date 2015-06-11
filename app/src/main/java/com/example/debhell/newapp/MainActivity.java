package com.example.debhell.newapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void spotifystreamer(View view)
    {
        Toast toast=Toast.makeText(getApplicationContext(),"This button will launch \n\"Spotify Streamer\" app!",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 20);
        toast.show();

    }
    public void scoresapp(View view)
    {
        Toast toast1=Toast.makeText(getApplicationContext(),"This button will launch \"Scores\" app!",Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.BOTTOM,0,20);
        toast1.show();

    } public void libraryapp(View view)
    {
        Toast toast2=Toast.makeText(getApplicationContext(),"This button will launch \"Library\" app!",Toast.LENGTH_SHORT);
        toast2.setGravity(Gravity.BOTTOM,0,20);
        toast2.show();

    } public void builditbigger(View view)
    {
        Toast toast3=Toast.makeText(getApplicationContext(),"This button will launch \n\t\"Build It Bigger\" app!",Toast.LENGTH_SHORT);
        toast3.setGravity(Gravity.BOTTOM,0,20);
        toast3.show();

    } public void xyzreader(View view)
    {
        Toast toast4=Toast.makeText(getApplicationContext(),"This button will launch \n\t\t\"XYZ Reader\" app!",Toast.LENGTH_SHORT);
        toast4.setGravity(Gravity.BOTTOM,0,20);
        toast4.show();

    } public void capstone(View view)
    {
        Toast toast5=Toast.makeText(getApplicationContext(),"This button will launch \n\"Capstone Project\" app!",Toast.LENGTH_SHORT);
        toast5.setGravity(Gravity.BOTTOM,0,20);
        toast5.show();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
