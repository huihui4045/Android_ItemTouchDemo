package com.huihui.itemtouch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = ((RecyclerView) findViewById(R.id.recycler));





        List<String> datas = new ArrayList<>();

        for (int i = 0; i < 30; i++) {

            datas.add("裴银灰" + i);
        }


        HuiAdapter adapter = new HuiAdapter(datas);


        mRecyclerView.setAdapter(adapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));



        SimpleItemTouchCallBack callBack=new SimpleItemTouchCallBack(adapter);

        ItemTouchHelper helper=new ItemTouchHelper(callBack);

        helper.attachToRecyclerView(mRecyclerView);



    }
}
