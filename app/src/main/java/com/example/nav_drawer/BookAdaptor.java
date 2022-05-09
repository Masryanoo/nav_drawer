package com.example.nav_drawer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class BookAdaptor extends ArrayAdapter<Books> {
    public BookAdaptor(Context context, int resource, List<Books> objects) {
        super(context, resource, objects);
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.raw_details , parent , false);
        TextView name = convertView.findViewById(R.id.bookname);
        TextView price = convertView.findViewById(R.id.price);
        TextView details = convertView.findViewById(R.id.details);
        ImageView m =convertView.findViewById(R.id.bookimage);
        ConstraintLayout c= convertView.findViewById(R.id.raw);

        name.setText(getItem(position).getBname());
        price.setText("" +getItem(position).getPrice());
        details.setText(getItem(position).getDetails());
        m.setImageResource((int) getItem(position).getImage());

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(getContext() , details_activity.class);
                Bundle data = new Bundle();

                data.putDouble("price", getItem(position).getPrice());
                data.putString("name", getItem(position).getBname());
                data.putString("details",getItem(position).getDetails());
                data.putDouble("image",getItem(position).getImage());


                go.putExtras(data);
                getContext().startActivity(go);

            }
        });



        return convertView;
    }

}
