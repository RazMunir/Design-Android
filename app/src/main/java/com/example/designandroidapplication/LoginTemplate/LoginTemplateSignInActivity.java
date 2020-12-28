package com.example.designandroidapplication.LoginTemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designandroidapplication.R;

public class LoginTemplateSignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_template_sign_in);
    }

    public void onClick(View view) {
    }

    public void goToForgotPassword(View view) {
        startActivity(new Intent(this, LoginTemplateForgotPasswordActivity.class));
    }

    public void goToSignUpActivity(View view) {
        startActivity(new Intent(this, LoginTemplateSignUpActivity.class));
    }
}