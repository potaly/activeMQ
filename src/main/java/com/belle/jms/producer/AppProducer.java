package com.belle.jms.producer;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

 


/**
 * @Author wang.qiang
 * @Date 2018年10月19日
 */
public class AppProducer {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");

        IProducerService service = context.getBean(IProducerService.class);

        for (int i = 0; i < 50; i++) {
            service.sendMessage("wang.q" + i);
        }
        context.close();

    }

}
