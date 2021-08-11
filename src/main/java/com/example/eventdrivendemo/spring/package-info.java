/**
 * @description : TODO
 * @author : Zhang Huang
 * @date : 2021-08-11 10:14 上午
 */
package com.example.eventdrivendemo.spring;
/**
 * spring事件驱动由3个部分组成
 *
 * @see org.springframework.context.ApplicationEvent
 * 1、ApplicationEvent：表示事件本身，自定义事件需要继承该类。用来定义事件
 * <p>
 * @see org.springframework.context.ApplicationEventPublisherAware
 * 2、ApplicationEventPublisherAware：事件发送器，需要实现该接口。主要用来发布事件.ApplicationContext 也实现了该接口，可以用于发布事件.
 * Spring4.2之后，ApplicationEventPublisher自动被注入到容器中，采用Autowired即可获取。
 * <p>
 * @see org.springframework.context.event.SmartApplicationListener
 * @see org.springframework.context.ApplicationListener
 * 3、ApplicationListener：事件监听器接口。监听类实现ApplicationListener 里onApplicationEvent方法即可.
 * 在spring4.2以后我们可以以更加简洁的方式来监听event的发布，监听事件我们不必再实现ApplicationListener接口了，只要在方法上添加注解@EventListener即可.
 * <p>
 * <p>
 * <p>
 * Spring中使用事件非常简单，只需要以下的几个步骤：
 * 定义事件，继承ApplicationEvent
 * 定义监听，要么实现ApplicationListener接口，要么在方法上添加@EventListener注解
 * 发布事件，调用ApplicationContext.publishEvent()或者ApplicationEventPublisher.publishEvent();
 * <p>
 * 注意事项
 * <p>
 * 事件没要处理的监听器，就会被抛弃。
 * 一个事件可以同时被多个监听处理类监听处理。
 * 默认情况下事件是同步的，即事件被publish后会等待Listener的处理。如果发布事件处的业务存在事务，监听器处理也会在相同的事务中。
 * 如果对于事件的处理不想受到影响，可以onApplicationEvent方法上加@Async支持异步或者在有@EventListener的注解方法上加上@Async。注：启动类上同时要加上@EnableAsync
 *
 *
 * 利用@TransactionalEventListener实现监听事件时的事务隔离
 * 很多时候，只有事务提交之后我们才会发布相应的事件处理其他逻辑，比如用户注册之后，发送邮件或者短信。这时候就可以用注解@TransactionalEventListener。
 * @TransactionalEventListener和@EventListener都可以监听事件，但前者可以对发布事件和监听事件进行一些事务上的隔离。
 * @TransactionalEventListener是对@EventListener的一个扩展，允许将事件的监听器绑定到事务的某个阶段。可以绑定到以下事务阶段：
 *
 * AFTER_COMMIT （默认），事务提交后
 * AFTER_ROLLBACK ，事务回滚后
 * AFTER_COMPLETION ，事务完成，包括提交后和回滚后
 * BEFORE_COMMIT ，事务提交前
 *
 * @TransactionalEventListener指不和发布事件的方法在同一个事务内，发布事件的方法事务结束后才会执行本监听方法，监听逻辑内发生异常不会回滚发布事件方法的事务。
 * @TransactionalEventListener有一个属性为fallbackExecution，默认为false，指发布事件的方法没有事务控制时，监听器不进行监听事件，此为默认情况！fallbackExecution=true，则指发布事件的方法没有事务控制时，监听方法仍可以监听事件进行处理。
 *
 */


