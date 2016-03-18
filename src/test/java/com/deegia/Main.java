package com.deegia;

import com.deegia.subscriber.DeegiaSubscriber;
import rx.Observable;
import rx.Subscriber;

/**
 * @author beval(bevalbiz@126.com) 3/17/16
 */
public class Main {
    public static void main(String[] args) {

        Observable.just("test subscriber").subscribe(new DeegiaSubscriber());


//        java();
    }

    public static void lambda() {
        Observable.just("Hello, world!").map(s -> s + "-----fuck").subscribe(System.out::println);
    }

    public static void java() {
        Observable<String> observable = Observable.just("hello, deegia").map(s -> {
            s += "__________";
            s += "__________";
            return s;
        });

        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("completed");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("error");
            }

            @Override
            public void onNext(String s) {
                System.out.println("----" + s);
            }
        };

        observable.subscribe(subscriber);
    }


}
