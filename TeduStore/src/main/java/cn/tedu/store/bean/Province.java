package cn.tedu.store.bean;

import java.io.Serializable;

public class Province implements Serializable {
    private static final long serialVersionUID = -1707412937601390298L;
    private Integer id;
    private String provinceCode;
    private String provinceName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Province)) return false;

        Province province = (Province) o;

        if (id != null ? !id.equals(province.id) : province.id != null) return false;
        if (provinceCode != null ? !provinceCode.equals(province.provinceCode) : province
                .provinceCode != null)
            return false;
        return provinceName != null ? provinceName.equals(province.provinceName) : province
                .provinceName == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (provinceCode != null ? provinceCode.hashCode() : 0);
        result = 31 * result + (provinceName != null ? provinceName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", provinceCode='" + provinceCode + '\'' +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }
}
