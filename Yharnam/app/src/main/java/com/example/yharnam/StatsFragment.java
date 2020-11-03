package com.example.yharnam;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link StatsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link StatsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StatsFragment extends Fragment {

    private OnFragmentInteractionListener listener;
    TextView hp, stamina, rh1, rh2, lh1, lh2;

    public StatsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (ViewGroup) inflater.inflate(R.layout.stats_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        hp = (TextView) view.findViewById(R.id.hp_stat);
        Log.v("HP","SET");
        //stamina = (TextView) view.findViewById(R.id.stamina_stat);
        //rh1 = (TextView) view.findViewById(R.id.rh1_stat);
        //rh2 = (TextView) view.findViewById(R.id.rh2_stat);
        //lh1 = (TextView) view.findViewById(R.id.lh1_stat);
        //lh2 = (TextView) view.findViewById(R.id.lh2_stat);
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


    public void setValues(){
        if (listener != null){
            listener.onFragmentInteraction();
        }

        Log.v("STATS FRAG", "CALLED");
        int val = Integer.parseInt(hp.getText().toString());
        hp.setText(String.format("%d", val + 1));
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction();
    }
}
