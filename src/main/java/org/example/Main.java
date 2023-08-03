package org.example;

import org.example.Decorator.Computer;
import org.example.Decorator.ComputerConcrete;
import org.example.Decorator.ConcreteDecorator.Card;
import org.example.Decorator.ConcreteDecorator.Keybroad;
import org.example.Decorator.ConcreteDecorator.Mouse;
import org.example.Decorator.ConcreteDecorator.Screen;
import org.example.DecoratorShape.Circle;
import org.example.DecoratorShape.RedShapeDecorator;
import org.example.DecoratorShape.Shape;
import org.example.GitSate.*;
import org.example.SatteFan.Fan;
import org.example.SatteFan.OffState;
import org.example.SatteFan.RunningState;
import org.example.SatteFan.SlowState;
import org.example.Singleton.DemoConection_Singleton.ConnectSQL;
import org.example.Singleton.DemoLoger_Singleton.Logger;
import org.example.Singleton.Lazy;
import org.example.Singleton.ThreadSafe;
import org.example.State.ApprovedState;
import org.example.State.DocumentContext;
import org.example.State.NewState;
import org.example.State.SubmittedState;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        System.out.println("------------------Singleton đơn luồng----------");
//        Lazy singleton1 = Lazy.getInstance();
//        Lazy singleton2 = Lazy.getInstance();
//        // So sánh hai thể hiện duy nhất của lớp Singleton
//        System.out.println("Các Lazy singleton là 1: "+String.valueOf(singleton1 == singleton2));
//
//
//
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(() -> {
//                ThreadSafe singleton = ThreadSafe.getInstance();
//                System.out.println("Hash code của thể hiện: " + singleton.hashCode());
//            });
//            thread.start();
//        }
//        System.out.println("------------------Singleton đa luồng----------");


        //Demo singleton connection
//        ConnectSQL connection1 = ConnectSQL.getInstance();
//        ConnectSQL connection2 = ConnectSQL.getInstance();
//        System.out.println("Các connecttion là 1: "+String.valueOf(connection1 == connection2));
//        System.out.println("------------------Demo Singleton connection mysql use hibernate----------");



        // Tạo đối tượng Logger
//        Logger logger1 = Logger.getInstance();
//        Logger logger2 = Logger.getInstance();
//        Logger logger3 = Logger.getInstance();
//
//        logger1.log("Log message 1");
//        logger2.log("Log message 2");
//
//        if (logger1 == logger2 && logger2 == logger3) {
//            System.out.println("Singleton Pattern hoạt động: Chỉ có một thể hiện duy nhất của Logger.");
//        } else {
//            System.out.println("Singleton Pattern không hoạt động: Có nhiều thể hiện của Logger.");
//        }
//        logger1.close();
//        logger2.close();
//        logger3.close();




        //Demo Decorator
//        Computer computerdemo = new Keybroad(new Mouse(new Card(new ComputerConcrete())));
//        System.out.println("Price computer + card + mouse+ keybroad: " + computerdemo.getPrice());
//
//
//        //
//        Shape circle = new RedShapeDecorator(new Circle());
//        circle.draw();
//
//
//
//        //State
//        DocumentContext context = new DocumentContext();
//
//        context.setState(new NewState());
//        context.applyState();
//
//        context.setState(new SubmittedState());
//        context.applyState();
//
//        context.setState(new ApprovedState());
//        context.applyState();


//Fan
//        System.out.println("--------------------------------------------");
//        Fan fan = new Fan();
//
//        fan.switchOn();
//        fan.setState(new RunningState());
//
//        fan.adjustSpeed();
//        fan.setState(new SlowState());
//
//        fan.adjustSpeed();
//        fan.setState(new SlowState());
//
//        fan.switchOff();
//        fan.setState(new OffState());
//        fan.adjustSpeed();
//
//        fan.switchOn();
//        fan.setState(new RunningState());



        //Git
        System.out.println("--------------------------------------------");
        GitContext gitContext = new GitContext();


//        // Thực hiện trạng thái "add"
        GitState addState = new AddState();
        addState.doAction(gitContext);
        System.out.println("Current state: " + gitContext.getState().getClass().getSimpleName());
        System.out.println("--------------------------------------------");

        // Thực hiện trạng thái "commit" (không thể commit khi chưa add)
        GitState commitState = new CommitState();
        commitState.doAction(gitContext);
        System.out.println("Current state: " + gitContext.getState().getClass().getSimpleName());
        System.out.println("--------------------------------------------");

        // Thực hiện trạng thái "push" (không thể push khi chưa commit)
        GitState pushState = new PushState();
        pushState.doAction(gitContext);
        System.out.println("Current state: " + gitContext.getState().getClass().getSimpleName());
    }
}