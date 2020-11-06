package com.ptq.projectskelton.Login;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.ptq.projectskelton.R;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    Button login, register;
    EditText email, password;
    Text forgetten_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}