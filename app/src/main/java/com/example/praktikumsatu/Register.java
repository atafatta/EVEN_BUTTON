package com.example.praktikumsatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Register extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText Nama,Email,Pass,Erepass;
        Button btnRegist;
        btnRegist = findViewById(R.id.btnRegist);
        Nama = findViewById(R.id.Task);
        Email = findViewById(R.id.JenisTask);
        Pass = findViewById(R.id.TimeTask);
        Erepass = findViewById(R.id.erepass);

        btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama, email, pass1, pass2;
                nama = Nama.getText().toString();
                email = Email.getText().toString();
                pass1 = Pass.getText().toString();
                pass2 = Erepass.getText().toString();

                if(nama.isEmpty()){
                    showErorNama(Nama,"Nama Harus Diisi !");
                }else if(email.isEmpty()){
                    showErorEmail(Email,"Email Harus Diisi!");
                }else if(!pass2.equals(pass1)){
                    showErorPass(Erepass, "Password Tidak Boleh Beda !");
                }else{
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                    Toast t = Toast.makeText(getApplicationContext(),"Akun Berhasil Register !",Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }

    private void showErorPass(EditText pass1, String passwordharussama) {
        pass1.setError(passwordharussama);
    }

    private void showErorNama(EditText fillnama, String f) {
        fillnama.setError(f);
    }
    private void showErorEmail(EditText fillemail, String f) {
        fillemail.setError(f);
    }
}


