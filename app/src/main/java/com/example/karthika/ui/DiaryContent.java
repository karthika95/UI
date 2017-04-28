package com.example.karthika.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Karthika on 27-04-2017.
 */
public class DiaryContent extends AppCompatActivity {
    TextView textView;

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
    }

}