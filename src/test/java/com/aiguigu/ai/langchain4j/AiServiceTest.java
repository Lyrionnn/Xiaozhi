package com.aiguigu.ai.langchain4j;

import com.atiguigu.java.ai.langchain4j.XiaozhiApp;
import com.atiguigu.java.ai.langchain4j.assistant.Assistant;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.spring.AiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = XiaozhiApp.class)
public class AiServiceTest {

    @Autowired
    private OpenAiChatModel model;

    @Autowired
    private Assistant assistant;

    @Test
    public void testChat(){
        Assistant assistant = AiServices.create(Assistant.class, model);

        String answer = assistant.chat("你是谁？");

        System.out.println(answer);
    }

    @Test
    public void testAssistant(){
        String answer = assistant.chat("你是谁？");
        System.out.println(answer);
    }
}
