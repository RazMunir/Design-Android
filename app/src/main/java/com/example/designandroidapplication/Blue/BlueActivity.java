package com.example.designandroidapplication.Blue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.designandroidapplication.MainActivity;
import com.example.designandroidapplication.R;

public class BlueActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue);

        Button bSignIn = findViewById(R.id.bSignIn);
        TextView tvForgotPassword = findViewById(R.id.tvForgotPassword);
        TextView tvSignUp = findViewById(R.id.tvSignUp);

        bSignIn.setOnClickListener(this);
        tvForgotPassword.setOnClickListener(this);
        tvSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bSignIn:
                Toast.makeText(this, "Sign in clicked.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvForgotPassword:
                startActivity(new Intent(this, BlueForgetPasswordActivity.class));
                break;
            case R.id.tvSignUp:
                startActivity(new Intent(this, BlueSignUpActivity.class));
                break;
        }
    }
}