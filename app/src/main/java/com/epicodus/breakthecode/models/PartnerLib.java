package com.epicodus.breakthecode.models;
import com.epicodus.breakthecode.R;

import java.util.ArrayList;

/**
 * Created by Guest on 10/19/15.
 */
public class PartnerLib {
    private ArrayList<Partner> mPartners;

    public PartnerLib() {
        setNonProfitPartners();
    }

    public void setNonProfitPartners() {
        mPartners = new ArrayList<>();

        mPartners.add(new Partner(
            "App Camp for Girls",
            "App Camp For Girls is a place where girls can put their creative powers to work, designing and building apps, while learning more about the business of software and being inspired by women mentors in the field. ",
            "http://appcamp4girls.com/",
            R.drawable.appcamp
        ));

        mPartners.add(new Partner(
                "ChickTech",
                "ChickTech is dedicated to retaining women in the technology workforce and increasing the number of women and girls pursuing technology-based careers",
                "http://chicktech.org/",
                R.drawable.chicktech
        ));

        mPartners.add(new Partner(
                "Girl Develop It",
                "Girl Develop It is a nonprofit organization that provides affordable programs for adult women interested in learning web and software development in a judgment-free environment.",
                "https://www.girldevelopit.com/",
                R.drawable.girldevit
        ));
    }

    public ArrayList<Partner> getPartners() {
        return mPartners;
    }
}
