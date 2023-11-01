package com.example.actividad25;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    Button loginButton;

    Button registerbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.BtnLogin); // Usa la variable miembro en lugar de crear una nueva

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aquí puedes implementar la autenticación segura con los valores de usuario y contraseña.
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Simulación de autenticación segura
                if (username.equals("usuario") && password.equals("contraseña")) {
                    // Acceso autorizado
                    Toast.makeText(MainActivity.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                    // Aquí puedes redirigir a otra actividad segura si es necesario
                } else {
                    // Acceso no autorizado
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
