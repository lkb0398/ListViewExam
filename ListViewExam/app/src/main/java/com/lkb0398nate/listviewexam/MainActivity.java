
package com.lkb0398nate.listviewexam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<People> mData;
    private CustomAdapter mAdapter;
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

        mData.add(new People(R.drawable.mic, "주둥이", "010-4046-0398"));
        mData.add(new People(R.drawable.taste, "혓바닥", "010-7171-8045"));

        for (int i = 0; i <= 100; i++) {
            mData.add(new People(R.mipmap.ic_launcher, "아무개" + i, "번호없음"));
        }
    }

    private void initAdapter() {
        mAdapter = new CustomAdapter(getApplicationContext(), mData);
    }

    private void initListView() {
        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Item이 클릭 되었을 때 동작 하는 부분

                Toast.makeText(MainActivity.this, "position" + position, Toast.LENGTH_SHORT).show();

                Uri uri = Uri.parse("tel:" + mData.get(position).getPhonenumber());
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);

                startActivity(intent);
            }
        });
    }
}
