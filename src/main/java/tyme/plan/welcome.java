package tyme.plan;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class welcome extends AppCompatActivity {
	private JsonViewModel model;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		//Open VIEWMODEL
		model = ViewModelProviders.of(this).get(JsonViewModel.class);
		//Check if anything's in the savedInstanceState?
		//Set up fragments here.
		FragmentManager producer = getFragmentManager();
		FragmentTransaction transaction = producer.beginTransaction();
		sleepPanel fragment = new sleepPanel();
		transaction.add(R.id.panel1,fragment);
		//Add other fragments here when they're made?
		transaction.commit();


	}

	@Override
	protected void onStop() {
		super.onStop();
		//Here, we'll clean up resources from our fragments.
		//Viewmodel should clean up itself.

	}

}