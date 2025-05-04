package com.atiguigu.java.ai.langchain4j.tools;

import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.ToolMemoryId;
import org.springframework.stereotype.Component;

@Component
public class CalculatorTools {

    @Tool(name = "加法运算", value = "将两个数字相加")
    double sum(@ToolMemoryId Long id, @P(value = "加数1", required = true) double a, double b) {
        System.out.println("调用加法运算 memoryId: " + id);
        return a + b;
    }

    @Tool
    double squareRoot(@ToolMemoryId Long id, double x){
        System.out.println("调用平方根运算 memoryId: " + id);
        return Math.sqrt(x);
    }

}
