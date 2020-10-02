package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lview;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lview = (ListView)findViewById(R.id.listview);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.ic_android, "Android"));
        arr_bean.add(new ListViewBean(R.drawable.ic_language, "Java"));
        arr_bean.add(new ListViewBean(R.drawable.ic_app,"Python"));
        arr_bean.add(new ListViewBean(R.drawable.ic_photo, "MySQL"));
        arr_bean.add(new ListViewBean(R.drawable.ic_user, "PHP"));
        arr_bean.add(new ListViewBean(R.drawable.ic_style, "PHP"));
        arr_bean.add(new ListViewBean(R.drawable.ic_esport, "PHP"));
        arr_bean.add(new ListViewBean(R.drawable.ic_face, "PHP"));
        arr_bean.add(new ListViewBean(R.drawable.ic_user, "PHP"));
        arr_bean.add(new ListViewBean(R.drawable.ic_language, "Java"));
        adapter = new ListViewBaseAdapter(arr_bean,this);
        lview.setAdapter(adapter);

    }
}
