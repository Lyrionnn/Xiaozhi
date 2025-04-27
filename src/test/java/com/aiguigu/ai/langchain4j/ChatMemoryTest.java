package com.aiguigu.ai.langchain4j;

import com.atiguigu.java.ai.langchain4j.XiaozhiApp;
import com.atiguigu.java.ai.langchain4j.assistant.Assistant;
import com.atiguigu.java.ai.langchain4j.assistant.MemoryChatAssistant;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = XiaozhiApp.class)
public class ChatMemoryTest {

    @Autowired
    private OpenAiChatModel model;

    @Autowired
    private MemoryChatAssistant memoryCharAssistant;

    @Test
    public void testChat() {

        MessageWindowChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);

        Assistant assistant = AiServices.builder(Assistant.class)
                .chatLanguageModel(model)
                .chatMemory(chatMemory)
                .build();

        assistant.chat("我是张三");

        String answer = assistant.chat("我是谁？");

        System.out.println(answer);
    }
}
