package com.alexkoveckiy.common.router.api;

import com.alexkoveckiy.common.protocol.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alex on 23.02.17.
 */

@Component
public class HandlerFactoryByCommand extends HandlerFactory<RequestHandler> {

    @Override
    protected String getRouteKey(final Request<?> msg) {
        return msg.getHeader().getCommand();
    }
}