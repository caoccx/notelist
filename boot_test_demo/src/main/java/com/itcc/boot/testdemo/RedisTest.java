package com.itcc.boot.testdemo;

import redis.clients.jedis.Jedis;

/**
 * Created by caocaixia on 2021/3/9 17:20
 */
public class RedisTest {
    public static void main(String[] args) {
        //连接本地redis服务
        Jedis jedis = new Jedis("127.0.0.1",6379);
        //查看服务是否运行，打出pong表示OK
        System.out.println("connection id OK =======>:"+jedis.ping());
    }
}
