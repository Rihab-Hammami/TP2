package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class fourth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        EditText e1,e2,e3;
        Button btn;

        e1=(EditText)findViewById(R.id.ed1);
        e2=(EditText)findViewById(R.id.ed2);
        e3=(EditText)findViewById(R.id.ed3);
        btn=(Button)findViewById(R.id.btn_calendar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra(CalendarContract.Events.TITLE, "Title");
                intent.putExtra(CalendarContract.Events.ALL_DAY, true);
                intent.putExtra(CalendarContract.Events.DESCRIPTION, "Descripttion");
                intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Location");
                startActivity(Intent.createChooser(intent, "Add to calendar"));
            }
        });

    }
}