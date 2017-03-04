package com.seckill.service;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.entity.Seckill;
import com.seckill.exception.RepeatKillException;
import com.seckill.exception.SeckillCloseException;
import com.seckill.exception.SeckillException;

import java.util.List;

/**
 * @author wangmiao on 2017/2/19.
 * @create 2017 - 02 - 19 下午6:26
 */

public interface SeckillService {
    List<Seckill> querySeckillList();
    int m=0;
    Seckill queryById(long SeckillId);

    /**
     * 秒杀开启输出秒杀接口地址
     * 否则输出系统时间和秒杀时间
     * @param seckillId
     * @return
     */
    Exposer  exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SeckillException,SeckillCloseException,RepeatKillException;
}
