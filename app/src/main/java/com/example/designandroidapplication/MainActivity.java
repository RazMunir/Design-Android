package com.example.designandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String URL = "url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLoginUi(View view) {
        startActivity(new Intent(this, LoginUiActivity.class));
    }

    public void goToCode(View view) {

        String url = "";
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);

        switch(view.getId()){
            case R.id.login_ui:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/layout/activity_login_ui.xml";
                break;
            default:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                break;
        }
        intent.putExtra(URL, url);
        startActivity(intent);
    }
}