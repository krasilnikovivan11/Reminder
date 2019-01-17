package krasilnikovivan.ru.splashscreen.dialog;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.Calendar;
import java.util.zip.Inflater;

import krasilnikovivan.ru.splashscreen.R;
import krasilnikovivan.ru.splashscreen.fragments.Utils;

public class AddingDialogTaskFragment extends DialogFragment {
    public AddingDialogTaskFragment() {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle(R.string.adding_task_title);
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View container = inflater.inflate(R.layout.dialog_task, null);

        TextInputLayout tilTitle = container.findViewById(R.id.dialog_task_title);
        TextInputLayout tilTime = container.findViewById(R.id.dialog_task_time);
        final TextInputLayout tilDate = container.findViewById(R.id.dialog_task_date);
        EditText title = tilTitle.getEditText();
        final EditText date = tilDate.getEditText();
        EditText time = tilTime.getEditText();
        tilTitle.setHint(getResources().getString(R.string.title_dialog));
        tilTime.setHint(getResources().getString(R.string.task_time));
        tilDate.setHint(getResources().getString(R.string.task_date));
        alertDialog.setView(container);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerFragment datePickerFragment = new DatePickerFragment();
            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerFragment timePickerFragment = new DatePickerFragment();
                date.setText(Utils.getDate(timePickerFragment.getDate()));


            }
        });
        return super.onCreateDialog(savedInstanceState);
    }
}
