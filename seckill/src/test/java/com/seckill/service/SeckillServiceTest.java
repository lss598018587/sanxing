package com.seckill.service;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.entity.Seckill;
import com.seckill.exception.RepeatKillException;
import com.seckill.exception.SeckillCloseException;
import com.seckill.exception.SeckillException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


import java.util.List;

/**
 * Created by wangmiao on 2017/2/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
"classpath:spring/spring-service.xml",
        "classpath:spring/spring-dao.xml"})
public class SeckillServiceTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private SeckillService seckillService;

    @Test
    public void querySeckillList() throws Exception {
        List<Seckill> list = seckillService.querySeckillList();
        logger.info("list={}",list);
    }

    @Test
    public void queryById() throws Exception {
        long id =1000L;
        Seckill seckill =  seckillService.queryById(id);
        logger.info("seckill={}",seckill);
    }

    @Test
    public void exportSeckillUrl() throws Exception {
        long id =1000L;
        Exposer exposer = seckillService.exportSeckillUrl(id);
        logger.info("exposer={}"+exposer);
        //e9ba040c51b617851e625bf2f06d591f
    }

    @Test
    public void executeSeckill() throws Exception {
        long id=1000;
        long phone = 15268530458L;
        String md5="e9ba040c51b617851e625bf2f06d591f";
        try {
            SeckillExecution execution = seckillService.executeSeckill(id,phone,md5);
            logger.info("execution={}",execution);
        }catch (RepeatKillException e){
            logger.error(e.getMessage(),e);
        }catch (SeckillCloseException e){
            logger.error(e.getMessage(),e);
        }

    }
    @Test
    public void testSeckillLogic() throws Exception {
        long id =1003L;
        Exposer exposer = seckillService.exportSeckillUrl(id);
        logger.info("exposer={}"+exposer);
        if(exposer.isExposed()){
            long phone = 15268530458L;
            String md5= exposer.getMd5();
            try {
                SeckillExecution execution = seckillService.executeSeckill(id,phone,md5);
                logger.info("execution={}",execution);
            }catch (RepeatKillException e){
                logger.error(e.getMessage(),e);
            }catch (SeckillCloseException e){
                logger.error(e.getMessage(),e);
            }
        }else{
            //秒杀未开启
            logger.warn("export={}",exposer);
        }
    }
}