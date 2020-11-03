/*

public class SkillsButton extends Button {
    public SkillsButton(Context context, AttributeSet attrs){
        super(context, attrs);
    }

}
*/

package com.example.yharnam;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A fragment with a +/- button
 * Activities that contain this fragment must implement the
 * {@link SkillsButton.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SkillsButton#newInstance} factory method to
 * create an instance of this fragment.
 */

public class SkillsButton extends Fragment {
    private Button addButton;
    private Button subtractButton;
    private TextView textView;

    private OnFragmentInteractionListener listener;
    private static final int REQ_CODE = 2424;
    StatsFragment statsFragment;

    public SkillsButton() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (ViewGroup) inflater.inflate(R.layout.skills_button, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        textView = (TextView) view.findViewById(R.id.button_value);

        // final Intent intent = new Intent(this, StatsFragment.class);
        statsFragment = (StatsFragment) getFragmentManager().findFragmentById(R.id.stats_fragment_container);
        final Fragment parent = getParentFragment();

        addButton = (Button) view.findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (listener != null) {
                    listener.onFragmentInteraction();
                }

                int val = Integer.parseInt(textView.getText().toString());
                if (val >= 0 && val < 99) {
                    textView.setText(String.format("%d", val + 1));
                    // parent.setLevel(String.format("%d", val + 1)));
                }

                // intent.putExtra("stat");
                // startActivity(intent);

                if (statsFragment != null){
                    statsFragment.setValues();
                } else {
                    Log.v("ADD FRAG MANAGER", "NULL");
                }


            }
        });

        /******** GET THE BACKGROUND VALUE TO DISAPPEAR AND THEN GET VALUES PASSED TO STATS *******/

        subtractButton = (Button) view.findViewById(R.id.subtract_button);
        subtractButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (listener != null){
                    listener.onFragmentInteraction();
                }

                int val = Integer.parseInt(textView.getText().toString());
                if (val > 0 && val <= 99) {
                    textView.setText(String.format("%d", val - 1));

                    if (parent != null){
                        // parent.setLevel(String.format("%d", val - 1));
                    } else {
                        Log.v("SUBTRACT PARENT ", "FAILED");
                    }
                }

                if (statsFragment != null){
                    statsFragment.setValues();
                } else {
                    Log.v("SUBTRACT FRAG MANAGER", "NULL");
                }
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            listener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
/*
        if (context instanceof OnChildFragmentInteractionByActivityListener) {
            onChildFragmentInteractionByActivityListener = (OnChildFragmentInteractionByActivityListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " OnChildFragmentInteractionByActivityListener must be implemented by the Activity.");
        }

        if (getParentFragment() instanceof OnChildFragmentInteractionByParentFragmentListener) {
            onChildFragmentInteractionByParentFragmentListener = (OnChildFragmentInteractionByParentFragmentListener) getParentFragment();
        } else {
            throw new RuntimeException(" OnChildFragmentInteractionByParentFragmentListener must be implemented by the Parent Fragment.");
        }
        */
    }


    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction();
    }

}





