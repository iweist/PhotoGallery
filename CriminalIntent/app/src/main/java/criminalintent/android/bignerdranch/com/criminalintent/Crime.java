package criminalintent.android.bignerdranch.com.criminalintent;

import java.util.Date;
import java.util.UUID;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by owner on 10/4/2015.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private Date mTime;
    private String mSuspect;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
        mTime = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }
    public void setDate(Date date) {
        mDate = date;
    }

    public Date getTime() { return mTime;}
    public void setTime(Date time) {mTime = time;}

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getSuspect() { return mSuspect; }
    public void setSuspect(String suspect) { mSuspect = suspect; }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }

}
