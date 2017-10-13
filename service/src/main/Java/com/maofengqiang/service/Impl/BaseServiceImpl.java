package com.maofengqiang.service.Impl;

import com.maofengqiang.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
