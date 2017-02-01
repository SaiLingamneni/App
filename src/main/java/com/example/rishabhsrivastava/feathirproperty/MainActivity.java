package com.example.rishabhsrivastava.feathirproperty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    static final String[] propertyList = new String[] { "123 S Orange St, Tempe, AZ", "234 N Blue Ln, Scottsdale, AZ", "456 E Yellow Dr, Chandler, AZ",
            "789 W Purple St, Gilbert, AZ" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_main, propertyList);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

    }
}
