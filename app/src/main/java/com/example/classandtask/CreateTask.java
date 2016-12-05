package com.example.classandtask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.classandtask.R.id.spinner;

public class CreateTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);

        //Find view that shows number category
        TextView create_class = (TextView) findViewById(R.id.create_class);

        //Set a clickListener on that view
        create_class.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Create a new intent to open Numbers_Activity
                Intent numbersIntent = new Intent(CreateTask.this, CreateClass.class);

                //Start the new activity
                startActivity(numbersIntent);
            }
        });

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayList<String> classes = new ArrayList<String>();
//
        classes.add(new String("EC327"));
        classes.add(new String("EC450"));
        classes.add(new String("SI482"));
        classes.add(new String("SE570"));

        //Create an ArrayAdapter that holds the list of strings
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, classes);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

    }
}
