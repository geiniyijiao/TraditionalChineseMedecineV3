package main.java.bean;

public class MeType {
    private Integer mTypeId;

    private String mTypeName;

    public Integer getmTypeId() {
        return mTypeId;
    }

    public void setmTypeId(Integer mTypeId) {
        this.mTypeId = mTypeId;
    }

    public String getmTypeName() {
        return mTypeName;
    }

    public void setmTypeName(String mTypeName) {
        this.mTypeName = mTypeName == null ? null : mTypeName.trim();
    }
}