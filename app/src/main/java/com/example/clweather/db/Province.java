package com.example.clweather.db;

import org.litepal.crud.DataSupport;

/**
 * 创建时间：2017/7/4.
 * <p>
 * 类备注：省的实体类
 */

public class Province extends DataSupport {
    //    LitePal中的每一个类都必须继承DataSupport类

    private int id;
    private String provinceName;//省的名字
    private int provinceCode;//省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
