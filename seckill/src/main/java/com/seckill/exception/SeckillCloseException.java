package com.seckill.exception;

/**
 * 秒杀关闭异常
 * @author wangmiao on 2017/2/19.
 * @create 2017 - 02 - 19 下午6:42
 */

public class SeckillCloseException extends SeckillException {
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
