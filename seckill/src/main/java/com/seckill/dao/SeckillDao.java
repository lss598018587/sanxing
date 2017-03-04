package com.seckill.dao;

import com.seckill.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author wangmiao on 2017/2/18.
 * @create 2017 - 02 - 18 上午1:10
 */

public interface SeckillDao {
    /**
     * @Author:WangMiao
     * @version:淘途V2
     * Description: 减库存
     * @Date 上午1:11 2017/2/18
     */
    int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);

    /*
        根据id查询秒杀对象
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}
