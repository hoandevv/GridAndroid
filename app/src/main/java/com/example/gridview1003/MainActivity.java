package com.example.gridview1003;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvDanhSach;
    List<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData(){

        lvDanhSach = findViewById(R.id.lvDanhSach);

        list = new ArrayList<>();

        list.add("Java");
        list.add("Android");
        list.add("PHP");
        list.add("C");
        list.add("C++");
        list.add("C#");

        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                list);

        lvDanhSach.setAdapter(adapter);
    }
}