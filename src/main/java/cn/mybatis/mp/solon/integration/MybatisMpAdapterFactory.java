package cn.mybatis.mp.solon.integration;

import org.apache.ibatis.solon.MybatisAdapter;
import org.apache.ibatis.solon.MybatisAdapterFactory;
import org.noear.solon.core.BeanWrap;
import org.noear.solon.core.Props;

/**
 * mybatis-mp 适配器工厂。
 *
 * @author Ai东
 * @since 2.6.4
 */
public class MybatisMpAdapterFactory implements MybatisAdapterFactory {

    @Override
    public MybatisAdapter create(BeanWrap dsWrap) {
        return new MybatisMpAdapterDefault(dsWrap);
    }

    @Override
    public MybatisAdapter create(BeanWrap dsWrap, Props dsProps) {
        return new MybatisMpAdapterDefault(dsWrap, dsProps);
    }

}
