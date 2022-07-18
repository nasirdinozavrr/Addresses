package com.example.addresses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> addresses = new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        AddressesAdapter adapter = new AddressesAdapter(addresses);
        recyclerView.setAdapter(adapter);
        loadDate();
        }
    private void loadDate() {
        addresses=new ArrayList<>();
        addresses.add("Toktogula, 138");
        addresses.add("Chui, 17");
        addresses.add("Sovetskaya, 160");
        addresses.add("Kievskaya, 10");
        addresses.add("Tynalieva, 84");
        addresses.add("Maldybaeva, 77");
        addresses.add("Gagarina, 9");
        addresses.add("Bokonbaeva, 66");
        addresses.add("Gorkaya, 12");
        addresses.add("Almatinskaya, 4");
        addresses.add("Baha, 8");
        addresses.add("Ahunbaeva, 98");
        addresses.add("Moskovskaya, 211");

    }

}