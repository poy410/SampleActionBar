package com.example.tacademy.sampleactionbar;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar)findViewById(R.id.toolBar));

       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);
     //   getSupportActionBar().setDisplayShowCustomEnabled(true);
     //   getSupportActionBar().setCustomView(view, new ActionBar.LayoutParams(Gravity.CENTER));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                Toast.makeText(this,"HomeAsUP click", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
