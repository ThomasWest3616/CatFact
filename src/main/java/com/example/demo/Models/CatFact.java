package com.example.demo.Models;

import java.util.Date;

public class CatFact implements Comparable<CatFact> {
    private String text;
    private Date createdAt;

    public String getText() {
        return text;

    }

    public void setText(String text) {
        this.text = text;

    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreateAt(Date createAt) {
        this.createdAt = createAt;
    }

    @Override
    public int compareTo(CatFact cf) {
        if(this.createdAt.before(cf.createdAt)) {
            return -1;
        }
        if(this.createdAt.after(cf.createdAt)) {
            return -1;
        }
return 0;
    }


}
