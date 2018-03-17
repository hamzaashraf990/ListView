package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import Model.User;
import project.sialkot.listview.R;

/**
 * Created by hamza on 3/17/2018.
 */

public class UserAdapter extends ArrayAdapter<User> {


    public ArrayList<User> getOuser() {
        return OListuser;
    }

    public void setOuser(ArrayList<User> ouser) {
        OListuser = ouser;
    }

    public LayoutInflater getOLayoutInflater() {
        return OLayoutInflater;
    }

    public void setOLayoutInflater(LayoutInflater OLayoutInflater) {
        this.OLayoutInflater = OLayoutInflater;
    }

    ArrayList<User> OListuser;
    LayoutInflater OLayoutInflater;

    public UserAdapter(@NonNull Context context, ArrayList<User> OuserList) {
        super(context, 0, OuserList);
        OListuser = OuserList;
        OLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return OListuser.size();
    }

    @Override
    public User getItem(int position) {

        return OListuser.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = OLayoutInflater.inflate(R.layout.weather_list, null);
        TextView weather=(TextView)view.findViewById(R.id.weather1);
        TextView condition=(TextView)view.findViewById(R.id.txtview);
        ImageView UserImgView=(ImageView)view.findViewById(R.id.sunny);
        User ouser=  getItem(position);
        weather.setText(ouser.getWeather());
        condition.setText(ouser.getCondition());
        UserImgView.setImageResource(ouser.getDrawableimage());
        return  view;


    }
}
