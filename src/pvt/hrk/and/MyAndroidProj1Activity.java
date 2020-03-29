package pvt.hrk.and;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.TabHost.TabSpec;
import android.widget.TableRow;

public class MyAndroidProj1Activity extends TabActivity {
	
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	 super.onCreate(savedInstanceState);
         setContentView(R.layout.main);
         this.setRequestedOrientation(
 				ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
         TabHost tabHost= getTabHost();
         
         Resources res = getResources();
         TabSpec spec;  // Resusable TabSpec for each tab
         Intent intent;  // Reusable Intent for each tab
         intent = new Intent().setClass(this, CampaignOwnerTableActivity.class);
         spec = tabHost.newTabSpec("table").setIndicator("TABLEVIEW",null) //res.getDrawable(R.drawable.ic_tab_artists))
             .setContent(intent);
         tabHost.addTab(spec);
         intent = new Intent().setClass(this, CampaignOwnerGraphActivity.class);
         spec = tabHost.newTabSpec("table").setIndicator("GraphView",null) //res.getDrawable(R.drawable.ic_tab_artists))
             .setContent(intent);
         tabHost.addTab(spec);
         
         tabHost.getTabWidget().getChildAt(0).getLayoutParams().height =45;
         tabHost.getTabWidget().getChildAt(1).getLayoutParams().height =45;
    }
  
}
