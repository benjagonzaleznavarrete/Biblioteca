package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText txt1,txt2;
    private TextView error;
    private ProgressBar pb;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(EditText) findViewById(R.id.name);
        txt2=(EditText) findViewById(R.id.password);
        error=(TextView) findViewById(R.id.error);
        btn=(Button)findViewById(R.id.login) ;
        pb= (ProgressBar)findViewById(R.id.barra);
        pb.setVisibility(View.INVISIBLE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user, password;
                user=txt1.getText().toString();
                password=txt2.getText().toString();

                if ((user.equals("android") || user.equals("Android")) && (password.equals("123")))
                {

                    new Task().execute();
                }
                else
                {
                    error.setText("Usuario o contraseña incorrecta, intentelo nuevamente");
                }

            }
        });

    }

    class Task extends AsyncTask<String, Void, String>

    {


        @Override
        protected void onPreExecute()
        {

            pb.setVisibility(View.VISIBLE);

        }

        @Override
        protected String doInBackground(String... strings) {
            for(int i=1; i<=10; i++)
            {
                try
                {
                    Thread.sleep(500);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s)
        {
            Intent i = new Intent(getBaseContext(), home_act.class);
            startActivity(i);
        }

    }

    public void github(View view)
    {
        ArrayList<String> libros=new ArrayList<String>();

        libros.add("farenheit");
        libros.add("revival");
        libros.add("el alquimista");

        Intent i = new Intent(getBaseContext(), github_act.class);
        i.putExtra("listalibros",libros);
        startActivity(i);
    }


}