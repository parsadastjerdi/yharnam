package com.example.yharnam;

import android.app.ActionBar;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
                    ArmorFragment.OnFragmentInteractionListener,
                    WeaponsFragment.OnFragmentInteractionListener,
                    StatsFragment.OnFragmentInteractionListener,
                    SkillsFragment.OnFragmentInteractionListener,
                    SkillsButton.OnFragmentInteractionListener {

    // The total number of pages that is allowed for the main character builder activity
    private static int NUM_PAGES = 4;

    // The pager widget, which handles animation and allows swiping horizontally to access previous
    // and next wizard steps.
    private ViewPager mPager;

    // The pager adapter, which provides the pages to the view pager widget.
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // The menu on the top of the screen
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Drawer is the side menu on the left
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        // Instantiate a ViewPager and a PagerAdapter
        mPager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(pagerAdapter);


        // Begin the transaction. Replace fragment placeholders with actual fragment classes
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.skills_fragment_container, new SkillsFragment());
        ft.replace(R.id.weapons_fragment_container, new WeaponsFragment());
        ft.replace(R.id.armor_fragment_container, new ArmorFragment());
        ft.replace(R.id.stats_fragment_container, new StatsFragment());
        ft.commit();
    }


    // are these necessary??
    // @Override
    public void messageFromParentFragment(Uri uri) {
        Log.i("TAG", "received communication from parent fragment");
    }

    // @Override
    public void messageFromChildFragment(Uri uri) {
        Log.i("TAG", "received communication from child fragment");
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            if (mPager.getCurrentItem() == 0) {
                super.onBackPressed();
            } else {
                // Otherwise, set to previous step
                mPager.setCurrentItem(mPager.getCurrentItem() - 1);
            }
        }
    }

    private class ScreenSlidePagerAdapter extends SmartFragmentPagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position){

            switch (position){
                case 0:
                    return new SkillsFragment();
                case 1:
                    return new WeaponsFragment();
                case 2:
                    return new ArmorFragment();
                default:
                    // don't have a good default fragment, just using stats as default and case 3
                    return new StatsFragment();
            }

        }

        @Override
        public int getCount(){
            return NUM_PAGES;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "SKILLS";
                case 1:
                    return "WEAPONS";
                case 2:
                    return "ARMOR/RUNES";
                default:
                    // don't have a good default option, just using stats as default and case 3
                    return "STATS";
            }
        }
    }


    /*
        Inflate the menu; this adds items to the action bar if it is present.
    */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    /*
        Handle action bar item clicks here. The action bar will
        automatically handle clicks on the Home/Up button, so long
        as you specify a parent activity in AndroidManifest.xml.
    */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /*
        This will direct the user to a different activity depending on
        what they select from the side menu
    */
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_char_builder) {
            // Handle the camera action
        } else if (id == R.id.nav_my_builds) {

        } else if (id == R.id.nav_browse_builds) {

        } else if (id == R.id.nav_favorites) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onFragmentInteraction(){
        // empty
    }

}
