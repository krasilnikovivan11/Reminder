package krasilnikovivan.ru.splashscreen.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import krasilnikovivan.ru.splashscreen.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DoneTask extends Fragment {


    public DoneTask() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_done_task, container, false);
    }

}
