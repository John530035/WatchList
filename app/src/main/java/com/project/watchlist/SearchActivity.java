package com.project.watchlist;

public class SearchActivity extends AbstractActivity {


    @Override
    public void initializeClassFields() {
        this.layoutResId = R.layout.activity_search;

        this.drawerLayoutId = R.id.search_drawer_layout;

        this.navigationViewId = R.id.search_nav_view;

        this.toolbarId = R.id.search_toolbar;

        this.context = SearchActivity.this;
    }
}