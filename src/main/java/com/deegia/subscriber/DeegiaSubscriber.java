package com.deegia.subscriber;

import rx.Subscriber;

/**
 * 订阅方,消费方
 *
 * @author beval(bevalbiz@126.com) 3/18/16
 */
public class DeegiaSubscriber extends Subscriber {

    @Override
    public void onCompleted() {
        System.out.println("subscriber invoke completed");
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("subscriber throw exception");
        System.out.println(throwable);
    }

    @Override
    public void onNext(Object o) {
        System.out.println("invoke subscriber.onNext()");
        System.out.println("data=" + o);
    }

}
