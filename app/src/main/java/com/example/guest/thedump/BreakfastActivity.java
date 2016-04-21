package com.example.guest.thedump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BreakfastActivity extends AppCompatActivity {
    @Bind(R.id.breakfastListView) ListView mBreakfastListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        ButterKnife.bind(this);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.breakfast_array, android.R.layout.simple_list_item_1);
        mBreakfastListView.setAdapter(adapter);
            
    }
}
