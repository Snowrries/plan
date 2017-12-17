package tyme.plan;


import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class sleepPanel extends Fragment {

	private JsonViewModel model;

	public sleepPanel() {
		// Required empty public constructor
	}

	public void onStart() {
		super.onStart();
		model = ViewModelProviders.of((FragmentActivity) getActivity()).get(JsonViewModel.class);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_sleep_panel, container, false);
	}

	public void addSleep(android.view.View view){
		//poll the textbox for a value, do some error checking, and save this sleep entry in a VIEWMODEL with some metadata..
		int hours = R.id.hourInput;
		int minutes = (R.id.hourInput%10)*60;
		sleepData add = new sleepData(hours,minutes);

	}

	@Override
	public void onPause(){
		super.onPause();
		//Save the user input into the bundle here?
	}

}
