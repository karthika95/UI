package com.example.karthika.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Karthika on 27-04-2017.
 */
public class DiaryContent extends AppCompatActivity {
    TextView textView;
    Button save;
    ImageButton calendar,mic;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary_content);

        Bundle dateData = getIntent().getExtras();
        if(dateData == null) {
            return;
        }
        String dateSet = dateData.getString("Date");

        textView = (TextView) findViewById(R.id.date);
        textView.setText(dateSet);
        calendar = (ImageButton) findViewById(R.id.calendarButton);
        mic = (ImageButton) findViewById(R.id.micButton);

        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiaryContent.this, CalendarActivity.class);
                startActivity(intent);
            }
        });

    }

}