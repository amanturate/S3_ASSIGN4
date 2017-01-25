package com.example.turate.s3_assign4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView Welcome;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle getBundle = this.getIntent().getExtras();
        String username = getBundle.getString("Welcome UserName");
        Welcome = (TextView) findViewById(R.id.welcome);
        Welcome.setText("Welcome " + username);
    }
}
