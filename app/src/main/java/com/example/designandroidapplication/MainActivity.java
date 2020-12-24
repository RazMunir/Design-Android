package com.example.designandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.designandroidapplication.Blue.BlueActivity;
import com.example.designandroidapplication.LoginTemplate.LoginTemplateSignUpActivity;

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
            case R.id.login_ui_xml:
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
    //login UI end

    //SignIn SignUp
    public void goToSignInLogInActivity(View view) {
        startActivity(new Intent(this, SignInSignUpActivity.class));
    }

    public void goToSignInSignUpComponents(View view) {
        String url = "";
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);

        switch (view.getId()) {
            case R.id.sign_in_sign_up_code:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/java/com/example/designandroidapplication/SignInSignUpActivity.java";
                break;
            case R.id.sign_in_sign_up_xml:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/layout/activity_sign_in_sign_up.xml";
                break;
            case R.id.sign_in_sign_up_shape:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/drawable/singn_in_sign_up_bordershape.xml";
                break;
            case R.id.sign_in_sign_up_shape_2:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/drawable/singn_in_sign_up_buttonshape.xml";
                break;
            case R.id.sign_in_sign_up_style:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/values/themes.xml";
                break;
            default:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                break;
        }
        intent.putExtra(URL, url);
        startActivity(intent);
    }
    //SignIn SignUp end

    //Lottie Animation
    public void goToLottieAnimationActivity(View view) {
        startActivity(new Intent(this, LottieAnimationActivity.class));
    }

    public void goToLottieAnimationComponents(View view) {
        String url = "";
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);

        switch (view.getId()) {
            case R.id.lottie_animation_xml:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/layout/activity_lottie_animation.xml";
                break;
            case R.id.lottie_animation_dependency:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/build.gradle";
                break;
            default:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                break;
        }
        intent.putExtra(URL, url);
        startActivity(intent);
    }
    //lottie Animation End

    //SignIn Activity
    public void goToSignInActivity(View view) {
        startActivity(new Intent(this, SignInActivity.class));
    }

    public void goToSignInComponents(View view) {
        String url = "";
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);

        switch (view.getId()) {
            case R.id.sign_in_xml:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/layout/activity_sign_in.xml";
                break;
            case R.id.sign_in_attributes:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/values/attrs.xml";
                break;
            case R.id.sign_in_style:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/values/themes.xml";
                break;
            case R.id.sign_in_dimension:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/values/dimens.xml";
                break;
            default:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                break;
        }
        intent.putExtra(URL, url);
        startActivity(intent);
    }
    //End SignIn Activity

    //Blue signIn Activity
    public void goToBlueSignInActivity(View view) {
        startActivity(new Intent(this, BlueActivity.class));
    }

    public void goToBlueActivityComponents(View view) {
        String url = "";
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);

        switch (view.getId()) {
            case R.id.blue_sign_in_code:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/java/com/example/designandroidapplication/Blue/BlueActivity.java";
                break;
            case R.id.blue_sign_in_xml:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/layout/activity_blue.xml";
                break;
            case R.id.blue_sign_in_shape:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/drawable/blue_sign_in_gradient_background_light_blue.xml";
                break;
            case R.id.blue_sign_in_style:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/values/themes.xml";
                break;
            default:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                break;
        }
        intent.putExtra(URL, url);
        startActivity(intent);
    }
    //End Blue SignIn Activity

    //Drop SignIn Activity
    public void goToDropSignInActivity(View view) {
        startActivity(new Intent(this, DropSignInActivity.class));
    }

    public void goToDropSignInActivityComponents(View view) {
        String url = "";
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);

        switch (view.getId()) {
            case R.id.drop_sign_in_xml:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/layout/activity_drop_sign_in.xml";
                break;
            case R.id.drop_sign_in_shape:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/drawable/drop_sign_in_half_circle.xml";
                break;
            case R.id.drop_sign_in_shape_two:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/drawable/drop_sign_in_half_blue_roundshape.xml";
                break;
            case R.id.drop_sign_in_style:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/values/themes.xml";
                break;
            default:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                break;
        }
        intent.putExtra(URL, url);
        startActivity(intent);
    }
    //End Drop SignIn Activity

    //Shape Activity
    public void goToShapeActivity(View view) {
        startActivity(new Intent(MainActivity.this, ShapeActivity.class));
    }

    public void goToShapeActivityComponents(View view) {
        String url = "";
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);

        switch (view.getId()) {
            case R.id.shape_code:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/java/com/example/designandroidapplication/ShapeActivity.java";
                break;
            case R.id.shape_xml:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/layout/activity_shape.xml";
                break;
            case R.id.shape_shape:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/drawable/shape_round_top_shape.xml";
                break;
            case R.id.shape_shape_two:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/drawable/shape_round_stroke_shape.xml";
                break;
            default:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                break;
        }
        intent.putExtra(URL, url);
        startActivity(intent);
    }
    //End Shape Activity

    //Neumorphism Activity
    public void goToneumorphismActivity(View view) {
        startActivity(new Intent(MainActivity.this, NeumorphismActivity.class));
    }

    public void goToNeumorphismActivityComponents(View view) {
        String url = "";
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);

        switch (view.getId()) {
            case R.id.neumorphism_code:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/java/com/example/designandroidapplication/NeumorphismActivity.java";
                break;
            case R.id.neumorphism_xml:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/layout/activity_neumorphism.xml";
                break;
            case R.id.neumorphism_dependency:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/build.gradle";
                break;
            default:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                break;
        }
        intent.putExtra(URL, url);
        startActivity(intent);
    }
    //End Neumorphism Activit

    //EditTextCustom Activity
    public void goToEditTextCustomActivity(View view) {
        startActivity(new Intent(MainActivity.this, EditTextCustomActivity.class));
    }

    public void goToEditTextCustomActivityComponents(View view) {
        String url = "";
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);

        switch (view.getId()) {
            case R.id.edit_text_custom_xml:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/layout/activity_edit_text_custom.xml";
                break;
            case R.id.edit_text_custom_style:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/values/themes.xml";
                break;
            default:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                break;
        }
        intent.putExtra(URL, url);
        startActivity(intent);
    }

    //End EditTextCustom Activit

    //Login Template
    public void goToLoginTemplate(View view) {
        startActivity(new Intent(MainActivity.this, LoginTemplateSignUpActivity.class));
    }

    public void goToLoginTemplateComponents(View view) {
        String url = "";
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);

        switch (view.getId()) {
            case R.id.login_template_code:
                url = "https://github.com/RazMunir/Design-Android/tree/main/app/src/main/java/com/example/designandroidapplication/LoginTemplate";
                break;
            case R.id.login_template_xml:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/layout/activity_login_template_sign_up.xml";
                break;
            case R.id.login_template_shape:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/drawable/login_tamplate_sign_up_button_bg.xml";
                break;
            case R.id.login_template_style:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/values/themes.xml";
                break;
            default:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                break;
        }
        intent.putExtra(URL, url);
        startActivity(intent);
    }

    //End Login Template

    //Button Custom Activity
    public void goToButtonCustomActivity(View view) {
        startActivity(new Intent(MainActivity.this, ButtonCustomActivity.class));
    }

    public void goToButtonCustomActivityComponents(View view) {
        String url = "";
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);

        switch (view.getId()) {
            case R.id.login_template_code:
                url = "https://github.com/RazMunir/Design-Android/tree/main/app/src/main/java/com/example/designandroidapplication/LoginTemplate";
                break;
            case R.id.login_template_xml:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/layout/activity_login_template_sign_up.xml";
                break;
            case R.id.login_template_shape:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/drawable/login_tamplate_sign_up_button_bg.xml";
                break;
            case R.id.login_template_style:
                url = "https://github.com/RazMunir/Design-Android/blob/main/app/src/main/res/values/themes.xml";
                break;
            default:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                break;
        }
        intent.putExtra(URL, url);
        startActivity(intent);
    }

    //Button Custom Activity
}