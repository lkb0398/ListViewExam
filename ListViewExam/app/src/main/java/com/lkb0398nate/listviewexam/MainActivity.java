
package com.lkb0398nate.listviewexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private List<Map<String, String>> mData;
    private SimpleAdapter mAdapter;
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
            Map<String, String> data = new HashMap<>();
            data.put("item", "Item" + i);
            data.put("subitem", "subItem" + i);
            mData.add(data);
        }
    }

    private void initAdapter() {
        mAdapter = new SimpleAdapter(getApplicationContext(), mData,
                android.R.layout.simple_list_item_2, new String[] {
                        "item", "subitem"
                }, new int[] {
                        android.R.id.text1, android.R.id.text2
                });
    }

    private void initListView() {
        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(mAdapter);
    }
}
