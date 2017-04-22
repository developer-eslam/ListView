package com.serverproject.facedetection.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String []names = {"A","B","S","A","B","S","A","B","S","A","B","S","A","B","S"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.listview);


//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,names);
//        listView.setAdapter(arrayAdapter);
//        for(int i=0;i<names.length;i++)
//        Log.d("NamesUsers",names[i]);

        NamesAdapter namesAdapter = new NamesAdapter(getApplicationContext(),names);
        listView.setAdapter(namesAdapter);
    }
}
