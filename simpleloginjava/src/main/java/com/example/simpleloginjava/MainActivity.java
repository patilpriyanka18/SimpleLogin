package com.example.simpleloginjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText uname,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=(EditText)findViewById(R.id.etNum);
        pass=(EditText)findViewById(R.id.etPass);
        login=(Button)findViewById(R.id.btnok);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nm=uname.getText().toString();
                String pas=pass.getText().toString();
                if(nm.equals(pas)){
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Login UnSuccessful",Toast.LENGTH_LONG).show();

                }

            }
        });
    }
}
