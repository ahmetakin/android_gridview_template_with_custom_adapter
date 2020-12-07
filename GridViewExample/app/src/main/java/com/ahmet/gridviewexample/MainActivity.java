package com.ahmet.gridviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView simpleList;
    ArrayList<Item> itemList = new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (GridView) findViewById(R.id.simpleGridView);
        itemList.add(new Item("Facebook",R.drawable.facebook));
        itemList.add(new Item("Steve",R.drawable.steve));
        itemList.add(new Item("Taksi",R.drawable.taksi));
        itemList.add(new Item("Tank",R.drawable.tank));
        itemList.add(new Item("Tea",R.drawable.tea));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.grid_view_items,itemList);
        simpleList.setAdapter(myAdapter);

    }
}