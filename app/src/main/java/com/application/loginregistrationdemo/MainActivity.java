package com.application.loginregistrationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText name, email, password;
    RadioGroup rg;
    RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.createBtn);
        name = (EditText)findViewById(R.id.input_name);
        email = (EditText)findViewById(R.id.input_email);
        password = (EditText)findViewById(R.id.input_pass);
        rg = (RadioGroup)findViewById(R.id.genderRadioGroup);
        r1 = (RadioButton)findViewById(R.id.f);
        r2 = (RadioButton)findViewById(R.id.m);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String gender = "";
//                if(r1.isChecked()){
//                    gender = "Female";
//                }else{
//                    gender = "Male";
//                }

                int i = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton)findViewById(i);
                String gender = rb.getText().toString();

                String username = name.getText().toString();
                String useremail = email.getText().toString();
                String userpassword = password.getText().toString();
                Toast.makeText(MainActivity.this,"Clicked", Toast.LENGTH_LONG).show();
                System.out.println("Name: "+ username + "\n Email: " + useremail + "\n Password: " + userpassword + "\n Gender: " + gender);
            }
        });
    }
}