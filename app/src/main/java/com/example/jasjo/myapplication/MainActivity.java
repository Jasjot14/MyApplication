package com.example.jasjo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtTitle;
    //TextView txtTitle;
    EditText eTxtNum1, eTxtNum2;
    Button btnAddNumbers;
    void initViews(){
        txtTitle = findViewById(R.id.textView);
        eTxtNum1 = findViewById(R.id.editText);
        eTxtNum2 = findViewById(R.id.editText2);
        btnAddNumbers = findViewById(R.id.button);

        btnAddNumbers.setOnClickListener(this);

        getSupportActionBar().setTitle("Add Numbers UI");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        txtTitle = findViewById(R.id.textView);

        initViews();

    }

   /* public void clickHandler(View view){

        Date date = new Date();
        String message = "Its: "+date;
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();

        txtTitle.setText(message);
    }*/

    @Override
    public void onClick(View v) {


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(1,101,2,"Addition");
        menu.add(1,201,5,"Substraction");
        menu.add(1,301,1,"Multiplication");
        menu.add(2,401,3,"Division");
        //menu.add(2,501,4,"Recently Played");

        //getMenuInflater().inflate(R.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String num1 = eTxtNum1.getText().toString();
        String num2 = eTxtNum2.getText().toString();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);




        int id = item.getItemId();

        switch (id) {
            case 101: int n3 = n1 + n2;
                txtTitle.setText("Welcome\nResult is:"+n3);
                break;

            case 201:
        int n4=n1-n2;
                txtTitle.setText("Welcome\nResult is:"+n4);
                break;






            case 301:
                int n5=n1*n2;
                txtTitle.setText("Welcome\nResult is:"+n5);
                break;


            case 401:
                int n6=n1/n2;
                txtTitle.setText("Welcome\nResult is:"+n6);



            break;



            /*case R.id.allSongs:

                break;

            case R.id.fav:

                break;

            case R.id.bol:
                Toast.makeText(this, "Bollywood Songs Selected", Toast.LENGTH_LONG).show();
                break;*/
        }


        return super.onOptionsItemSelected(item);
    }
}
