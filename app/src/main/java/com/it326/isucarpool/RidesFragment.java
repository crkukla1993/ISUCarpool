package com.it326.isucarpool;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * A placeholder fragment containing a simple view.
 */
public class RidesFragment extends Fragment {

    interface ridesListener {
        boolean listItemClicked(View view);
    }

    ridesListener listener;

    public RidesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_rides, container, false);

        return inflater.inflate(R.layout.fragment_rides, container, false);
    }

    public void listItemClicked(View view) {
        if(listener != null){
            listener.listItemClicked(view);
        }
    }
}
