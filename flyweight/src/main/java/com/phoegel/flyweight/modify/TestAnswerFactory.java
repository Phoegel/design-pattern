package com.phoegel.flyweight.modify;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 */
public class TestAnswerFactory {
    private static Map<String, TestAnswer> map = new HashMap<>();

    public static TestAnswer getTestAnswer(String type) {
        TestAnswer testAnswer = map.get(type);
        if(testAnswer == null){
            if(type.equals("chinese")){
                testAnswer = new ChineseTestAnswer();
            }else if (type.equals("math")){
                testAnswer = new MathTestAnswer();
            }else {
                throw new IllegalArgumentException("输入的试卷类型不存在");
            }
        }
        map.put(type, testAnswer);
        return testAnswer;
    }
}
