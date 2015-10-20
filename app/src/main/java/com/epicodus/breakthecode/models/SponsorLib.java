package com.epicodus.breakthecode.models;

import com.epicodus.breakthecode.R;

import java.util.ArrayList;

/**
 * Created by Guest on 10/20/15.
 */
public class SponsorLib {
    private ArrayList<Sponsor> mSponsors;

    public SponsorLib() {setSponsors();}
    public ArrayList<Sponsor> getSponsors() {
        return mSponsors;
    }

    public void setSponsors() {

        mSponsors =  new ArrayList<Sponsor>();
        mSponsors.add(new Sponsor(
            "CrowdCompass",
            "CrowdCompass by Cvent creates awesome mobile event apps that increase attendee engagement and produce a strong return on investment. \n\nCrowdCompass' solution is an integrated component of Cvent's event management platform - the most comprehensive in the industry.",
            "http://www.crowdcompass.com/",
            R.drawable.crowdcompass

        ));

        mSponsors.add(new Sponsor(
            "Globe Sherpa",
            "Started in 2010, GlobeSherpa provides a secure, mobile ticketing platform for transit systems interested in moving to open payments, open data, and mobile fare collection with minimal infrastructure investment. GlobeSherpa is using that same technology to create easy-to-use mobile ticketing systems for parking, events, and local destinations",
            "http://www.globesherpa.com/",
            R.drawable.globesherpa

        ));

        mSponsors.add(new Sponsor(
            "Jive",
            "Inside companies, Jive-powered enterprise networks dramatically improve employee productivity, alignment and innovation. Externally, Jive supports vibrant customer and partner communities that drive higher sales, better service and greater satisfaction. Millions of users and many of the world’s most successful companies rely on Jive day in and day out to get work done, delight their customers and stay ahead of their competitors.",
            "https://www.jivesoftware.com/",
            R.drawable.jive

        ));
    }

    public Sponsor nextSponsor(Sponsor currentSponsor) {
        int index = mSponsors.indexOf(currentSponsor);
        if (index == mSponsors.size() -1){
            return mSponsors.get(0);
        } else {
            return mSponsors.get(index +1 );
        }
    }
}
