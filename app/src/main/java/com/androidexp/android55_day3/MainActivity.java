package com.androidexp.android55_day3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;

    private EditText edtEmail;

    private EditText edtPassword;

    private static String USER_NAME_DEFAULT="hoan";

    private static String PASSWORD_DEFAULT="12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btnLogin = findViewById(R.id.btnLogin);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usename = edtEmail.getText().toString();
                String password = edtPassword.getText().toString();

                if(usename != null && !usename.isEmpty() && password != null && !password.isEmpty()){
                    if(usename.equals(USER_NAME_DEFAULT) && password.equals(PASSWORD_DEFAULT)){
                        Intent intent = new Intent(MainActivity.this, CalculatorActivity2.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Thong tin sai", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Vui long nhap lai", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}