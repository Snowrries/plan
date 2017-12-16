package tyme.plan;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

/**
 * Create a JSON file containing our data if it doesn't exist.
 * Otherwise open it.
 *
 * Populate the data structures in here with the data from the JSON when initialized
 *
 * Save data back into the JSON when destroyed.
 *
 * Use some sort of library to parse and serialize
 */

public class JsonViewModel extends AndroidViewModel {

	/*put the data structures here; only show the last 30 days of data?
	* Create a generic data object and give the label as an associated string.*/


	public JsonViewModel(@NonNull Application application) {
		super(application);
	}
}
