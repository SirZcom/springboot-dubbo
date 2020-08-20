package com.atzt.user.service;

import com.atzt.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.zip.DeflaterOutputStream;

/**
 * @author zt
 * @title UserService
 * @Description TOOD
 * @Date 2020/8/19 18:14
 * @Version 1.0
 */
@Service
public class UserService {
    //
    @DubboReference
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了"+ticket);
    }
}
