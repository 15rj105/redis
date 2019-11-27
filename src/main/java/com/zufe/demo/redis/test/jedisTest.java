package com.zufe.demo.redis.test;

import redis.clients.jedis.*;

import java.util.LinkedList;
import java.util.List;

public class jedisTest {
    private static ShardedJedisPool pool;
    static {
        JedisPoolConfig config = new JedisPoolConfig();
        JedisShardInfo jedisShardInfo = new JedisShardInfo("129.204.69.51", 6379);
        jedisShardInfo.setPassword("hY434513");
        List<JedisShardInfo> list = new LinkedList<JedisShardInfo>();
        list.add(jedisShardInfo);
        pool = new ShardedJedisPool(config, list);
    }
    public static void main(String args[]) {
//        Jedis jedis = new Jedis("129.204.69.51", 6379);
//        jedis.set("zufe", "2015");
//
//        String nf = jedis.get("zufe");
//        jedis.close();
        ShardedJedis jedis = pool.getResource();
        String keys = "myname1";
        jedis.del(keys);
        String vaule = jedis.set(keys, "lxr");
//        jedis.
        System.out.println(jedis.get(keys));
    }
}
