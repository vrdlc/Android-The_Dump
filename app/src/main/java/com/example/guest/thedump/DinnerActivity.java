package com.example.guest.thedump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DinnerActivity extends AppCompatActivity {
    @Bind(R.id.dinnerListView)
    ListView mDinnerListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        ButterKnife.bind(this);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.dinner_array, android.R.layout.simple_list_item_1);
        mDinnerListView.setAdapter(adapter);
    }
}
