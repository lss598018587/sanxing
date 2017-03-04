-- 数据库出事化脚本

--创建数据库
CREATE  DATABASE seckill;
-- 使用数据库
use seckill;
-- 创建秒杀库存表
create TABLE  seckill(
`seckill_id` bigint NOT NULL  AUTO_INCREMENT COMMENT '商品库存id',
`name` varchar (120) NOT  NULL COMMENT '商品名称',
`number` int not NULL COMMENT '库存数量',
`start_time` timestamp NOT NULL COMMENT '秒杀开启时间',
`end_time` timestamp NOT NULL COMMENT '秒杀结束时间',
`create_time` TIMESTAMP NOT  NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY (seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT ='秒杀库存表';

--初始化数据
insert into seckill(name,number,start_time,end_time)
values
('1000元秒杀iphone6','100','2015-11-01 00:00:00','2015-11-02 00:00:00' ),
('400元秒杀ipad','300','2015-11-01 00:00:00','2015-11-02 00:00:00' ),
('200元秒杀小米','500','2015-11-01 00:00:00','2015-11-02 00:00:00' ),
('1500元秒杀note','1100','2015-11-01 00:00:00','2015-11-02 00:00:00' );

--秒杀成功明细表
-- 用户登陆认证相关的信息
CREATE  table success_killed(
`seckill_id` bigint not NULL  COMMENT '秒杀商品id',
`user_phone` bigint not null COMMENT '用户手机号',
`state` tinyint not null DEFAULT -1 COMMENT '状态标示：-1：无效，0成功，1：已付款',
`create_time` TIMESTAMP  not NULL COMMENT '创建时间',
PRIMARY key(seckill_id,user_phone), /** 联合住建**/
KEY idx_create_time(create_time)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT ='秒杀成功明细表';

--查看刚刚插入的语句
--show create table success_killed\G