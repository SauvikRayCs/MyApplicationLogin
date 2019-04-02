package com.ray.sauvik.myapplicationlogin;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    private EditText UserEmail;
    private EditText UserPassword;
    private Button   LoginButton;
    private Button   ClearButton;
    private TextView txtMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserEmail = findViewById(R.id.userName);
        UserPassword = findViewById(R.id.passWord);
        LoginButton = findViewById(R.id.LoginBtn);
        ClearButton = findViewById(R.id.ClearBtn);
        txtMsg = findViewById(R.id.errorMsg);


        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = UserEmail.getText().toString();
                String password = UserPassword.getText().toString();
               // Toast.makeText(LoginActivity.this, email, Toast.LENGTH_SHORT).show();

                if (email.equals("admin") && password.equals("1234"))
                {

                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                    txtMsg.setText("Login Success");

                }
                else
                    {
                        txtMsg.setText("error mssg");
                }
            }
        });

        ClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
    public void btnshare (View view){
        Intent i = new Intent(LoginActivity.this, SharedActivity.class);
        startActivity(i);
    }

    public void btnSpinner (View view){
      Intent i = new Intent(LoginActivity.this, SpinnerActivity.class);
      startActivity(i);
    }
}
