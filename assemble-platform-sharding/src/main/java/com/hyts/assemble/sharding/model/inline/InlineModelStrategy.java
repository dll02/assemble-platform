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
package com.hyts.assemble.sharding.model.inline;

import com.hyts.assemble.sharding.enums.ShardingModelType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @project-name:standard-boot
 * @package-name:com.hyts.standard.sharding.model.inline
 * @author:LiBo/Alex
 * @create-date:2021-08-20 10:50
 * @copyright:libo-alex4java
 * @email:liboware@gmail.com
 * @description:
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class InlineModelStrategy {

    /**
     * 分片策略模式
     */
    private ShardingModelType shardingModelType = ShardingModelType.INLINE;

    /**
     * 数据眼内联区间策略模式
     */
    private  DataSourceInlineRangeStrategy dataSourceInlineRangeStrategy;

    /**
     * table名称区间策略机制控制
     */
    private  TableInlineRangeStrategy tableInlineRangeStrategy;

    /**
     * 构造器
     * @param dataSourceInlineRangeStrategy
     * @param tableInlineRangeStrategy
     */
    public InlineModelStrategy(DataSourceInlineRangeStrategy dataSourceInlineRangeStrategy, TableInlineRangeStrategy tableInlineRangeStrategy) {
        this.dataSourceInlineRangeStrategy = dataSourceInlineRangeStrategy;
        this.tableInlineRangeStrategy = tableInlineRangeStrategy;
    }
}
