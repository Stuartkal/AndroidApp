package com.example.sixthson.dailneat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton rolexBtn,samosaBtn,eggrollBtn,chapatBtn,sausageBtn,kebabtBtn;
    String choices="";
    Double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rolexBtn=(ImageButton)findViewById(R.id.rolexBtn);
        samosaBtn=(ImageButton)findViewById(R.id.samosaBtn);
        eggrollBtn=(ImageButton)findViewById(R.id.eggrollBtn);
        chapatBtn=(ImageButton)findViewById(R.id.chapatBtn);
        sausageBtn=(ImageButton)findViewById(R.id.sausageBtn);
        kebabtBtn=(ImageButton)findViewById(R.id.kebabtBtn);
    }

    public void add_to_list(View view)
    {
        if(view == findViewById(R.id.rolexBtn))
        {

            choices = choices+"Rolex"+"\n";
            price = price+2500;
        }
        else if(view == findViewById(R.id.samosaBtn))
        {

            choices = choices+"Samusa"+"\n";
            price = price+1500;
        }
        else if(view == findViewById(R.id.eggrollBtn))
        {

            choices = choices+"EggRoll"+"\n";
            price = price+2000;
        }
        else if(view == findViewById(R.id.chapatBtn))
        {

            choices = choices+"Chapat"+"\n";
            price = price+1000;
        }
        else if(view == findViewById(R.id.sausageBtn))
        {

            choices = choices+"Sausage"+"\n";
            price = price+1500;
        }
        else if(view == findViewById(R.id.kebabtBtn))
        {

            choices = choices+"Kebab"+"\n";
            price = price+3000;
        }
    }

    public void placeOrder(View view)
    {
        Intent i= new Intent(MainActivity.this,OrderDetails.class);
        Bundle b = new Bundle();
        b.putString("choices",choices);
        b.putDouble("price",price);
        i.putExtras(b);
        startActivity(i);
    }
}
