package com.example.thermonitor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Listactivity extends AppCompatActivity {
    String listitems [] = new String[]{"SQL", "JAVA", "JAVASCRIPT","C", "PYTHON","CPLUS"};
    int [] images = {R.drawable.sql, R.drawable.java, R.drawable.javascript, R.drawable.c,R.drawable.python,R.drawable.cplus};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listactivity);
        ListView listView = (ListView)findViewById(R.id.Listactivity);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);

       // ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_activated_1,listitems);
        //listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Listactivity.this,EmptyActivity.class);
                startActivity(intent);

            }
        });

    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
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

            convertView = getLayoutInflater().inflate(R.layout.youssef, null);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
            TextView textView = (TextView) convertView.findViewById(R.id.textView);
            imageView.setImageResource(images[position]);
            textView.setText(listitems[position]);
            return convertView;
        }
    }
}