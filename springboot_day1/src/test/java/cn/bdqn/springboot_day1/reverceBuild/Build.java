package cn.bdqn.springboot_day1.reverceBuild;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

//代码生成器
public class Build {


    public static void main(String[] args) {
        //1.需要 构建一个代码生成器对象
        AutoGenerator generator=new AutoGenerator();

        //2.配置策略
        // 2_1 全局配置
        GlobalConfig config=new GlobalConfig();
        String property = System.getProperty("user.dir");//当前项目路径对象
        config.setOutputDir(property+"/src/main/java");//此行代码表示(生成代码所在路径)

         config.setAuthor("版本作者注释信息(也就是作者名)");
         config.setOpen(false);//代码生成后是否打开资源管理器(Windows文件夹)
        config.setFileOverride(false);//是否覆盖已经存在的代码
        config.setServiceName("%sService");// 去掉生成的Service的I前缀
        config.setIdType(IdType.ID_WORKER);//保持初始算法
        config.setDateType(DateType.ONLY_DATE);//仅仅显示时间部分
        config.setSwagger2(true);// 去看教程了解前后端分离配置

        generator.setGlobalConfig(config);  //将配置信息放入 代码生成器

         //2_2  配置数据源
        DataSourceConfig dsc=new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);  //数据库类型
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");          //数据库驱动
        dsc.setUrl("jdbc:mysql://localhost:3306/appinfodb?allowMultiQueries=true&useSSL=true&serverTimezone=UTC");             //..
        dsc.setUsername("S3_Object");        //..
        dsc.setPassword("123123");        //..

        generator.setDataSource(dsc);


        //2_3   包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("cn.bdqn");
        pc.setModuleName("appinfodb");
        pc.setEntity("domain");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");

        generator.setPackageInfo(pc);

        //2_4   策略配置  (瞧一眼算了)
       StrategyConfig strategy = new StrategyConfig();
       strategy.setInclude("ad_promotion","app_category","app_info","app_version","backend_user","data_dictionary","dev_user");
       // 设置要映射的表名
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        // 自动lombok；
        strategy.setLogicDeleteFieldName("deleted");
        // 自动填充配置
        TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
        TableFill gmtModified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmtModified);
        strategy.setTableFillList(tableFills);
        // 乐观锁
        strategy.setVersionFieldName("version");
        //
        strategy.setRestControllerStyle(true);      //驼峰命名 设置  命名方式
        strategy.setControllerMappingHyphenStyle(true);  //访问方式  访问hello_id_2请求 更清楚  localhost:8080/hello_id_2

        generator.setStrategy(strategy);


        generator.execute();  //生成器 执行

    }




}
