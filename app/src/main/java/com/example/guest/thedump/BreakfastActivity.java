package com.example.guest.thedump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BreakfastActivity extends AppCompatActivity {
    private ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        mListView = (ListView) findViewById(R.id.breakfastListView);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.breakfast_array, android.R.layout.simple_list_item_1);
        mListView.setAdapter(adapter);


            
    }
}
