package pvt.hrk.and;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
 
public class ScrollingTable extends LinearLayout {
	
	private String [] headers;
	private List<String> data;
    public ScrollingTable( Context context )
    {
        super( context );
    }
 
    public ScrollingTable( Context context, AttributeSet attrs )
    {
        super( context, attrs );
    }
    
    public void commaSeparatedOrderedHeaders (String header){
    	StringTokenizer headerTokens = new StringTokenizer(header, "|");
    	this.headers = new String [headerTokens.countTokens()];
    	int i=0;
    	while (headerTokens.hasMoreTokens()){
    		headers[i++] = headerTokens.nextToken().trim();
    	}
    	
    }
    
    public void listCommaSeparatedData (List<String> data){
    	this.data = data;
    }
    
    @Override
    protected void onLayout( boolean changed, int l, int t, int r, int b )
    {
        super.onLayout( changed, l, t, r, b );
        List<Integer> colWidths = new ArrayList<Integer>();
        TableLayout header = (TableLayout) findViewById( R.id.HeaderTable );
        TableLayout body = (TableLayout) findViewById( R.id.BodyTable );
    	LayoutInflater inflater = (LayoutInflater)getContext().getSystemService
  		      (Context.LAYOUT_INFLATER_SERVICE);
    		TableLayout.LayoutParams tableLp = new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT,TableLayout.LayoutParams.WRAP_CONTENT);
    		TableRow.LayoutParams rowLp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,TableRow.LayoutParams.WRAP_CONTENT);
    		
    		 //TableRow samplerow = (TableRow) body.getChildAt(0);
    		 //View samplecell = samplerow.getChildAt(0);
    		 //TableLayout.LayoutParams tableLp  = (TableLayout.LayoutParams)samplerow.getLayoutParams();
    		 //TableRow.LayoutParams rowLp = (TableRow.LayoutParams)samplecell.getLayoutParams();
    	  for ( int rownum = 0; rownum < data.size(); rownum++ )
          {
              TableRow row = (TableRow) inflater.inflate(R.layout.data_row_template, null);
              row.setLayoutParams(tableLp);
              body.addView(row);
              
              StringTokenizer st = new StringTokenizer(data.get(rownum),"|");
              String [] datarow = new String [st.countTokens()];
              int i=0;
              while (st.hasMoreTokens()){
              	datarow [i++] = st.nextToken().trim();
              }
              //datarow.length
              for ( int cellnum = 0; cellnum < headers.length; cellnum++ )
              {
                  TextView cell = (TextView)inflater.inflate(R.layout.text_template, null);
                  cell.setText(datarow[cellnum]);
                  cell.setLayoutParams(rowLp);
//                  Integer cellWidth = datarow[cellnum].length();//cell.getWidth();
//                  
//                  if ( colWidths.size() <= cellnum )
//                  {
//                      colWidths.add( cellWidth );
//                  }
//                  else
//                  {
//                      Integer current = colWidths.get( cellnum );
//                      if( cellWidth > current )
//                      {
//                          colWidths.remove( cellnum );
//                          colWidths.add( cellnum, cellWidth );
//                      }
//                  }
                  row.addView(cell);
              }
         }
    	  body.invalidate();
    	   for ( int rownum = 0; rownum < body.getChildCount(); rownum++ )
           {
               TableRow row = (TableRow) body.getChildAt( rownum );
               for ( int cellnum = 0; cellnum < row.getChildCount(); cellnum++ )
               {
                   View cell = row.getChildAt( cellnum );
                   Integer cellWidth = cell.getWidth();
                   if ( colWidths.size() <= cellnum )
                   {
                       colWidths.add( cellWidth );
                   }
                   else
                   {
                       Integer current = colWidths.get( cellnum );
                       if( cellWidth > current )
                       {
                           colWidths.remove( cellnum );
                           colWidths.add( cellnum, cellWidth );
                       }
                   }
               }
           }

    	   /* TableRow headerrow = (TableRow)inflater.inflate(R.layout.header_row_template, null);
           header.addView(headerrow);
     	  headerrow.setLayoutParams(tableLp);*/
    	   
      /*     TableRow headerrow = (TableRow)header.getChildAt(0);
            for ( int cellnum = 0; cellnum < headers.length; cellnum++ )
            {
            	Button but = (Button) inflater.inflate(R.layout.button_template, null);
                but.setText(headers[cellnum]);
                TableRow.LayoutParams params = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,TableRow.LayoutParams.WRAP_CONTENT);
                int width = colWidths.get( cellnum );
                params.width = width;
                but.setLayoutParams(params);
                headerrow.addView(but);
            }*/
    }
}
