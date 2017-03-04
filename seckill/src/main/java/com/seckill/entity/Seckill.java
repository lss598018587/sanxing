package com.seckill.entity;

import java.util.Date;

/**
 * @author wangmiao on 2017/2/18.
 * @create 2017 - 02 - 18 上午1:05
 */

public class Seckill {
    private  long seckillId;
    private String name;
    private Date startTime;
    private Date endTime;
    private int number;
    private Date createTime;

    public long getSeckillId() {
        return seckillId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getNumber() {
        return number;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public String getName() {
        return name;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", number=" + number +
                ", createTime=" + createTime +
                '}';
    }
}
