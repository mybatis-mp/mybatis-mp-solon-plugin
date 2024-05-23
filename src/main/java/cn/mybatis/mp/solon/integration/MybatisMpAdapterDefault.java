package cn.mybatis.mp.solon.integration;

import cn.mybatis.mp.core.mybatis.configuration.MybatisConfiguration;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.solon.integration.MybatisAdapterDefault;
import org.noear.solon.Utils;
import org.noear.solon.core.BeanWrap;
import org.noear.solon.core.Props;

/**
 * 基于 mybatis solon 插件 修改
 * 替换 mybatis Configuration 配置
 *
 * @author Ai东
 * @since 2.6.4
 */
public class MybatisMpAdapterDefault extends MybatisAdapterDefault {

    protected MybatisMpAdapterDefault(BeanWrap dsWrap) {
        super(dsWrap);
    }

    protected MybatisMpAdapterDefault(BeanWrap dsWrap, Props dsProps) {
        super(dsWrap, dsProps);
    }

    @Override
    protected void initConfiguration(Environment environment) {
        MybatisConfiguration configuration = new MybatisConfiguration(environment);
        this.config = configuration;
        Props cfgProps = this.dsProps.getProp("configuration");
        if (cfgProps.size() > 0) {
            Utils.injectProperties(this.config, cfgProps);
        }
        configuration.printBanner();
    }
}
