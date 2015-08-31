
package com.lkb0398nate.listviewexam;

/**
 * Created by kb on 2015-08-31. 사람클래스
 */
public class People {
    private String name;
    private String phonenumber;
    private int imageResoutceId;

    public People(int imageResoutceId, String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.imageResoutceId = imageResoutceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getImageResoutceId() {
        return imageResoutceId;
    }

    public void setImageResoutceId(int imageResoutceId) {
        this.imageResoutceId = imageResoutceId;
    }
}

