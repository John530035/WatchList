package com.project.watchlist;

public class MainActivity extends AbstractActivity {


    @Override
    public void initializeClassFields() {
        this.layoutResId = R.layout.activity_main;

        this.drawerLayoutId = R.id.drawer_layout;

        this.navigationViewId = R.id.nav_view;

        this.toolbarId = R.id.home_toolbar;

        this.context = MainActivity.this;
    }
}