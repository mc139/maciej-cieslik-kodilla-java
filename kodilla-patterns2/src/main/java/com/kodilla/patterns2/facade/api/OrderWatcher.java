package com.kodilla.patterns2.facade.api;

import com.kodilla.patterns2.aop.calculator.Calculator;
import com.kodilla.patterns2.aop.calculator.Watcher;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Aspect
@Component
public class OrderWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order,userId) && target(object)")
    public void logEvent(OrderDto order, long userId, Object object) {
        List<String> list = order.getItems().stream()
                .map(Object::toString).
                        collect(Collectors.toList());
        LOGGER.info("LOGS : " + "\n" +
                "Class: " + "\" " +
                object.getClass().getName() + "\"" + "\n"
                + "Args " + "User Id: " + userId + "\n "
                + list);
    }
}
