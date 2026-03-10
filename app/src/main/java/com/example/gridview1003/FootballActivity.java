package com.example.gridview1003;
import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class FootballActivity extends AppCompatActivity {

    GridView lvFootball;
    List<Football> list;
    FootballAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);

        initData();
    }

    private void initData() {

        lvFootball = findViewById(R.id.lvFootball);

        list = new ArrayList<>();

        list.add(new Football("Nguyễn Quang Hải","Pau FC",R.drawable.quang_hai,R.drawable.paufc_logo));
        list.add(new Football("Nguyễn Công Phượng","HAGL",R.drawable.cong_phuong,R.drawable.co_hagl));
        list.add(new Football("Nguyễn Tuấn Anh","HAGL",R.drawable.tuan_anh,R.drawable.co_hagl));
        list.add(new Football("Vũ Văn Thanh","HAGL",R.drawable.van_thanh,R.drawable.co_hagl));
        list.add(new Football("Nguyễn Văn Toàn","HAGL",R.drawable.van_toan,R.drawable.co_hagl));
        list.add(new Football("Lương Xuân Trường","HAGL",R.drawable.xuan_truong,R.drawable.co_hagl));

        adapter = new FootballAdapter(this,R.layout.line_football,list);

        lvFootball.setAdapter(adapter);
    }
}