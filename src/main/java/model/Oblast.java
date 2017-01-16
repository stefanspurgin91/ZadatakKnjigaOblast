package model;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by androiddevelopment on 16.1.17..
 */
public class Oblast {

    private int id;
    private String naziv;
    private int pocetnaStrana;

    public static final String POLJE_NAZIV = "naziv";
    public static final String POLJE_POCETNA_STRANA = "pocetna_strana";



}
