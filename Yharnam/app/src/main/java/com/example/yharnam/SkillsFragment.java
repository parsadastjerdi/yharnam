package com.example.yharnam;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SkillsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SkillsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SkillsFragment extends Fragment {
    TextView level;
    private OnFragmentInteractionListener listener;

    public SkillsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (ViewGroup) inflater.inflate(R.layout.skills_fragment, container, false);
    }


    // TODO: Rename method, update argument and hook method into UI event. what does this even do??
    public void onButtonPressed() {
        if (listener != null) {
            listener.onFragmentInteraction();
        }
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        // Setup origin spinner
        Spinner origin = (Spinner) view.findViewById(R.id.origin_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.origins, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        origin.setAdapter(adapter);

        // Setup level textview
        level = (TextView) view.findViewById(R.id.player_level);

        // TODO: Setup toggle button

        // Must always use getChildFragmentManager instead or regular when working with
        // layered fragments
        FragmentTransaction insightTransaction = getChildFragmentManager().beginTransaction();
        FragmentTransaction vitalityTransaction = getChildFragmentManager().beginTransaction();
        FragmentTransaction enduranceTransaction = getChildFragmentManager().beginTransaction();
        FragmentTransaction strengthTransaction = getChildFragmentManager().beginTransaction();
        FragmentTransaction skillTransaction = getChildFragmentManager().beginTransaction();
        FragmentTransaction bloodtingeTransaction = getChildFragmentManager().beginTransaction();
        FragmentTransaction arcaneTransaction = getChildFragmentManager().beginTransaction();

        // Replace all fragment containers with a new skillsbutton
        insightTransaction.replace(R.id.insight_button_container, new SkillsButton()).commit();
        vitalityTransaction.replace(R.id.vitality_button_container, new SkillsButton()).commit();
        enduranceTransaction.replace(R.id.endurance_button_container, new SkillsButton()).commit();
        strengthTransaction.replace(R.id.strength_button_container, new SkillsButton()).commit();
        skillTransaction.replace(R.id.skill_button_container, new SkillsButton()).commit();
        bloodtingeTransaction.replace(R.id.bloodtinge_button_container, new SkillsButton()).commit();
        arcaneTransaction.replace(R.id.arcane_button_container, new SkillsButton()).commit();
    }

    public void setLevel(String level){
        if (listener != null){
            listener.onFragmentInteraction();
        }

        // level.setText(level);
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
     * Info: http://developer.android.com/training/basics/fragments/communicating.html
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name -- to what exactly?
        void onFragmentInteraction();
    }

}
