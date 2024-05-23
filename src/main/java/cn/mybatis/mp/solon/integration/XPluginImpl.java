package cn.mybatis.mp.solon.integration;

import org.apache.ibatis.solon.integration.MybatisAdapterManager;
import org.noear.solon.core.AppContext;
import org.noear.solon.core.Plugin;

/**
 * 配置 mybatis-mp 插件。
 *
 * @author Ai东
 * @since 2.6.4
 */
public class XPluginImpl implements Plugin {
    @Override
    public void start(AppContext context) {
        MybatisAdapterManager.setAdapterFactory(new MybatisMpAdapterFactory());
    }
}
