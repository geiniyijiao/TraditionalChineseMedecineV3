package main.java.bean;

public class Medecine {
    private Integer mId;

    private String mName;

    private Integer mTypeId;

    private String mTrait;

    private String mUse;

    private String mAffect;

    private String mAttention;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public Integer getmTypeId() {
        return mTypeId;
    }

    public void setmTypeId(Integer mTypeId) {
        this.mTypeId = mTypeId;
    }

    public String getmTrait() {
        return mTrait;
    }

    public void setmTrait(String mTrait) {
        this.mTrait = mTrait == null ? null : mTrait.trim();
    }

    public String getmUse() {
        return mUse;
    }

    public void setmUse(String mUse) {
        this.mUse = mUse == null ? null : mUse.trim();
    }

    public String getmAffect() {
        return mAffect;
    }

    public void setmAffect(String mAffect) {
        this.mAffect = mAffect == null ? null : mAffect.trim();
    }

    public String getmAttention() {
        return mAttention;
    }

    public void setmAttention(String mAttention) {
        this.mAttention = mAttention == null ? null : mAttention.trim();
    }

    @Override
    public String toString() {
        return "Medecine{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mTypeId=" + mTypeId +
                ", mTrait='" + mTrait + '\'' +
                ", mUse='" + mUse + '\'' +
                ", mAffect='" + mAffect + '\'' +
                ", mAttention='" + mAttention + '\'' +
                '}';
    }
}