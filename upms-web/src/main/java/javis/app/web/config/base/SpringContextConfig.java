//package javis.app.web.config.base;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
///**
// * @author JarvisChen
// * @desc
// * @date 2018-01-08
// * @time 上午9:23
// */
//@Configuration
//@PropertySource("classpath:jdbc.properties")
//public class SpringContextConfig {
//
////    @Bean
////    protected PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
////        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer();
////        Resource[] resources = new Resource[2];
////        resources[0] = new ClassPathResource("jdbc.properties");
////        resources[1] = new ClassPathResource("redis.properties");
////        propertyPlaceholderConfigurer.setLocations(resources);
////        return propertyPlaceholderConfigurer;
////    }
//
////    @Bean
////    protected JedisPoolConfig jedisPoolConfig() {
////        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
////        jedisPoolConfig.setMaxTotal();
////        jedisPoolConfig.setMaxIdle();
////        jedisPoolConfig.setMaxWaitMillis();
//////        jedisPoolConfig.setTestOnBorrow(propertyPlaceholderConfigurer());
////    }
//}
