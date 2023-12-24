package com.kevin.xiehn.observer;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-24 1:02
 */
public class Test {
    public static void main(String[] args) {
        SubscriptionSubject mSubscriptionSubject=new SubscriptionSubject();
        //创建微信用户
        WeiXinUser user1=new WeiXinUser("孙悟空");
        WeiXinUser user2=new WeiXinUser("猪悟能");
        WeiXinUser user3=new WeiXinUser("沙悟净");
        //订阅公众号
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notify("传智黑马的专栏更新了");
    }
}
