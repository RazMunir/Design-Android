package com.example.designandroidapplication.Blue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.designandroidapplication.MainActivity;
import com.example.designandroidapplication.R;

public class BlueForgetPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_forget_password);

        Button bRecoveredPassword = findViewById(R.id.bRecoverPassword);
        TextView tvSignIn = findViewById(R.id.tvSignIn);

        bRecoveredPassword.setOnClickListener(this);
        tvSignIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bRecoverPassword:
                Toast.makeText(this, "Recover password clicked.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvSignIn:
                finish();
                break;
        }
    }
}