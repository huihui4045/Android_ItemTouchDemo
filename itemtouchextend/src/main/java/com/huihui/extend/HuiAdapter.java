package com.huihui.extend;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by molu_ on 2017/7/11.
 */

public class HuiAdapter extends RecyclerView.Adapter<HuiAdapter.MyViewHolder> implements ItemTouchListener{

    private List<String> datas;


    public HuiAdapter(List<String> datas) {
        this.datas = datas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_main, parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        String s = datas.get(position);

        holder.textView.setText(s);

    }

    @Override
    public int getItemCount() {
        return datas == null ? 0 : datas.size();
    }

    @Override
    public boolean onMove(int fromPosition, int targetPosition) {

        Collections.swap(datas,fromPosition,targetPosition);
        notifyItemMoved(fromPosition,targetPosition);
        return false;
    }

    @Override
    public void onSwiped(int position) {

        notifyItemRemoved(position);
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);



            textView = (TextView) itemView.findViewById(R.id.text_list_main_index);
        }
    }


}
