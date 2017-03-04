package com.seckill.exception;

/**
 * 秒杀相关业务异常
 * @author wangmiao on 2017/2/19.
 * @create 2017 - 02 - 19 下午6:42
 */

public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
