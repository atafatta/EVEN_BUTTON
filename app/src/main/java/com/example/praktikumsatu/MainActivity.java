package com.example.praktikumsatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada Layout
        btnLogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada Layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada Layout
        edpassword=findViewById(R.id.edPassword);

        //Membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user di edttext email kedalam variabel nama
                nama = edemail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();


                if(nama.equals("atafatta@gmail.com")&& password.equals("umy123")){
                    {
                        Bundle b = new Bundle();
                        //key parsind data dimasukkan kedalam bundle
                        b.putString("a", nama.trim());
                        b.putString("b", password.trim());

                        //membuat objek unuk pindah halaman
                        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                        //memasukkan bundle kedalam intent
                        i.putExtras(b);
                        //berpindah ke halaman lain
                        startActivity(i);
                        Toast toast= Toast.makeText(getApplicationContext(),
                                "Login Sukses!", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL,0,0);
                        toast.show();
                        //menghapus isi dari edittext
                        edemail.getText().clear();
                        edpassword.getText().clear();
                    }

                }
                else if(nama.equals("atafatta@gmail.com")){
                    Toast.makeText(getApplicationContext(), "PASSWORD SALAH!", Toast.LENGTH_SHORT).show();
                }
                else if(password.equals("umy123")){
                    Toast.makeText(getApplicationContext(), "EMAIL SALAH!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "EMAIL DAN PASSWORED SALAH!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}