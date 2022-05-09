package com.example.nav_drawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details_activity extends AppCompatActivity {
    TextView name ,price , details ;
ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_activity);
         name = findViewById(R.id.name);
         price = findViewById(R.id.price);
         details = findViewById(R.id.details);
Bundle data =getIntent().getExtras();
price.setText("" + data.getInt("price"));
name.setText(data.getString("name"));
details.setText(data.getString("details"));
image.setImageResource((int) data.getDouble("image"));

    }
}
