package cn.tedu.store.bean;

import java.io.Serializable;

public class City implements Serializable {
    private static final long serialVersionUID = 2003124827880058815L;

    private int id;
    private String provinceCode;
    private String cityCode;
    private String cityName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City city = (City) o;

        if (id != city.id) return false;
        if (provinceCode != null ? !provinceCode.equals(city.provinceCode) : city.provinceCode != null)
            return false;
        if (cityCode != null ? !cityCode.equals(city.cityCode) : city.cityCode != null)
            return false;
        return cityName != null ? cityName.equals(city.cityName) : city.cityName == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (provinceCode != null ? provinceCode.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", provinceCode='" + provinceCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
