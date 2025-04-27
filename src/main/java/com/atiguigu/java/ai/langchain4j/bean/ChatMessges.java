package com.atiguigu.java.ai.langchain4j.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "chat_messages")
public class ChatMessges {

    /**
     * 映射到mongoDb文档的_id字段
     */
    @Id
    private ObjectId messageId;

    /**
     * 对话id
     */
    private String memoryId;

    /**
     * 存储当前聊天记录列表的json字符串
     */
    private String content;
}
