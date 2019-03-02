package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper{
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		
	}

	//Province表 建表语句
	public static final String CREATE_PROVINCE = "create table Provice ("
			+ "id intger primary key autoincrement, "
			+ "province_name text, "
			+ "province_code text)";
	
	//City表 建表语句
	public static final String CREATE_CITY = "create table Provice ("
			+ "id intger primary key autoincrement, "
			+ "city_name text, "
			+ "city_code text)";
	
	//Country表 建表语句
	public static final String CREATE_COUNTRY = "create table Provice ("
			+ "id intger primary key autoincrement, "
			+ "country_name text, "
			+ "country_code text)";
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTRY);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db,int oldversion, int newversion){}
}
