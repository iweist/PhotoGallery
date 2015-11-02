package criminalintent.android.bignerdranch.com.criminalintent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import criminalintent.database.CrimeBaseHelper;

/**
 * Created by owner on 10/8/2015.
 */
public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private  Context mContext;
    private  SQLiteDatabase mDatabase;

    public static CrimeLab get(Context context) {

        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        } return sCrimeLab;
    }

    private CrimeLab(Context context) {

        mContext = context.getApplicationContext();
        mDatabase = new CrimeBaseHelper(mContext) .getWritableDatabase();
    }

    public void addCrime(Crime c) { }

    public List<Crime> getCrimes() {
        return new ArrayList<>();
    }

    public Crime getCrime(UUID id) { return null; }

}
