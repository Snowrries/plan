package tyme.plan;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class sleepPanel extends Fragment {


	public sleepPanel() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_sleep_panel, container, false);
	}

	public void addSleep(android.view.View view){
		//poll the textbox for a value, do some error checking, and save this sleep entry in a VIEWMODEL with some metadata..
		//Alternatively, until a database is set up, simply increment a value saved in user preferences.

	}

	@Override
	public void onPause(){
		super.onPause();
		//Save the user input into the bundle here?
	}

}
