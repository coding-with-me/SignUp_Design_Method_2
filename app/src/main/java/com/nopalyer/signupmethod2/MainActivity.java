package com.nopalyer.signupmethod2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ncorti.slidetoact.SlideToActView;

public class MainActivity extends AppCompatActivity {

    EditText etUserName,etPassword;
    SlideToActView btnSignin;
    String user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserName = findViewById(R.id.etuserName);
        etPassword = findViewById(R.id.etPassword);
        btnSignin = findViewById(R.id.btnSignin);


        btnSignin.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(SlideToActView slideToActView) {
                user = etUserName.getText().toString();
                pass = etPassword.getText().toString();
                if (user.equals("coding") && pass.equals("123123")){
                    Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_LONG).show();
                    btnSignin.resetSlider();
                }else{
                    Toast.makeText(getApplicationContext(),"Invalid username or password!",Toast.LENGTH_LONG).show();
                    btnSignin.resetSlider();
                }
            }
        });


    }
}
