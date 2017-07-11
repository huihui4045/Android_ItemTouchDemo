package com.huihui.itemtouch;

/**
 * Created by molu_ on 2017/7/11.
 */

public interface ItemTouchListener {

     boolean onMove(int fromPosition,int targetPosition);

    void onSwiped(int position);
}
