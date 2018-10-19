package com.belle.jms.topic;

import com.belle.jms.producer.IProducerService;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

 

/**
 * @Author wang.qiang
 * @Date 2018年10月19日
 */
public class AppProducer {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("topic-producer.xml");

        IProducerService service = context.getBean(IProducerService.class);

        for (int i = 0; i < 100; i++) {
            service.sendMessage("test" + i);
        }
        context.close();

    }

}
