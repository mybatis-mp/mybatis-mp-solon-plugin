/*
 *  Copyright (c) 2024-2025, Ai东 (abc-127@live.cn).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License").
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and limitations under the License.
 *
 */

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
