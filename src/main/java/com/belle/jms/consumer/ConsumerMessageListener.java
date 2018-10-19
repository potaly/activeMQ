package com.belle.jms.consumer;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


/**
 * 监听消费信息
 * @Author wang.qiang
 * @Date 2018年10月19日
 */
public class ConsumerMessageListener implements MessageListener {

    public void onMessage(Message message) {

        TextMessage textMessage = (TextMessage) message;

        try {
            System.out.println("接收消息" + textMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
