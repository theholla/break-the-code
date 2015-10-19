package com.epicodus.breakthecode.ui;

import android.media.Image;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;

import com.epicodus.breakthecode.models.Partner;
import com.epicodus.breakthecode.R;
import com.epicodus.breakthecode.models.PartnerLib;

import org.w3c.dom.Text;

public class NonProfitActivity extends AppCompatActivity {

    private TextView mNameLabel;
    private TextView mDescriptionLabel;
    private ImageView mPartnerImage;
    private Button mNextButton;

    private PartnerLib mPartnerLib;
    private Partner mCurrentPartner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_profit);

        mNameLabel = (TextView) findViewById(R.id.nameLabel);
        mDescriptionLabel = (TextView) findViewById(R.id.descriptionLabel);
        mPartnerImage = (ImageView) findViewById(R.id.partnerImage);
        mNextButton = (Button) findViewById(R.id.nextButton);
        mPartnerLib = new PartnerLib();
        mCurrentPartner = mPartnerLib.getPartners().get(0);
    }

    private void setLayoutContent() {
        mNameLabel.setText(mCurrentPartner.getName());
        mDescriptionLabel.setText(mCurrentPartner.getDescription());
        mPartnerImage.setImageResource(mCurrentPartner.getImage());
    }
}
