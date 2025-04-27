package com.aiguigu.ai.langchain4j;


import com.atiguigu.java.ai.langchain4j.bean.ChatMessges;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

@SpringBootTest(classes = MongoCrudTest.class)
public class MongoCrudTest {

    @Autowired
    private MongoTemplate mongoTemplate;


//    @Test
//    public void insert(){
//        // 插入一条记录
//        mongoTemplate.insert(new ChatMessges(1L, "你好"));
//    }

    @Test
    public void insert2(){
        ChatMessges chatMessges = new ChatMessges();
        chatMessges.setContent("聊天记录列表");
        mongoTemplate.insert(chatMessges);
    }

    @Test
    public void find(){
        ChatMessges messages = mongoTemplate.findById("", ChatMessges.class);
        System.out.println(messages);
    }

    @Test
    public void update(){
        Criteria criteria = Criteria.where("_id").is("");
        Query query = new Query(criteria);
        Update update = new Update();
        update.set("content", "新的聊天记录列表");

        mongoTemplate.upsert(query, update, ChatMessges.class);
    }


}
