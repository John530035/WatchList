package com.project.watchlist;

public class EntryActivity extends AbstractActivity {

    @Override
    public void initializeClassFields() {
        this.layoutResId = R.layout.activity_entry;

        this.drawerLayoutId = R.id.entry_drawer_layout;

        this.navigationViewId = R.id.entry_nav_view;

        this.toolbarId = R.id.entry_toolbar;

        this.context = EntryActivity.this;
    }
}