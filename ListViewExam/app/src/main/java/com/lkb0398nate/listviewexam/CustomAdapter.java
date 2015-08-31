
package com.lkb0398nate.listviewexam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kb on 2015-08-31.
 */
public class CustomAdapter extends BaseAdapter {

    private List<People> mData;
    private Context mContext;

    public CustomAdapter(Context context, List<People> data) {
        mData = data;
        mContext = context;
    }


    //  아이템의 개수
    @Override
    public int getCount() {
        return mData.size();
    }

    //    해당 포지션의 위치하는 아이템
    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    //    해당 포지션의 위치하는 아이템 id
    @Override
    public long getItemId(int position) {
        return position;
    }

    //    각 포지션 번째의 아이템을 보여줄 뷰
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        // 1. 레이아웃 구성

//        convertView 처음 로딩 될 때 초기화 과정을 거쳐서 viewHolder에 저장
        if (convertView == null) {

            View rootView = LayoutInflater.from(mContext).inflate(R.layout.item_peole, parent, false);

            convertView.findViewById(R.id.mic_view);


            // 뷰를 각 소스로 연결
            ImageView image = (ImageView) convertView.findViewById(R.id.mic_view);
            TextView name = (TextView) convertView.findViewById(R.id.inter_text);
            TextView phoneNumber = (TextView) convertView.findViewById(R.id.answer_text);


            // viewHolder 를 생성 후, 가져온 View를 연결
            viewHolder = new ViewHolder();
            viewHolder.image = image;
            viewHolder.name = name;
            viewHolder.phone = phoneNumber;

            //ViewHolder 를 convertView의 태그로 저장.
            convertView.setTag(viewHolder);

        } else {
            // convertView 가 다시 로딩 될떄는 viewHolder에서 꺼내와서 재사용
            // 이점 : 속도가 빠르다

            viewHolder = (ViewHolder) convertView.getTag();
        }

        // 2. 레이아웃 데이터를 바인딩

        People people1 = mData.get(position);
        People people = (People) getItem(position);
        viewHolder.image.setImageResource(people.getImageResoutceId());
        viewHolder.name.setText(people.getName());
        viewHolder.phone.setText(people.getPhonenumber());

        // 3. 완성된 View를 리턴

        return null;
    }

    static class ViewHolder {
        ImageView image;
        TextView name;
        TextView phone;

    }
}
