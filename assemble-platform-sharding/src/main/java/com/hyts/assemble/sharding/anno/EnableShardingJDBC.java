/**
 * Copyright [2019] [LiBo/Alex of copyright liboware@gmail.com ]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hyts.assemble.sharding.anno;

import com.hyts.assemble.sharding.core.ShardingDataSourceConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @project-name:wiz-shrding-framework
 * @package-name:com.wiz.sharding.framework.boot.starter.sharding.sphere.anno
 * @author:LiBo/Alex
 * @create-date:2021-08-23 10:09
 * @copyright:libo-alex4java
 * @email:liboware@gmail.com
 * @description:
 */
@Import({ShardingDataSourceConfiguration.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
public @interface EnableShardingJDBC {


}