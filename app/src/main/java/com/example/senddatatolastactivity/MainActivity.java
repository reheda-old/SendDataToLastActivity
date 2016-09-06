package com.example.senddatatolastactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText login;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
    }


    public void sendData(View view){
        Intent intent = new Intent(this, LastActivity.class);
        intent.putExtra("login", login.getText().toString());
        intent.putExtra("pass", password.getText().toString());
        startActivity(intent);
    }

}
