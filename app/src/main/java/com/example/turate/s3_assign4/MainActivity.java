package com.example.turate.s3_assign4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText musername;
    EditText mpassword;
    Button   msignIn;
    TextView help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musername = (EditText) findViewById(R.id.username);
        mpassword = (EditText) findViewById(R.id.password);
        msignIn = (Button) findViewById(R.id.signIn);
        help = (TextView) findViewById(R.id.textView);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Use Password = aman", Toast.LENGTH_LONG).show();
            }
        });

        msignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = musername.getText().toString();
                String password = mpassword.getText().toString();
                String right = "aman";
                if(username != null && password != null){
                    if(password.equals(right)){
                        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                        Bundle dataBundle = new Bundle();
                        dataBundle.putString("Welcome UserName", username);
                        intent.putExtras(dataBundle);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Enter correct password", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Username and password cannot be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
