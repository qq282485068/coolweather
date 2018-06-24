package coolweather.isaiah.com.coolweather.db;

import org.litepal.crud.DataSupport;

public class Province  extends DataSupport{

    private Integer id;

    private String provinceName;

    private Integer proviceCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(Integer proviceCode) {
        this.proviceCode = proviceCode;
    }
}
