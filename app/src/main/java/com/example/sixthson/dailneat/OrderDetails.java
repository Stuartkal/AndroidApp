package com.example.sixthson.dailneat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderDetails extends AppCompatActivity {

    TextView Orders,Price;
    String order;
    Double price1,price2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        Orders=(TextView)findViewById(R.id.Orders);
        Price=(TextView)findViewById(R.id.Price);

        Bundle b = getIntent().getExtras();
        order = b.getString("choices");
        price1 = b.getDouble("price");

        Orders.setText(order);
        Price.setText("Total Amount: "+price1.toString());

    }
}
