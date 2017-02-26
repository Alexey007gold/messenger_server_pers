package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.RegisterRequest;
import com.softgroup.authorization.api.message.RegisterResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.authorization.impl.model.CommonData;
import com.softgroup.authorization.impl.model.RegSession;
import com.softgroup.common.protocol.ActionHeader;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by alex on 23.02.17.
 */

@Component
public class RegisterRequestHandler extends AbstractRequestHandler<RegisterRequest, RegisterResponse> implements AuthorizationRequestHandler {

    @Autowired
    private CommonData commonData;

    @Override
    public String getName() {
        return "register";
    }

    @Override
    public Response<RegisterResponse> process(Request<?> msg) {
        return null;
    }

    private void sendSms(String phoneNumber, int authCode) {
    }

    private boolean numberIsOk(String phoneNumber) {
        return phoneNumber.charAt(0) == '+' &&
                !phoneNumber.substring(1).contains("+") &&
                phoneNumber.length() > 10 &&
                phoneNumber.length() < 15;
    }
}