package com.epicodus.breakthecode.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.breakthecode.R;
import com.epicodus.breakthecode.models.Sponsor;
import com.epicodus.breakthecode.models.SponsorLib;

public class SponsorsActivity extends AppCompatActivity {
    private TextView mNameLabel, mDescriptionLabel;
    private ImageView mSponsorImage;
    private Button mNextButton;

    private SponsorLib mSponsorLib;
    private Sponsor mCurrentSponsor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
        mNameLabel = (TextView) findViewById(R.id.nameLabel);
        mDescriptionLabel = (TextView) findViewById(R.id.description);
        mSponsorImage = (ImageView) findViewById(R.id.sponsorImage);
        mNextButton = (Button) findViewById(R.id.nextButton);
        mSponsorLib = new SponsorLib();
        mCurrentSponsor = mSponsorLib.getSponsors().get(0);
        setLayoutContent();

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentSponsor = mSponsorLib.nextSponsor(mCurrentSponsor);
                setLayoutContent();
            }
        });

    }

    private void setLayoutContent(){
        mNameLabel.setText(mCurrentSponsor.getName());
        mDescriptionLabel.setText(mCurrentSponsor.getDescription());
        mSponsorImage.setImageResource(mCurrentSponsor.getImage());
    }

}
