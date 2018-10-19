package com.belle.jms.consumer;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


/**
 * @Author wang.qiang
 * @Date 2018年10月19日
 */
public class AppConsumer {

   public static void main(String[] args) {

       ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
    }


}
