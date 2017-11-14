package com.tuodao.bp.common;

import com.alibaba.fastjson.JSON;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @description: 业务基础测试信息
 * @author: mif
 * @date: 2017/9/4
 * @time: 14:56
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@SpringBootTest(classes = CommonApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CommonTestApi {
    private MockMvc mvc;

    protected String url;

    protected String ACCESS_ID = "accessId";
    protected String ACCESS_KEY = "accessKey";
    protected String SIGN = "NO";
    protected String ROUTER = "/api/router";

    @Autowired
    protected WebApplicationContext wac;

    @Before
    public void setUp() throws Exception {
        //  初始化MockMvc对象
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
        // 初始化Mock
        MockitoAnnotations.initMocks(this);
    }


    /**
     * 发送请求
     *
     * @param format  格式
     * @param content 内容
     * @throws Exception
     */
    public void doPost(MediaType format, Object content) throws Exception {
        RequestBuilder request = post("/" + url).content(JSON.toJSONString(content))
                .accept(null == format ? MediaType.APPLICATION_JSON_UTF8 : format)
//                .header("accessId", ACCESS_ID)
//                .header("accessKey", ACCESS_KEY)
//                .header("sign", SIGN)
//                .header("x-forwarded-prefix",ROUTER)
 ;

        mvc.perform(request)
                .andExpect(status().isOk())
                .andDo(print());
    }
}
