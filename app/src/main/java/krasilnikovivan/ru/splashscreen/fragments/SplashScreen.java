package krasilnikovivan.ru.splashscreen.fragments;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.concurrent.TimeUnit;

import krasilnikovivan.ru.splashscreen.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SplashScreen extends Fragment {


    public SplashScreen() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        SplashTask splashTask = new SplashTask();
        splashTask.execute();
        return inflater.inflate(R.layout.fragment_splash_screen, container, false);

    }
public  class SplashTask extends AsyncTask<Void,Void,Void>{

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getActivity().getSupportFragmentManager().popBackStack();
        return null;
    }
}
}
