package pvt.hrk.and;

import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

public class MyTableRowLayout extends TableRow {
	
	CampaignOwnerCount coc = null;
	Context context;
	public MyTableRowLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public MyTableRowLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public MyTableRowLayout(Context context, CampaignOwnerCount coc) {
		super(context);
		this.coc = coc;
		this.context = context;
	}

	@Override
	public int getVirtualChildCount() {
		// TODO Auto-generated method stub
		return 3;
	}
	@Override
	public View getVirtualChildAt(int i) {
		
		TextView tv = new TextView(context);
		//tv.setLayoutParams(LayoutParams.WRAP_CONTENT);
		String content="";
		if (i==0)content = coc.getOwnerName();
		else if (i==1)content = coc.getOwnerType();
		else content = coc.getCount();
		tv.setText(content);
		return tv;
	}
}
