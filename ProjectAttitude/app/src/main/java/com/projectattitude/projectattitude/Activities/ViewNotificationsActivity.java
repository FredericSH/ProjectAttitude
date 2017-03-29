package com.projectattitude.projectattitude.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.projectattitude.projectattitude.Adapters.RequestAdapter;
import com.projectattitude.projectattitude.Controllers.ElasticSearchRequestController;
import com.projectattitude.projectattitude.Objects.FollowRequest;
import com.projectattitude.projectattitude.Objects.User;
import com.projectattitude.projectattitude.R;

import java.io.IOException;
import java.util.ArrayList;

/**
 * This activity will handle the viewing and handling of notifications
 * such as follow requests
 */
public class ViewNotificationsActivity extends AppCompatActivity {

    //I created a notification_item.xml to handle notifications
    //On second thought we could use toast pop ups to handle instead of buttons


    private ArrayList<FollowRequest> requests = new ArrayList<FollowRequest>();
    private ListView requestList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_notifications);

        //requests = new ArrayList<FollowRequest>();
        requestList = (ListView)findViewById(R.id.notification_list);
        requests = new ArrayList<FollowRequest>();
        ArrayAdapter<FollowRequest> adapter = new ArrayAdapter<FollowRequest>(this, R.layout.notification_item, requests);
        requests.add(new FollowRequest("vusdfk", "henrsdfy"));
        requests.add(new FollowRequest("vasuk", "henrsasay"));
        requestList.setAdapter(adapter);

        //RequestAdapter adapter = new RequestAdapter(this, requests);
        //adapter.add(new FollowRequest("vuk", "henry"));
        //ArrayAdapter<FollowRequest> adapter = new ArrayAdapter<FollowRequest>(this, R.layout.notification_item, requests);
        //requests.add(new FollowRequest("vuk", "henry"));
        //requestList.setAdapter(adapter);

//        User user = (User)getIntent().getSerializableExtra("user");
//
//        //Obtain follow requests that pertain to current user
//        try{
//            ElasticSearchRequestController.GetRequestsTask getRequestsTask = new ElasticSearchRequestController.GetRequestsTask();
//            getRequestsTask.execute(user.getUserName());//Input user's ID as filter
//            //requests.add(new FollowRequest("vuk", "henry"));
//            requests.addAll(getRequestsTask.get());
//        }
//        catch(Exception e){
//            Log.d("Error", "Failed to obtain request list");
//        }
//
//        if(requests.size() == 0){
//            Toast.makeText(ViewNotificationsActivity.this, "No pending requests.",
//                    Toast.LENGTH_LONG).show();
//        }

        //adapter.notifyDataSetChanged();

    }

}
