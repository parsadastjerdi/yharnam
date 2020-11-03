package com.example.yharnam;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link WeaponsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link WeaponsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeaponsFragment extends Fragment {

    View view;

    private OnFragmentInteractionListener listener;

    public WeaponsFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    /*
        The onCreateView method is called when Fragment should create its View object hierarchy,
        either dynamically or via XML layout inflation.
    */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (ViewGroup) inflater.inflate(R.layout.weapons_fragment, container, false);
    }


    /*
        This event is triggered soon after onCreateView().
        onViewCreated() is only called if the view returned from onCreateView() is non-null.
        Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    */
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        // Create spinners
        Spinner rh1 = (Spinner) view.findViewById(R.id.right_hand_spinner1);
        Spinner rh2 = (Spinner) view.findViewById(R.id.right_hand_spinner2);
        Spinner lh1 = (Spinner) view.findViewById(R.id.left_hand_spinner1);
        Spinner lh2 = (Spinner) view.findViewById(R.id.left_hand_spinner2);

        // Create array adapters
        ArrayAdapter<CharSequence> rh1Adapter = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.right_hand_weapons, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> rh2Adapter = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.right_hand_weapons, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> lh1Adapter = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.left_hand_weapons, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> lh2Adapter = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.left_hand_weapons, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        rh1Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rh2Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lh1Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lh2Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        rh1.setAdapter(rh1Adapter);
        rh2.setAdapter(rh2Adapter);
        lh1.setAdapter(lh1Adapter);
        lh2.setAdapter(lh2Adapter);
    }


    // TODO: Rename method, update argument and hook method into UI event.
    // This method should take the newly input weapons and update the stats on the last page
    public void updateStats() {
        if (listener != null) {
            listener.onFragmentInteraction();
        }
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
