package pvt.hrk.and;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CampaignOwnerGraphActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv = new TextView(this);
		tv.setText("Other tab");
		setContentView(tv);
	}
}
