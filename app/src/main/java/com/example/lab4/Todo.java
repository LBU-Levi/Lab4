package com.example.lab4;

import java.util.Date;
import java.util.UUID;


public class Todo {
    private UUID mId;
    private String mTitle;
    private String mDetail;
    private Date mDate;
    private boolean mIsComplete;

    public Todo() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId()
    {
        return mId;
    }

    public void setTitle(String title)
    {
        mTitle = title;
    }

    public void setDetail(String detail)
    {
        mDetail = detail;
    }

    public void setComplete(boolean bIsComplete)
    {
        mIsComplete = bIsComplete;
    }
}
