package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by androiddevelopment on 16.1.17..
 */
@DatabaseTable(tableName="knjiga")
public class Knjiga {

    private int id;
    private String naslov;
    private int brojStrana;
    java.util.Date datumIzdanja;
    private boolean prisutna;

    public static final String POLJE_NASLOV = "naslov";
    public static final String POLJE_BROJ_STRANA = "broj_strana";
    public static final String POLJE_DATUM_IZDAVANJA = "datum_izdavanja";

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = POLJE_NASLOV,canBeNull = false, unique=false)
    private String naslov;
    @DatabaseField(columnName = POLJE_BROJ_STRANA)
    private String broj_strana;
    @DatabaseField(columnName = POLJE_DATUM_IZDAVANJA,canBeNull = false)
    private double datum_izdavanja;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private Knjiga knjiga;

    @ForeignCollectionField(foreignFieldName = "knjiga")
    private ForeignCollection<Oblast> oblastForeignCollection;

    public Knjiganjiga() {
    }

    public Knjiga(String naslov, int brojStrana, int datumIzdanja, boolean prisutna) {
        this.naslov = naslov;
        this.brojStrana = brojStrana;
        this.datumIzdanja = datumIzdanja;
        this.prisutna = true;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


        public String getnaslov() {
            return naslov;
        }

        public void setnaslov(String naslov) {
            this.naslov = naslov;
        }

        public String getdatumIzdanja() {
            return datumIzdanja;
        }

        public void setdatumIzdanja(String opis) {
            this.datumIzdanja = datumIzdanja;
        }

    public boolean getprisutna() {

        public void setprisutna(prisutna){
        }
    }
}

}