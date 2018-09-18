package com.example.nam.donationmanager;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DonationGroup extends AppCompatActivity {

    final int ITEM_SIZE = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group_select);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        List<Item> items = new ArrayList<>();
        Item[] item = new Item[ITEM_SIZE];
        item[0] = new Item(R.drawable.unicef, "유니세프");
        item[1] = new Item(R.drawable.neighbors, "굿네이버스");
        item[2] = new Item(R.drawable.redcross, "대한적십자사");
        item[3] = new Item(R.drawable.kfhi, "기아대책");
        item[4] = new Item(R.drawable.kfhi, "가나");
        item[5] = new Item(R.drawable.kfhi, "다라");
        item[6] = new Item(R.drawable.kfhi, "마바");
        item[7] = new Item(R.drawable.kfhi, "사아자");

        for (int i = 0; i < ITEM_SIZE; i++) {
            items.add(item[i]);
        }

        recyclerView.setAdapter(new RecyclerAdapter(getApplicationContext(), items, R.layout.activity_main));
    }
}