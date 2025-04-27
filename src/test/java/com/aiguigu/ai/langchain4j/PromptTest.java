package com.aiguigu.ai.langchain4j;

import com.atiguigu.java.ai.langchain4j.XiaozhiApp;
import com.atiguigu.java.ai.langchain4j.assistant.SeparateChatAssistant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = XiaozhiApp.class)
public class PromptTest {

    @Autowired
    private SeparateChatAssistant separateChatAssistant;


    public void testUserInfo(){
        //从数据库中获取用户信息
        String userName = "翠花";
        int age = 18;

        String answer = separateChatAssistant.chat3(1, "我是谁，多大了", userName, age);
        System.out.println(answer);
    }

}
