package com.example.younghyun.bnuts;

import android.app.Dialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.TabHost;


public class MainActivity extends ActionBarActivity {

    private CalendarView calendarView;
    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initGraph();

        calendarView = (CalendarView)findViewById(R.id.calendar);
        calendarView.setShowWeekNumber(false);

        tabHost = (TabHost)findViewById(android.R.id.tabhost);
        tabHost.setup();

        tabHost.addTab(tabHost.newTabSpec("TAB1")
                .setContent(R.id.main_layout).setIndicator(getString(R.string.main_layout)));
        tabHost.addTab(tabHost.newTabSpec("TAB2")
                .setContent(R.id.calendar_layout).setIndicator(getString(R.string.calendar_layout)));
        tabHost.addTab(tabHost.newTabSpec("TAB3")
                .setContent(R.id.graph_layout).setIndicator(getString(R.string.graph_layout)));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void goToday() {
        //달력을 투데이로 보내는 버
    }

    public void initGraph() {
        //그래프 구현
    }

    public void clickDay() {
        //날짜 클릭
    }
}
