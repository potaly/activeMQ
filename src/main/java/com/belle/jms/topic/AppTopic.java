package com.belle.jms.topic;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * topic
 * @Author wang.qiang
 * @Date 2018年10月19日
 */

public class AppTopic {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("topic-consumer.xml");
    }


}
