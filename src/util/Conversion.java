package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

    public static String convertCountry(String countryShort)
    {

        String convertedCountry = "";

        switch (countryShort)
        {
            case "IN" : convertedCountry = "India";break;
            case "CN" : convertedCountry = "China";break;
            case "BM" : convertedCountry = "Bermuda";break;
            case "ZW" : convertedCountry = "Zimbabwe";break;
            case "UA" : convertedCountry = "Ukraine";break;
        }

        return convertedCountry;

    }

    public static String genderConversion(String genderID)
    {
        String convertedGender="";

        switch (genderID)
        {
            case "0" : convertedGender="Male"; break;
            case "1" : convertedGender="Female"; break;
            case "2" : convertedGender="Other"; break;
        }

        return convertedGender;
    }


    public static String convertDate(String dateDB) throws ParseException // 1992-12-10 --> yyyy-MM-dd | MM/dd/yyyy
    {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateDB);

       return new SimpleDateFormat("MM/dd/yyyy").format(date);
    }

}
