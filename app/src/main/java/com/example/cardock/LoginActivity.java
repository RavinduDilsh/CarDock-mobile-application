package com.example.cardock;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    EditText pwd, username, password;
    CheckBox show_password;
    Button log;
    TextView user_reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);

        pwd = (EditText) findViewById(R.id.login_pass_text);
        show_password = (CheckBox) findViewById(R.id.show_pass);

        log = (Button) findViewById(R.id.login_btn);
        username = (EditText)findViewById(R.id.login_user_text);
        password = (EditText)findViewById(R.id.login_pass_text);

        user_reg = (TextView) findViewById(R.id.reg_text);

        show_password.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (!isChecked) {
                    pwd.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    pwd.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(), "Login Successful...", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
                }else if(username.getText().toString().isEmpty()){
                    username.setError("Username is required");
                }else if(password.getText().toString().isEmpty()){
                    password.setError("Password is required");
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong UserName or Password...", Toast.LENGTH_SHORT).show();
                    username.getText().clear();
                    password.getText().clear();
                }
            }
        });

        user_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,UserRegActivity.class));
            }
        });


    }

}