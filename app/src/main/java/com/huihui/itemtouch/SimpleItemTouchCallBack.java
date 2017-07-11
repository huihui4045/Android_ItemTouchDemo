package com.huihui.itemtouch;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by molu_ on 2017/7/11.
 */

public class SimpleItemTouchCallBack extends ItemTouchHelper.Callback {

    ItemTouchListener mItemTouchListener;


    public SimpleItemTouchCallBack(ItemTouchListener mItemTouchListener) {
        this.mItemTouchListener = mItemTouchListener;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {

        int dragFlags = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
        int swipeFlags = ItemTouchHelper.START | ItemTouchHelper.END;
        return makeMovementFlags(dragFlags, swipeFlags);

    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {

        mItemTouchListener.onMove(viewHolder.getAdapterPosition(),target.getAdapterPosition());
        return true;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

        mItemTouchListener.onSwiped(viewHolder.getAdapterPosition());
    }
}
