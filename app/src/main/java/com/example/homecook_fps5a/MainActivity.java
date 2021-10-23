package com.example.homecook_fps5a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {

    EditText edId, edName, edAge;
    Button btnAdd, btnDelete, btnUpdate, btnFindAll, btnFind;

    // Create a reference for Firebase database
    DatabaseReference personDatabase, personChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}