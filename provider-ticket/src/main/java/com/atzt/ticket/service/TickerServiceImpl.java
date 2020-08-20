package com.atzt.ticket.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;


/**
 * @author zt
 * @title TickerServiceImpl
 * @Description TOOD
 * @Date 2020/8/17 16:31
 * @Version 1.0
 */
@Component
@DubboService
public class TickerServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "《厉害了，我的国》";
    }
}
