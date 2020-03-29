package pvt.hrk.and;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.widget.TableLayout;

public class MyTableLayout extends TableLayout {
	
	List<CampaignOwnerCount> objects = null;
	private static int i=0;
	private Context context;
	public MyTableLayout(Context context) {
		super(context);
		this.context = context;
		objects = new ArrayList<CampaignOwnerCount>();
		objects.add(new CampaignOwnerCount("	BUSINESS_ENTITY_NAME	","	OWNER_LEVEL	","	COUNT	"));
		objects.add(new CampaignOwnerCount("	NIELSEN MEDIA RESEARCH	","	Primary	","	381	"));
		objects.add(new CampaignOwnerCount("	COLLECTIVE MEDIA	","	Primary	","	5	"));
		objects.add(new CampaignOwnerCount("	UNILEVER PLC	","	Secondary	","	44	"));
		objects.add(new CampaignOwnerCount("	ZENITH MEDIA SERVICES, INC.	","	Secondary	","	7	"));
		objects.add(new CampaignOwnerCount("	TREMOR VIDEO, INC.	","	Primary	","	44	"));
		objects.add(new CampaignOwnerCount("	DIGITAL BROADCASTING GROUP	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	A & E NETWORK	","	Primary	","	2	"));
		objects.add(new CampaignOwnerCount("	THE DISNEY INTERACTIVE MEDIA GROUP	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	CBS CORPORATION	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	AOL ADVERTISING INC.	","	Primary	","	3	"));
		objects.add(new CampaignOwnerCount("	PEPSI-COLA COMPANY	","	Primary	","	2	"));
		objects.add(new CampaignOwnerCount("	WEATHER UNDERGROUND, INC.	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	GLAM MEDIA, INC.	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	SONY PICTURES TELEVISION, INC.	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	ABC INC.	","	Primary	","	5	"));
		objects.add(new CampaignOwnerCount("	ADAP.TV	","	Primary	","	4	"));
		objects.add(new CampaignOwnerCount("	MICROSOFT CORPORATION	","	Primary	","	3	"));
		objects.add(new CampaignOwnerCount("	CABLE NEWS NETWORK	","	Secondary	","	15	"));
		objects.add(new CampaignOwnerCount("	XO GROUP, INC.	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	NESTLE NUTRITION	","	Primary	","	7	"));
		objects.add(new CampaignOwnerCount("	OMD USA, INC.	","	Secondary	","	2	"));
		objects.add(new CampaignOwnerCount("	SCRIPPS NETWORK, LLC	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	CONDE NAST PUBLICATIONS, INC.	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	STARCOM WORLDWIDE	","	Secondary	","	9	"));
		objects.add(new CampaignOwnerCount("	UNIVERSAL MCCANN	","	Primary	","	24	"));
		objects.add(new CampaignOwnerCount("	OMNICOM MEDIA GROUP HOLDING INC.	","	Secondary	","	9	"));
		objects.add(new CampaignOwnerCount("	CVS CAREMARK	","	Primary	","	5	"));
		objects.add(new CampaignOwnerCount("	COCA-COLA COMPANY	","	Primary	","	4	"));
		objects.add(new CampaignOwnerCount("	AT&T MOBILITY LLC.	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	STARCOM WORLDWIDE	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	BIZJOURNALS.COM	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	ABC FAMILY CHANNEL	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	BRANDNET	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	ANHEUSER-BUSCH COMPANIES, INC.	","	Primary	","	8	"));
		objects.add(new CampaignOwnerCount("	JOHNSON & JOHNSON SERVICES, INC.	","	Secondary	","	21	"));
		objects.add(new CampaignOwnerCount("	AMERICA ON LINE	","	Secondary	","	6	"));
		objects.add(new CampaignOwnerCount("	TIME, INC.	","	Secondary	","	15	"));
		objects.add(new CampaignOwnerCount("	NBC UNIVERSAL	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	READER'S DIGEST ASSOCIATION, INC.	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	AOL ADVERTISING INC.	","	Secondary	","	3	"));
		objects.add(new CampaignOwnerCount("	WEATHER CHANNEL, INC.	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	NESTLE PURINA PETCARE COMPANY	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	VIBRANT MEDIA	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	UNILEVER NV	","	Secondary	","	45	"));
		objects.add(new CampaignOwnerCount("	GENERAL MOTORS	","	Primary	","	3	"));
		objects.add(new CampaignOwnerCount("	KIMBERLY-CLARK CORPORATION	","	Primary	","	3	"));
		objects.add(new CampaignOwnerCount("	TRIBUNE BROADCASTING, CO.	","	Primary	","	4	"));
		objects.add(new CampaignOwnerCount("	ABC FAMILY CHANNEL	","	Primary	","	3	"));
		objects.add(new CampaignOwnerCount("	GM PLANWORKS	","	Secondary	","	3	"));
		objects.add(new CampaignOwnerCount("	ESPN, INC.	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	THESTREET.COM	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	GLAM MEDIA, INC.	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	MINDSHARE USA, A DIVISION OF GROUP M WOR	","	Secondary	","	5	"));
		objects.add(new CampaignOwnerCount("	UNILEVER	","	Primary	","	45	"));
		objects.add(new CampaignOwnerCount("	MTV NETWORKS - MTV	","	Secondary	","	8	"));
		objects.add(new CampaignOwnerCount("	FOX NEWS CHANNEL	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	CITIBANK	","	Primary	","	4	"));
		objects.add(new CampaignOwnerCount("	MEREDITH CORPORATION	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	BUZZ MEDIA, INC.	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	NEW YORK TIMES COMPANY	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	BREAK MEDIA	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	COMCAST CAPITAL CORPORATION	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	MEDIAEDGE:CIA	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	SPARK COMMUNICATIONS	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	FACEBOOK, INC.	","	Secondary	","	23	"));
		objects.add(new CampaignOwnerCount("	ABC INC.	","	Secondary	","	8	"));
		objects.add(new CampaignOwnerCount("	MTV NETWORKS - MTV	","	Primary	","	9	"));
		objects.add(new CampaignOwnerCount("	WARNER BROTHERS	","	Primary	","	11	"));
		objects.add(new CampaignOwnerCount("	TUBE MOGUL	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	WEATHER UNDERGROUND, INC.	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	TRIAD DIGITAL MEDIA	","	Primary	","	2	"));
		objects.add(new CampaignOwnerCount("	RAZORFISH, INC.	","	Secondary	","	6	"));
		objects.add(new CampaignOwnerCount("	THE CW NETWORK	","	Secondary	","	3	"));
		objects.add(new CampaignOwnerCount("	WIEDEN & KENNEDY, INC.	","	Secondary	","	3	"));
		objects.add(new CampaignOwnerCount("	DISCOVERY COMMUNICATIONS, LLC.	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	NIELSEN MEDIA RESEARCH	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	FACEBOOK, INC.	","	Primary	","	142	"));
		objects.add(new CampaignOwnerCount("	SOCIALVIBE	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	YAHOO, INC.	","	Primary	","	16	"));
		objects.add(new CampaignOwnerCount("	BRIGHTROLL, INC.	","	Secondary	","	2	"));
		objects.add(new CampaignOwnerCount("	RODALE, INC.	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	ELECTRONICS ARTS INC.	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	BLOGHER	","	Primary	","	1	"));
		objects.add(new CampaignOwnerCount("	VALUECLICK, INC.	","	Secondary	","	1	"));
		objects.add(new CampaignOwnerCount("	BONNIER CORPORATION	","	Primary	","	2	"));
		objects.add(new CampaignOwnerCount("	THE WASHINGTON POST	","	Secondary	","	1	"));
		
		for (int i=0;i<objects.size();i++) {
			addView(new MyTableRowLayout(context,objects.get(i)));
		}
	}
	
	@Override
	public View getChildAt(int index) {
		// TODO Auto-generated method stub
		return new MyTableRowLayout(context,objects.get(index));
	}
	

}
