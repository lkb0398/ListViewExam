
package com.lkb0398nate.listviewexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> mData;
    private ArrayAdapter<String> mAdapter;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initAdapter();
        initListView();

        // Data 준비

        // 2. Adapter 준비

        // 3. ListView에 Adapter 장착

    }

    private void initData() {

        mData = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            mData.add("item " + i);
        }
    }

    private void initAdapter() {
        mAdapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, mData);
    }
    private void initListView() {
        mListView = (ListView)findViewById(R.id.list_view);
        mListView.setAdapter(mAdapter);
    }
}
