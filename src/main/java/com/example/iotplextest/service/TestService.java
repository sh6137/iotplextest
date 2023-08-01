package com.example.iotplextest.service;

import com.example.iotplextest.domain.CommandAAA;
import com.example.iotplextest.domain.CommandBBB;
import com.example.iotplextest.domain.CommandCCC;
import com.example.iotplextest.domain.CommandDDD;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TestService {
    void parser(String str);

    List<CommandAAA> aaaCommandList();

    List<CommandBBB> bbbCommandList();

    List<CommandCCC> cccCommandList();

    List<CommandDDD> dddCommandList();
}
