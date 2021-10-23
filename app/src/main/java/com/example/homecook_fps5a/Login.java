package com.example.homecook_fps5a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

public class Login extends AppCompatActivity implements View.OnClickListener {

    EditText edId, edName, edAge;
    Button btnAdd, btnDelete, btnUpdate, btnFindAll, btnFind;

    // Create a reference for Firebase database
    DatabaseReference personDatabase, personChild;

    TextView edUsername = (TextView) findViewById(R.id.edUsername);
    TextView edPassword = (TextView) findViewById(R.id.edPassword);

    Button btnSignIn = (Button) findViewById(R.id.btnSignIn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void onClick(View view) {
        if (edUsername.getText().toString().equals("admin")&& edPassword.getText().toString().equals("admin")){

        }else{
            Toast.makeText(Login.this, "Sign in FAILED!!!", Toast.LENGTH_SHORT).show();
        }
    }
}