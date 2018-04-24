package javis.app.web.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * <p>
 * 测试生成代码
 * </p>
 *
 * @author K神
 * @date 2017/12/18
 */
public class MpGenerator {

    private static final String OUTPUT_DIR = "/Users/javischen/code/javis/back/user-center/user-center-web/src/main/java/";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/user-center?characterEncoding=utf-8&useUnicode=true&useSSL=false";
    private static final String DB_USERNAME = "root";
    private static final String DB_PWD = "root!@#$123";
    private static final String DB_DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String PKG = "javis.app.web";

    @Test
    public void generateCode() {
        boolean serviceNameStartWithI = true;//user -> UserService, 设置成true: user -> IUserService
        generateByTables(serviceNameStartWithI, PKG);
    }

    private void generateByTables(boolean serviceNameStartWithI, String packageName) {
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL).setUrl(DB_URL).setUsername(DB_USERNAME).setPassword(DB_PWD).setDriverName(DB_DRIVER_NAME);

        StrategyConfig strategyConfig = new StrategyConfig()
//                .setCapitalMode(false)
                .setEntityLombokModel(true)
                .setDbColumnUnderline(false)
                .setNaming(NamingStrategy.underline_to_camel)
                .setColumnNaming(NamingStrategy.underline_to_camel)
//                .setTablePrefix("sys_")
                .setRestControllerStyle(true)
//                .setFieldPrefix(new String[] {"as"})
                .setSuperEntityColumns("id", "is_deleted", "gmt_create", "gmt_modified")
                .setSuperEntityClass("javis.app.web.base.BaseEntity")
                .setSuperControllerClass("javis.app.web.base.BaseController")
//                .setLogicDeleteFieldName("is_deleted")
//                .setInclude(tableNames)
                ;//修改替换成你需要的表名，多个表名传数组

        GlobalConfig gc = new GlobalConfig()
                .setOutputDir(OUTPUT_DIR)   // 生成文件的输出目录
                .setFileOverride(true)      // 是否覆盖已有文件
                .setActiveRecord(false) // 开启 ActiveRecord 模式
                .setEnableCache(false) // 是否在xml中添加二级缓存配置
                .setBaseResultMap(true) // 开启 BaseResultMap
                .setBaseColumnList(true) // 开启 baseColumnList
//                .setKotlin(false) // 开启 Kotlin 模式
                .setAuthor("javis") // 开发人员
                .setOpen(false) // 是否打开输出目录
//                .setIdType(IdType.AUTO)
                ;
        if (!serviceNameStartWithI) {
            gc.setServiceName("%sService");
        }

        PackageConfig packageInfo = new PackageConfig()
                .setParent(packageName)
                .setController("controller")
                .setMapper("dao")
                .setXml("dao.impl")
                .setEntity("entity");

        AutoGenerator generator = new AutoGenerator();
        generator.setGlobalConfig(gc)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageInfo)
                .execute();
    }

    private void generateByTables(String packageName, String... tableNames) {
        generateByTables(true, packageName);
    }

    @Test
    public void main() {
//        UserGroup userGroup = new UserGroup();
//        List<UserGroup> userGroups = userGroup.selectAll();
//        userGroups.forEach(System.out::println);
    }


    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        // mybatis配置文件
        String resource = "config/SqlMapConfig.xml";
        // 得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 创建会话工厂，传入mybatis的配置文件信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }
}