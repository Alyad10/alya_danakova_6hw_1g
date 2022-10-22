package com.example.myapplication3;

import static android.provider.Contacts.SettingsColumns.KEY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton loginBtn;
    EditText email;
    EditText password;
    LinearLayout layout;
    TextView text_2;
    TextView text_vhod;
    TextView text_zzz;
    TextView editt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.login_btn);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        layout = findViewById(R.id.layout);
        text_2 = findViewById(R.id.text_2);
        text_vhod = findViewById(R.id.text_vhod);
        editt = findViewById(R.id.editt);
        text_zzz = findViewById(R.id.text_zzz);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                    email.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    loginBtn.setVisibility(View.GONE);
                    layout.setVisibility(View.GONE);
                    text_2.setVisibility(View.GONE);
                    text_vhod.setVisibility(View.GONE);
                    editt.setVisibility(View.GONE);
                    text_zzz.setVisibility(View.GONE);

                }else {
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();

                }

            }
        });


        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().isEmpty()){
                    loginBtn.setBackgroundColor(getResources().getColor(R.color.gray));
                }else {
                    loginBtn.setBackgroundColor(getResources().getColor(R.color.orange));
                }




            password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().isEmpty()){
                    loginBtn.setBackgroundColor(getResources().getColor(R.color.gray));
                }else {
                    loginBtn.setBackgroundColor(getResources().getColor(R.color.orange));
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}