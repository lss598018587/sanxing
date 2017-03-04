package com.seckill.exception;

/**
 * 秒杀重复异常
 * @author wangmiao on 2017/2/19.
 * @create 2017 - 02 - 19 下午6:42
 */

public class RepeatKillException extends SeckillException {
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
