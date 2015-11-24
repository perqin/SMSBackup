package com.perqin.smsbackup;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private AllSMSRecyclerAdapter mRecyclerAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private FloatingActionButton mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.main_recycler_view);
        mRecyclerAdapter = new AllSMSRecyclerAdapter();
        mLayoutManager = new LinearLayoutManager(this);
        mFab = (FloatingActionButton)findViewById(R.id.backup_fab);

        mRecyclerView.setAdapter(mRecyclerAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
