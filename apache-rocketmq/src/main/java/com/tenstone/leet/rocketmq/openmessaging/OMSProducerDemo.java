package com.tenstone.leet.rocketmq.openmessaging;

/**
 * Created by liuyuancheng on 2022/1/23  <br/>
 *
 * @author liuyuancheng
 */
public class OMSProducerDemo {

    public static void main(String[] args) {
//        final MessagingAccessPoint messagingAccessPoint = MessagingAccessPointFactory
//                .getMessagingAccessPoint("openmessaging:rocketmq://IP1:9876,IP2:9876/namespace");
//
//        final Producer producer = messagingAccessPoint.createProducer();
//
//        messagingAccessPoint.startup();
//        System.out.printf("MessagingAccessPoint startup OK%n");
//
//        producer.startup();
//        System.out.printf("Producer startup OK%n");
//
//        {
//            Message message = producer.createBytesMessageToTopic("OMS_HELLO_TOPIC", "OMS_HELLO_BODY".getBytes(Charset.forName("UTF-8")));
//            SendResult sendResult = producer.send(message);
//            System.out.printf("Send sync message OK, msgId: %s%n", sendResult.messageId());
//        }
//
//        {
//            final Promise<SendResult> result = producer.sendAsync(producer.createBytesMessageToTopic("OMS_HELLO_TOPIC", "OMS_HELLO_BODY".getBytes(Charset.forName("UTF-8"))));
//            result.addListener(new PromiseListener<SendResult>() {
//                @Override
//                public void operationCompleted(Promise<SendResult> promise) {
//                    System.out.printf("Send async message OK, msgId: %s%n", promise.get().messageId());
//                }
//
//                @Override
//                public void operationFailed(Promise<SendResult> promise) {
//                    System.out.printf("Send async message Failed, error: %s%n", promise.getThrowable().getMessage());
//                }
//            });
//        }
//
//        {
//            producer.sendOneway(producer.createBytesMessageToTopic("OMS_HELLO_TOPIC", "OMS_HELLO_BODY".getBytes(Charset.forName("UTF-8"))));
//            System.out.printf("Send oneway message OK%n");
//        }
//
//        producer.shutdown();
//        messagingAccessPoint.shutdown();
    }

}
