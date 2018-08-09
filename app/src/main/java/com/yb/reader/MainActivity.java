package com.yb.reader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.geometerplus.android.fbreader.FBReader;
import org.geometerplus.fbreader.book.Book;
import org.geometerplus.fbreader.fbreader.FBReaderApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText("开始读书");
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Book book = new Book(49, "/storage/emulated/0/epub/高兴死了！！！.epub", "高兴死了！！！.epub", "auto", "zh");
//                FBReader.openBookActivity(MainActivity.this, book, null);
                startActivity(FBReader.defaultIntent(MainActivity.this));
            }
        });
    }

}
