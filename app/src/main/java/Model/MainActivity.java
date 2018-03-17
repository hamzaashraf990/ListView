package Model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import Adapter.UserAdapter;
import project.sialkot.listview.R;

public class MainActivity extends AppCompatActivity {
    ListView mLv;
    UserAdapter oUserAapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }

    private void Init() {
        mLv=(ListView)findViewById(R.id.listview);
        User ouser1=new User();
         ouser1.setWeather("Summer");
         ouser1.setCondition("Sunny");
         ouser1.setDrawableimage(R.drawable.Summer);
        User ouser2=new User();
            ouser2.setWeather("Winter");
            ouser2.setCondition("Cold");
            ouser2.setDrawableimage(R.drawable.Winter);
        User ouser3=new User();
           ouser3.setWeather("Autumn");
           ouser3.setCondition("Sad");
           ouser3.setDrawableimage(R.drawable.Autumn);
        User ouser4=new User();
                 ouser4.setWeather("Spring");
              ouser4.setCondition("Hope");
              ouser4.setDrawableimage(R.drawable.Spring);

        ArrayList<User> oListUsers=new ArrayList<User>();
        oListUsers.add(ouser1);
        oListUsers.add(ouser2);
        oListUsers.add(ouser3);
        oListUsers.add(ouser4);

        oUserAapter=new UserAdapter(getApplicationContext(),oListUsers);
        mLv.setAdapter(oUserAapter);
    }
}
