package com.project.watchlist;

public class RankingsActivity extends AbstractActivity {

    @Override
    public void initializeClassFields() {
        this.layoutResId = R.layout.activity_rankings;

        this.drawerLayoutId = R.id.rankings_drawer_layout;

        this.navigationViewId = R.id.rankings_nav_view;

        this.toolbarId = R.id.rankings_toolbar;

        this.context = RankingsActivity.this;
    }
}