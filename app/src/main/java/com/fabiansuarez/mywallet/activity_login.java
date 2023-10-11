package com.fabiansuarez.mywallet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class activity_login extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        //usernameEditText = findViewById(R.id.usernameEditText);
        //passwordEditText = findViewById(R.id.passwordEditText);       EDITAR
        //loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your login validation logic here
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (isValidLogin(username, password)) {
                    // Successful login
                    // You can start a new activity or perform other actions
                } else {
                    // Failed login
                    Toast.makeText(activity_login.this, "Tu no estás registrado mi chamo", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isValidLogin(String username, String password) {
        // Implement your login validation logic here
        // For a basic example, you can check if the username and password are not empty.
        return !username.isEmpty() && !password.isEmpty();
    }
}
