package com.example.basri.sunapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
         // Burada sign up tuşuna basılıyor ve SignUpPage activitisine gidiliyor.

                Intent intent = new Intent(v.getContext(), SignUpPage.class);
                startActivityForResult(intent,0);
            }
        }
        );

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {

                                       public void onClick(View v) {
          // Burada login tuşuna basılıyor ve MainPage activitisine gidiliyor.

             Intent intent = new Intent(v.getContext(), MainPage.class);
             startActivityForResult(intent,0);
                                       }
                                   }
        );
    }
     @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //  Inflate  the menu; this adds items to the action bar if it is present.
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
