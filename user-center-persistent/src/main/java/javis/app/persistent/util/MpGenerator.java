package javis.app.persistent.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import javis.app.persistent.entity.UserGroup;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 测试生成代码
 * </p>
 *
 * @author K神
 * @date 2017/12/18
 */
public class MpGenerator {

    private static final String OUTPUT_DIR = "/Users/javischen/code/javis/back/user-center/user-center-persistent/src/main/java/";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/user-center?characterEncoding=utf-8&useUnicode=true";
    private static final String DB_USERNAME = "root";
    private static final String DB_PWD = "root!@#$123";
    private static final String DB_DRIVER_NAME = "com.mysql.jdbc.Driver";

    @Test
    public void generateCode() {
//        String packageName = "javis.app.persistent";
//        boolean serviceNameStartWithI = false;//user -> UserService, 设置成true: user -> IUserService
//        generateByTables(serviceNameStartWithI, packageName, "sys_user", "role");
    }

    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL).setUrl(DB_URL).setUsername(DB_USERNAME).setPassword(DB_PWD).setDriverName(DB_DRIVER_NAME);

        String[] fieldPrefix = {"su", "r"};
        StrategyConfig strategyConfig = new StrategyConfig()
                .setCapitalMode(true)
                .fieldPrefix(fieldPrefix)
                .setTablePrefix("su", "r")
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setLogicDeleteFieldName("is_deleted")
//                .setInclude(tableNames)
                .setEntityLombokModel(true)
                .setRestControllerStyle(true)
//                .setColumnNaming(NamingStrategy.underline_to_camel)
                ;//修改替换成你需要的表名，多个表名传数组

        GlobalConfig gc = new GlobalConfig()
        .setOutputDir(OUTPUT_DIR)
        .setFileOverride(true)
        .setActiveRecord(true)
        .setEnableCache(false)
        .setBaseResultMap(true)
        .setBaseColumnList(true)
        .setAuthor("javis")
        .setOpen(false)
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
        generateByTables(true, packageName, tableNames);
    }

    @Test
    public void main() {
        UserGroup userGroup = new UserGroup();
        List<UserGroup> userGroups = userGroup.selectAll();
        userGroups.forEach(System.out::println);
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