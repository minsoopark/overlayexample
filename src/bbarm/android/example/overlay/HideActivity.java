package bbarm.android.example.overlay;

import bbarm.android.example.overlay.service.SampleOverlayService;
import android.app.Activity;
import android.os.Bundle;

public class HideActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    SampleOverlayService.stop();
	    finish();
	}

}
