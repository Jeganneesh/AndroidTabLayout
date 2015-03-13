package com.example.androidtablayout;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
 
public class SongsActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
        // storing string resources into Array
        String[] adobe_products = getResources().getStringArray(R.array.adobe_products);
         
        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.songs_layout, R.id.label, adobe_products));
         
        ListView lv = getListView();
 
        // listening to single list item on click
        lv.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
        	  final String name     = "US News Nearby Hospitals";
        	  final String name1 = "Best San Jose Hospitals";
              // selected item 
              String product = ((TextView) view).getText().toString();
              if(product.equals(name))
            
              {
               
              // Launching new Activity on selecting single List Item
              Intent intent = new Intent(Intent.ACTION_VIEW, 
     			     Uri.parse("http://health.usnews.com/best-hospitals/search?city=95112&distance=25"));
     			startActivity(intent);
              
              }
              else if(product.equals(name1))
              {Intent intent1 = new Intent(Intent.ACTION_VIEW, 
      			     Uri.parse("http://health.usnews.com/best-hospitals/area/san-jose-ca"));
      			startActivity(intent1);
               
               }
              else 
              {
              {Intent intent2 = new Intent(Intent.ACTION_VIEW, 
      			     Uri.parse("http://www.yelp.com/search?cflt=hospitals&find_loc=San+Jose%2C+CA"));
      			startActivity(intent2);
              
               }
             
              }
             
          }
        });
    }
}