package com.example.guest.thedump;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.menuSpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.menu_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String spinner_menu_value = spinner.getSelectedItem().toString();
                if (spinner_menu_value.equals("Breakfast")) {
                    Intent intent = new Intent(MainActivity.this, BreakfastActivity.class);
                    startActivity(intent);
                } else if (spinner_menu_value.equals("Lunch")) {
                    Intent intent = new Intent(MainActivity.this, LunchActivity.class);
                    startActivity(intent);
                } else if (spinner_menu_value.equals("Dinner")) {
                    Intent intent = new Intent(MainActivity.this, DinnerActivity.class);
                    startActivity(intent);
                } else if (spinner_menu_value.equals("Dessert")) {
                    Intent intent = new Intent(MainActivity.this, DessertActivity.class);
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
    }
}

