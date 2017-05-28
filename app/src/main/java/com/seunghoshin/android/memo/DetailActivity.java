package com.seunghoshin.android.memo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.listtool);

        // TODO 동영상
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Save", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        fab.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(getApplicationContext(),"종료되었습니다",Toast.LENGTH_SHORT).show();

//                Snackbar.make(v, "Cancel", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                finish();
                //아래 리턴값이 false면 클릭과 함께 사용했을때 롱클릭후에 클릭리스너가 함께 호출된다  .
                return true; // false로 바꿔주면 롱클릭끝나고나서 온클릭으로 조작하고 싶을때만 false로 쓴다 .

            }
        });




    }

}
