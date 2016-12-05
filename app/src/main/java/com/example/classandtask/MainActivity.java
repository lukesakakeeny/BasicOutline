package com.example.classandtask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /***************************** On Click Listeners ****************************/

        //Find view that shows number category
        TextView calendar = (TextView) findViewById(R.id.calendar);

        //Set a clickListener on that view
        calendar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Create a new intent to open Numbers_Activity
                Intent numbersIntent = new Intent(MainActivity.this, Calendar.class);

                //Start the new activity
                startActivity(numbersIntent);
            }
        });

        //Find view that shows family category
        TextView create_task = (TextView) findViewById(R.id.create_task);

        //Set a clickListener on that view
        create_task.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Create a new intent to open Family_Activity
                Intent familyIntent = new Intent(MainActivity.this, CreateTask.class);

                //Start the new activity
                startActivity(familyIntent);
            }
        });

        //Find view that shows colors category
        TextView data = (TextView) findViewById(R.id.data);

        //Set a clickListener on that view
        data.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Create a new intent to open Colors_Activity
                Intent colorsIntent = new Intent(MainActivity.this, Data.class);

                //Start the new activity
                startActivity(colorsIntent);
            }
        });


        //Find view that shows phrases category
        TextView logger = (TextView) findViewById(R.id.logger);

        //Set a clickListener on that view
        logger.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Create a new intent to open Phrases_Activity
                Intent phrasesIntent = new Intent(MainActivity.this, Logger.class);

                //Start the new activity
                startActivity(phrasesIntent);
            }
        });







    }
}
