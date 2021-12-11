package com.example.aplicacionweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usuario, contra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.caja_nombre);
        contra = findViewById(R.id.caja_contraseña);
    }

    public void abrirActivities(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_reg:
                i = new Intent(this, ActivityRegistro.class);
                startActivity(i);
                break;
            case R.id.btn_log:
                i = new Intent(this, ActivityMenu.class);
                startActivity(i);
                /*
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        if (usuario.getText().toString().trim().equals("") || contra.getText().toString().trim().equals("")) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getBaseContext(), "Llenar Datos", Toast.LENGTH_LONG).show();
                                }
                            });
                        } else {
                            try {
                                String a = String.valueOf(usuario.getText());
                                String b = String.valueOf(contra.getText());
                                BDUsuarios bd = BDUsuarios.getAppDatabase(getBaseContext());
                                Usuarios usl = bd.usuarioDAO().obtenerUno(a);
                                if (b.equals(usl.getContra())) {
                                    startActivity(i);
                                } else {
                                    runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            Toast.makeText(getBaseContext(), "Usuario o Contraseña Incorrectos", Toast.LENGTH_LONG).show();
                                        }
                                    });
                                }
                            } catch (Exception e) {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getBaseContext(), "No Existe el Usuario", Toast.LENGTH_LONG).show();
                                    }
                                });
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();*/
                break;
        }
    }
}