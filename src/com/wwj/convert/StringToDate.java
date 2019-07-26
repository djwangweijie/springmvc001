package com.wwj.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDate  implements Converter<String,Date>{

	@Override
	public Date convert(String arg0) {
		// TODO Auto-generated method stub
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = simpleDateFormat.parse(arg0);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
		return null;
	}

}
