package com.example.guest.thedump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LunchActivity extends AppCompatActivity {
    @Bind(R.id.lunchListView)
    ListView mLunchListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        ButterKnife.bind(this);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.lunch_array, android.R.layout.simple_list_item_1);
        mLunchListView.setAdapter(adapter);
    }
}
