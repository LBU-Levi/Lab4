package com.example.todolistapp;

import java.util.Date;
import java.util.UUID;

public class Todo
{
    private UUID mId;
    private String mTitle;
    private String mDetail;
    private Date mDate;
    private boolean mIsComplete;

    public Todo()
    {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId()
    {
        return mId;
    }

    public void setId(UUID id)
    {
        mId = id;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public void setTitle(String title)
    {
        mTitle = title;
    }

    public String getDetail()
    {
        return mDetail;
    }

    public void setDetail(String detail)
    {
        mDetail = detail;
    }

    public Date getDate()
    {
        return mDate;
    }

    public void setDate(Date date)
    {
        mDate = date;
    }

    public boolean isComplete()
    {
        return mIsComplete;
    }

    public void setComplete(boolean complete)
    {
        mIsComplete = complete;
    }
}