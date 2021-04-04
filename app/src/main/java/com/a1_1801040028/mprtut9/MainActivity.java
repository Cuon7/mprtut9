package com.a1_1801040028.mprtut9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = new BookmarksFragment();
        manager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit();

        Bundle args = new Bundle();
        args.putString("KEY", "value"); // putInt, putDouble...
        fragment.setArguments(args);
    }


}