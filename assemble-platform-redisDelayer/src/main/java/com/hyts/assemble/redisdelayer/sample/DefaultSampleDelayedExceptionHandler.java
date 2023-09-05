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
package com.hyts.assemble.redisdelayer.sample;

import com.hyts.assemble.redisdelayer.listener.DelayedExceptionHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * @project-name:assemble
 * @package-name:com.hyts.assemble.redisdelayer.sample
 * @author:LiBo/Alex
 * @create-date:2022-05-24 19:57
 * @copyright:libo-alex4java
 * @email:liboware@gmail.com
 * @description:
 */
@Slf4j
public class DefaultSampleDelayedExceptionHandler implements DelayedExceptionHandler {

    @Override
    public void catchException(Throwable e, Thread currentThread) {
        log.error("current thread is failure -> current thread Name:{}"+currentThread.getName(),e);
    }

}
