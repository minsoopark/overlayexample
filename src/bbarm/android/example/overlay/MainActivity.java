package bbarm.android.example.overlay;

import bbarm.android.example.overlay.service.SampleOverlayService;
import bbarm.android.example.overlay.service.SampleOverlayView;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		startService(new Intent(this, SampleOverlayService.class));
		finish();
	}

}