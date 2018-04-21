package javis.app.web.config.base;
//package com.vdance.config.base;//package com.vdance.config.base;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//import redis.clients.jedis.JedisPoolConfig;
//
///**
// * @author JarvisChen
// * @desc
// * @date 2018-01-08
// * @time 上午9:23
// */
//@Configuration
//@PropertySource("classpath:redis.properties")
//public class JDBCConfig {
//
//    @Bean
//    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
////
////    @Value("${jdbc.driver}")
////    private String jdbcDriver;
////    @Value("${jdbc.url}")
////    private String jdbcUrl;
////    @Value("${redis.maxActive}")
////    private Integer maxActive;
//
//    @Bean
//    protected JedisPoolConfig jedisPoolConfig(@Value("${redis.maxActive}") Integer maxActive) {
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxTotal(maxActive);
////        jedisPoolConfig.setMaxIdle();
////        jedisPoolConfig.setMaxWaitMillis();
////        jedisPoolConfig.setTestOnBorrow(());
//        return jedisPoolConfig;
//    }
//
////    @Bean
////    protected DruidDataSource druidDataSource() throws SQLException {
////        DruidDataSource druidDataSource = new DruidDataSource();
////        druidDataSource.setUrl(jdbcUrl);
////        druidDataSource.setDriverClassName(jdbcDriver);
////        return druidDataSource;
////    }
//}
