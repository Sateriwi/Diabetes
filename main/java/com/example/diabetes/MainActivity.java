package com.example.diabetes;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<User> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean validate = checkUser();
                if (validate == true) {
                    login();
                }
            }
        });

        Button newUser = (Button) findViewById(R.id.newUser);
        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createUser();
            }
        });
    }


    public void login() {
            Intent intent = new Intent(this, UserActivity.class);
            startActivity(intent);
    }

    public boolean checkUser() {
        EditText name = (EditText) findViewById(R.id.editText2);
        EditText password = (EditText) findViewById(R.id.editText3);

        if (name.getText().toString().equals("jaani") && password.getText().toString().equals("moikka")) {
            return true;
        } else {
            return false;
        }
    }

    public void createUser() {
        Intent intent = new Intent(this, NewUser.class);
        startActivity(intent);
    }
}

