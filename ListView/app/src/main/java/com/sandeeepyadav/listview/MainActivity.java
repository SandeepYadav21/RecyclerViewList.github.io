package com.sandeeepyadav.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_list=new ArrayList<>();
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        main_list.add(new Model(R.drawable.sandeep,"Sandeep Yadav","Software Engineer"));
        main_list.add(new Model(R.drawable.rohan,"Rohan Dhekne","Software Engineer"));
        main_list.add(new Model(R.drawable.abhisek,"Abhisek Dey","....."));
        main_list.add(new Model(R.drawable.aayush,"Aayush Jain","AWS Engineer"));
        main_list.add(new Model(R.drawable.abhijitkar,"Abhijit Kar","Investor"));
        main_list.add(new Model(R.drawable.rahul,"Mohammed Sinan Rahoo","....."));
        main_list.add(new Model(R.drawable.hardik,"Hardik Bardia","....."));
        main_list.add(new Model(R.drawable.bhuvi,"Mohammed Shaim Khanusiya","Software Engineer"));
        main_list.add(new Model(R.drawable.jainam,"Jainam Gala","Security Engineer"));
        main_list.add(new Model(R.drawable.milan,"Milan kothari","Software Engineer"));
        adapter=new CustomAdapter(main_list,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }
}
