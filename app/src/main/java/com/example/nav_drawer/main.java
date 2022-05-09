package com.example.nav_drawer;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class main extends Fragment {


    public main() {
        // Required empty public constructor
    }


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
View v = inflater.inflate(R.layout.fragment_main, container, false);
ListView ls =v.findViewById(R.id.LS);
ArrayList<Books> arrayList =new ArrayList<>();
Books b1 = new Books();
b1.setImage(R.drawable.b1);
        b1.setBname("history");
        b1.setDetails("his his his his");
        b1.setPrice(150000);
        arrayList.add(b1);
        Books b2 = new Books();
        b2.setImage(R.drawable.b2);
        b2.setBname("chemast");
        b2.setDetails("done thi ches");
        b2.setPrice(700000);
        arrayList.add(b2);
        Books b3 = new Books();
        b3.setImage(R.drawable.b3);
        b3.setBname("math");
        b3.setDetails("nat maths maths");
        b3.setPrice(870000);
        arrayList.add(b3);
        BookAdaptor bookAdaptor;
        bookAdaptor = new BookAdaptor(getActivity(), R.layout.raw_details, arrayList);
        ls.setAdapter(bookAdaptor);


        return v ;
    }

}
