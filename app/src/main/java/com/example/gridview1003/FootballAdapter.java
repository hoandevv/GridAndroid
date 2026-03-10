package com.example.gridview1003;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FootballAdapter extends BaseAdapter {

    Context context;
    int layout;
    List<Football> list;

    public FootballAdapter(Context context, int layout, List<Football> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        if(view == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(layout, parent, false);
        }

        TextView txtFullName = view.findViewById(R.id.txtFullName);
        TextView txtAddress = view.findViewById(R.id.txtAddress);
        ImageView imgAvatar = view.findViewById(R.id.imgAvatar);
        ImageView imgFlag = view.findViewById(R.id.imgFlag);

        Football football = list.get(position);

        txtFullName.setText(football.getFullName());
        txtAddress.setText(football.getAddress());
        imgAvatar.setImageResource(football.getAvatar());
        imgFlag.setImageResource(football.getFlag());

        return view;
    }
}