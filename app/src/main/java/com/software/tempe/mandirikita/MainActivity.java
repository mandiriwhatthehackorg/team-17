package com.software.tempe.mandirikita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.software.tempe.mandirikita.adapter.RecommendationAdapter;
import com.software.tempe.mandirikita.model.JWTServicing;
import com.software.tempe.mandirikita.service.ServicingAPI;
import com.software.tempe.mandirikita.service.ServicingClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    // private TextView testing;

    public static String app_id = "9f85353b-aa26-4d8e-86c8-9b148b499549";
    public static String auth_servicing = "Basic " + Base64.encodeToString(("4cea0262-7060-4842-8fa7-66163e7a67cf:a6fa6f72-31a1-4feb-b697-45db177ae94e").getBytes(), Base64.NO_WRAP);

    public static String jwt_token;

    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> price = new ArrayList<>();
    private ArrayList<String> image_link = new ArrayList<>();

    private RecyclerView recycler_view;
    private RecommendationAdapter adapter;

    public static boolean splash = false;

    private ImageView familycard_btn;

    private ImageView cardCCImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!splash)    {
            Intent intent = new Intent(MainActivity.this, SplashActivity.class);
            finish();
            startActivity(intent);
        }

        // testing = findViewById(R.id.test);

        familycard_btn = findViewById(R.id.familycard_btn);
        cardCCImg = findViewById(R.id.card_imageCC);

        cardCCImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreditCardDetail.class);
                startActivity(intent);
            }
        });

        getTokenServicing(app_id);

        populateDataRecommendation();

        recycler_view = findViewById(R.id.reward_card);
        adapter = new RecommendationAdapter(name, price, image_link, MainActivity.this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recycler_view.setLayoutManager(layoutManager);
        recycler_view.setAdapter(adapter);

        familycard_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FamilyCardActivity.class);
                startActivity(intent);
            }
        });


    }

    private void populateDataRecommendation() {
        name.add("Voucher SOGO");
        price.add("Rp 100.000");
        image_link.add("https://i.ibb.co/mqDH9VH/img-vouchermap.png");

        name.add("Voucher SOGO");
        price.add("Rp 100.000");
        image_link.add("https://i.ibb.co/mqDH9VH/img-vouchermap.png");

        name.add("Voucher SOGO");
        price.add("Rp 100.000");
        image_link.add("https://i.ibb.co/mqDH9VH/img-vouchermap.png");

        name.add("Voucher SOGO");
        price.add("Rp 100.000");
        image_link.add("https://i.ibb.co/mqDH9VH/img-vouchermap.png");

        name.add("Voucher SOGO");
        price.add("Rp 100.000");
        image_link.add("https://i.ibb.co/mqDH9VH/img-vouchermap.png");

        name.add("Voucher SOGO");
        price.add("Rp 100.000");
        image_link.add("https://i.ibb.co/mqDH9VH/img-vouchermap.png");
    }

    private void getTokenServicing(String app_id) {
        ServicingAPI servicingAPI = ServicingClient.getServicingJWT().create(ServicingAPI.class);

        Call<JWTServicing> jwtServicingCall = null;

        if (app_id.length() > 0)    {
            jwtServicingCall = servicingAPI.getJWTServicing(app_id, auth_servicing, "application/json");
        }

        jwtServicingCall.enqueue(new Callback<JWTServicing>() {
            @Override
            public void onResponse(Call<JWTServicing> call, Response<JWTServicing> response) {
                if (!response.isSuccessful())   {
                    Toast.makeText(MainActivity.this, "message: " + response.code(), Toast.LENGTH_LONG).show();
                }

                if (response.body() != null)    {
                    jwt_token = response.body().getJwt();
                }
            }

            @Override
            public void onFailure(Call<JWTServicing> call, Throwable t) {
                Toast.makeText(MainActivity.this, "message: " + t.getMessage(), Toast.LENGTH_LONG).show();
                Log.e("Err: ", "onFailure: " + t.getMessage());
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
