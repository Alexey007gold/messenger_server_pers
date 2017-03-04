package com.alexkoveckiy.common.router.api;

import com.alexkoveckiy.common.protocol.Request;
import com.alexkoveckiy.common.protocol.Response;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractRouterHandler<T extends Handler> implements RouterHandler {

    @Autowired
    private HandlerFactory handlerFactoryByCommand;

    @Override
	public Response<?> handle(Request<?> msg) {
		return handlerFactoryByCommand.getHandler(msg).handle(msg);
	}
}
