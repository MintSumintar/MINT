package com.example.com1test.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private EditText userEditText;
    private EditText passwordEditText;
    private Button LoginButton;
    private String userString, passwordString;
    private MyMange myMange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind Widget
        bindWidget();

        //Request Database
        myMange = new MyMange(this);
        //Button Controller

        buttonController();



    }   // Main Method

    private void buttonController() {
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Receive Value From Edit Text
                userString = userEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();

                //Check Space
                if (userString.equals("") || passwordString.equals("")) {
                    //Have Space
                    MyAlertDialog myAlertDialog = new MyAlertDialog();
                    myAlertDialog.myDialog(MainActivity.this,"มีช่องว่าง","กรุณากรอกช่อง ค่ะ");

                } else {
                    //No Space
                }

            }   //onClick
        });
    }   //butonController

    private void bindWidget() {

        userEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText) findViewById(R.id.editText2);
        LoginButton = (Button) findViewById(R.id.button);


    }

}   // Main Class นี้คือ คราสหลัก
