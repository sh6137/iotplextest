package com.example.iotplextest.controller;

import com.example.iotplextest.domain.CommandAAA;
import com.example.iotplextest.domain.CommandBBB;
import com.example.iotplextest.domain.CommandCCC;
import com.example.iotplextest.domain.CommandDDD;
import com.example.iotplextest.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MainController {
    private final TestService testService;

    @GetMapping("/sample-data")
    public HashMap<String, Object> sampleData(){
        log.info("Method : sampleData");
        HashMap<String, Object> hashMap = new HashMap<>();
        List<CommandAAA> commandAAAList = testService.aaaCommandList();
        List<CommandBBB> commandBBBList = testService.bbbCommandList();
        List<CommandCCC> commandCCCList = testService.cccCommandList();
        List<CommandDDD> commandDDDList = testService.dddCommandList();
        hashMap.put("commandAAAList", commandAAAList);
        hashMap.put("commandBBBList", commandBBBList);
        hashMap.put("commandCCCList", commandCCCList);
        hashMap.put("commandDDDList", commandDDDList);
        return hashMap;
    }

    @GetMapping("/sample-data-insert")
    public HashMap<String, String> sampleDataInsert(@RequestParam HashMap<String, Object> requestHash){
        log.info("Method : sampleDataInsert");
        String str = String.valueOf(requestHash.get("sampleData"));
        HashMap<String, String> hashMap = new HashMap<>();
        testService.parser(str);
        hashMap.put("message", "hello 여기까지 왔어요");
        hashMap.put("index","index");
        return hashMap;
    }
}
