/*
 * notebook
 *
 * Copyright (c) 2019~2020，zhaohongliang  Email：15711385916@163.com
 *
 * https://github.com/Chunghwa-2018/note-book.git
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

package com.example.notebook.exception;

import com.example.notebook.core.BaseError;

import static com.example.notebook.core.CommonErrorCodeEnum.USER_NOT_FOUND;


/**
 * CommonException
 *
 * <p>自定义 通用类型</p>
 *
 * @author: zhaohongliang
 * @date: 2019-12-02 13:24
 * @version: 1.0.0
 */
public class CommonException extends RuntimeException {

    /**
     * 错误代码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    public CommonException() {
        super(USER_NOT_FOUND.getMsg());
        this.code = USER_NOT_FOUND.getCode();
        this.msg= USER_NOT_FOUND.getMsg();
    }

    public CommonException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public CommonException(BaseError baseError) {
        super(baseError.getMsg());
        this.code = baseError.getCode();
        this.msg = baseError.getMsg();
    }

    public CommonException(BaseError baseError, String msg) {
        super(msg);
        baseError.setMsg(msg);
        this.code = baseError.getCode();
        this.msg = baseError.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
