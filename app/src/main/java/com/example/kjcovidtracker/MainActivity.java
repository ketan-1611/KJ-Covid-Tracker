package com.example.kjcovidtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.DownloadManager;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.kjcovidtracker.databinding.ActivityMainBinding;
import com.example.kjcovidtracker.databinding.TestingBinding;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<StateModel>list;
    StateAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list = new ArrayList<>();
        adapter = new StateAdapter(this,list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.stateRV.setLayoutManager(layoutManager);
        binding.stateRV.setAdapter(adapter);

        getStateInfo();


    }

    private void getStateInfo()
    {
        String url = "https://data.covid19india.org/state_district_wise.json";

        RequestQueue queue = Volley.newRequestQueue(this);

        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {

                    JSONObject object = new JSONObject(response);

                    // From that object we are fetching data
                    JSONObject state = object.getJSONObject("Rajasthan");
                    JSONObject district = state.getJSONObject("districtData");
                    JSONObject city = district.getJSONObject("Jaipur");
                    JSONObject delta = city.getJSONObject("delta");


                    String active = city.getString("active");
                    String confirmed = city.getString("confirmed");
                    String deceased = city.getString("deceased");
                    String recovered = city.getString("recovered");

                    String delConfirmed = delta.getString("confirmed");
                    String deldecesed = delta.getString("deceased");
                    String delrecovered = delta.getString("recovered");

                    list.add(new StateModel("Jaipur",active,confirmed,deceased,recovered,delConfirmed,deldecesed,delrecovered));
                    adapter.notifyDataSetChanged();

                    city = district.getJSONObject("Jodhpur");
                     delta = city.getJSONObject("delta");

                     active = city.getString("active");
                     confirmed = city.getString("confirmed");
                     deceased = city.getString("deceased");
                     recovered = city.getString("recovered");

                     delConfirmed = delta.getString("confirmed");
                     deldecesed = delta.getString("deceased");
                     delrecovered = delta.getString("recovered");


                    list.add(new StateModel("Jodhpur",active,confirmed,deceased,recovered,delConfirmed,deldecesed,delrecovered));
                    adapter.notifyDataSetChanged();


                    city = district.getJSONObject("Ajmer");
                    delta = city.getJSONObject("delta");

                    active = city.getString("active");
                    confirmed = city.getString("confirmed");
                    deceased = city.getString("deceased");
                    recovered = city.getString("recovered");

                    delConfirmed = delta.getString("confirmed");
                    deldecesed = delta.getString("deceased");
                    delrecovered = delta.getString("recovered");


                    list.add(new StateModel("Ajmer",active,confirmed,deceased,recovered,delConfirmed,deldecesed,delrecovered));
                    adapter.notifyDataSetChanged();


                    city = district.getJSONObject("Kota");
                    delta = city.getJSONObject("delta");

                    active = city.getString("active");
                    confirmed = city.getString("confirmed");
                    deceased = city.getString("deceased");
                    recovered = city.getString("recovered");

                    delConfirmed = delta.getString("confirmed");
                    deldecesed = delta.getString("deceased");
                    delrecovered = delta.getString("recovered");


                    list.add(new StateModel("Kota",active,confirmed,deceased,recovered,delConfirmed,deldecesed,delrecovered));
                    adapter.notifyDataSetChanged();


                    city = district.getJSONObject("Udaipur");
                    delta = city.getJSONObject("delta");

                    active = city.getString("active");
                    confirmed = city.getString("confirmed");
                    deceased = city.getString("deceased");
                    recovered = city.getString("recovered");

                    delConfirmed = delta.getString("confirmed");
                    deldecesed = delta.getString("deceased");
                    delrecovered = delta.getString("recovered");


                    list.add(new StateModel("Udaipur",active,confirmed,deceased,recovered,delConfirmed,deldecesed,delrecovered));
                    adapter.notifyDataSetChanged();


                    city = district.getJSONObject("Alwar");
                    delta = city.getJSONObject("delta");

                    active = city.getString("active");
                    confirmed = city.getString("confirmed");
                    deceased = city.getString("deceased");
                    recovered = city.getString("recovered");

                    delConfirmed = delta.getString("confirmed");
                    deldecesed = delta.getString("deceased");
                    delrecovered = delta.getString("recovered");


                    list.add(new StateModel("Alwar",active,confirmed,deceased,recovered,delConfirmed,deldecesed,delrecovered));
                    adapter.notifyDataSetChanged();


                    city = district.getJSONObject("Dausa");
                    delta = city.getJSONObject("delta");

                    active = city.getString("active");
                    confirmed = city.getString("confirmed");
                    deceased = city.getString("deceased");
                    recovered = city.getString("recovered");

                    delConfirmed = delta.getString("confirmed");
                    deldecesed = delta.getString("deceased");
                    delrecovered = delta.getString("recovered");


                    list.add(new StateModel("Dausa",active,confirmed,deceased,recovered,delConfirmed,deldecesed,delrecovered));
                    adapter.notifyDataSetChanged();


                    city = district.getJSONObject("Bharatpur");
                    delta = city.getJSONObject("delta");

                    active = city.getString("active");
                    confirmed = city.getString("confirmed");
                    deceased = city.getString("deceased");
                    recovered = city.getString("recovered");

                    delConfirmed = delta.getString("confirmed");
                    deldecesed = delta.getString("deceased");
                    delrecovered = delta.getString("recovered");


                    list.add(new StateModel("Bharatpur",active,confirmed,deceased,recovered,delConfirmed,deldecesed,delrecovered));
                    adapter.notifyDataSetChanged();


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this,error.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });

        queue.add(request);
    }


}