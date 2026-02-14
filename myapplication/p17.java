package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class p17 extends AppCompatActivity {
    ListView lv;
    ArrayList<usermodel> arr;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p17);

        lv = (ListView) findViewById(R.id.p17lv);
        arr = new ArrayList<>();

        arr.add(new usermodel("java","java@gmail.com","9685744152"));
        arr.add(new usermodel("python","python@gmail.com","8574966352"));
        arr.add(new usermodel("php","php@gmail.com", "4152639874"));

        cust_list ct = new cust_list(p17.this, arr);
        lv.setAdapter(ct);

    }

    private class cust_list extends BaseAdapter{

        Context context;
        ArrayList<usermodel> arrayList;
        LayoutInflater inflater;

        public cust_list(Context context, ArrayList<usermodel> arrayList) {
            this.context = context;
            this.arrayList = arrayList;
            inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return arrayList.size();
        }


        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.p17_view, null);

            TextView name = (TextView) convertView.findViewById(R.id.p17name);
            TextView email = (TextView) convertView.findViewById(R.id.p17email);
            TextView phone = (TextView) convertView.findViewById(R.id.p17contact);

            name.setText(arrayList.get(position).getName());
            email.setText(arrayList.get(position).getEmail());
            phone.setText(arrayList.get(position).getPhone());
            return convertView;
        }

    }
}
