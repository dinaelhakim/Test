package com.example.dinaelhakim.myapplication.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dinaelhakim.myapplication.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 8/8/2018.
 */

public class MainRecyclerViewAdapter extends RecyclerView.Adapter<MainRecyclerViewAdapter.MainRecyclerViewHolder> {

    private String[] mainList;
    private ArrayList<View.OnClickListener> listeners;

    public MainRecyclerViewAdapter(String[] mainList, ArrayList<View.OnClickListener> listeners) {
        this.mainList = mainList;
        this.listeners = listeners;
    }

    @Override
    public MainRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_view_list_item, parent, false);
        return new MainRecyclerViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MainRecyclerViewHolder holder, int position) {
        holder.textView.setText(mainList[position]);
        holder.textView.setOnClickListener(listeners.get(position));
    }

    @Override
    public int getItemCount() {
        return mainList.length;
    }

    public class MainRecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public MainRecyclerViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.txt_view_main_list);
        }
    }
}
