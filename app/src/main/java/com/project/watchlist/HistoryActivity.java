package com.project.watchlist;

public class HistoryActivity extends AbstractActivity {

    @Override
    public void initializeClassFields() {
        this.layoutResId = R.layout.activity_history;

        this.drawerLayoutId = R.id.history_drawer_layout;

        this.navigationViewId = R.id.history_nav_view;

        this.toolbarId = R.id.history_toolbar;

        this.context = HistoryActivity.this;
    }
}