package coolweather.isaiah.com.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    private Integer id;

    private String countyName;

    private String weatherId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
