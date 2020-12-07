package com.example.designandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String URL = "url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //login UI
    public void goToLoginUi(View view) {
        startActivity(new Intent(this, LoginUiActivity.class));
    }

    public void goToLoginUiComponents(View view) {

        String url = "";
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);

        switch (view.getId()) {
            case R.id.login_ui_code:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/layout/activity_login_ui.xml";
                break;
            case R.id.login_ui_shape:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/drawable/login_ui_buttonshapewhitebg.xml";
                break;
            case R.id.login_ui_color:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/values/colors.xml";
                break;
            case R.id.login_ui_style:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/values/themes.xml";
                break;
            case R.id.login_ui_font:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/font/gotham.ttf";
                break;
            default:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                break;
        }
        intent.putExtra(URL, url);
        startActivity(intent);
    }
}