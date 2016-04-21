package com.example.guest.thedump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DessertActivity extends AppCompatActivity {
    @Bind(R.id.dessertListView)
    ListView mDessertListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
        ButterKnife.bind(this);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.dessert_array, android.R.layout.simple_list_item_1);
        mDessertListView.setAdapter(adapter);
    }
}
