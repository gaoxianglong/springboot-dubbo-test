/*
 * Copyright 2019-2119 gao_xianglong@sina.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.service.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author gao_xianglong@sina.com
 * @version 0.1-SNAPSHOT
 * @date created in 2020/8/11 2:17 下午
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {
    private Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public boolean userLogin(String account, String pwd) {
        log.info("account:{},pwd:{}", account, pwd);
        if (account.equals("gxl")) {
            if (pwd.equals("123456")) {
                return true;
            }
        }
        return false;
    }
}
