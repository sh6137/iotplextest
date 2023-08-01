package com.example.iotplextest.service.impl;

import com.example.iotplextest.domain.CommandAAA;
import com.example.iotplextest.domain.CommandBBB;
import com.example.iotplextest.domain.CommandCCC;
import com.example.iotplextest.domain.CommandDDD;
import com.example.iotplextest.repository.AAARepository;
import com.example.iotplextest.repository.BBBRepository;
import com.example.iotplextest.repository.CCCRepository;
import com.example.iotplextest.repository.DDDRepository;
import com.example.iotplextest.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class TestServiceImpl implements TestService {
    private final AAARepository aaaRepository;
    private final BBBRepository bbbRepository;
    private final CCCRepository cccRepository;
    private final DDDRepository dddRepository;

    @Override
    @Transactional(readOnly = false)
    public void parser(String str) {
        String command = str.substring(0, 3);
        String sender = str.substring(3, 16);
        //command AAA,BBB,CCC
        String valuesA = "";

        //command AAA,CCC
        String latitude = "";
        String longitude = "";
        String valuesB = "";

        //command AAA
        String dataLength = "";
        String YN = "";
        String date = "";
        String active = "";
        String valuesC = "";
        String valuesD = "";
        String onAndOff = "";
        String lengthData = "";
        String valuesE = "";
        String valuesF = "";
        String specialData = "";
        String fieldData = "";
        String totalData = "";
        String checksum = "";

        //command BBB,CCC,DDD
        String check = "";

        //command BBB
        String receiveValue = "";

        //command CCC
        String NEBD = "";

        //command DDD;
        String returnValue = "";

        if (command.equals("AAA")) {
            dataLength = str.substring(16, 19);
            YN = str.substring(19, 21);
            date = str.substring(21, 33);
            active = str.substring(33, 34);
            valuesA = str.substring(34, 36);
            latitude = str.substring(36, 36 + 8);
            longitude = str.substring(36 + 8, 36 + 8 + 9);
            valuesB = str.substring(36 + 8 + 9, 36 + 8 + 9 + 3);
            valuesC = str.substring(36 + 8 + 9 + 3, 36 + 8 + 9 + 3 + 4);
            valuesD = str.substring(36 + 8 + 9 + 3 + 4, 36 + 8 + 9 + 3 + 4 + 3);
            onAndOff = str.substring(36 + 8 + 9 + 3 + 4 + 3, 36 + 8 + 9 + 3 + 4 + 3 + 1);
            lengthData = str.substring(36 + 8 + 9 + 3 + 4 + 3 + 1, 36 + 8 + 9 + 3 + 4 + 3 + 1 + 10);
            valuesE = str.substring(36 + 8 + 9 + 3 + 4 + 3 + 1 + 10, 36 + 8 + 9 + 3 + 4 + 3 + 1 + 10 + 2);
            valuesF = str.substring(36 + 8 + 9 + 3 + 4 + 3 + 1 + 10 + 2, 36 + 8 + 9 + 3 + 4 + 3 + 1 + 10 + 2 + 3);
            specialData = str.substring(36 + 8 + 9 + 3 + 4 + 3 + 1 + 10 + 2 + 3, 36 + 8 + 9 + 3 + 4 + 3 + 1 + 10 + 2 + 3 + 2);
            fieldData = str.substring(36 + 8 + 9 + 3 + 4 + 3 + 1 + 10 + 2 + 3 + 2, 36 + 8 + 9 + 3 + 4 + 3 + 1 + 10 + 2 + 3 + 2 + 2);
            totalData = str.substring(36 + 8 + 9 + 3 + 4 + 3 + 1 + 10 + 2 + 3 + 2 + 2, 36 + 8 + 9 + 3 + 4 + 3 + 1 + 10 + 2 + 3 + 2 + 2 + 10);
            checksum = str.substring(36 + 8 + 9 + 3 + 4 + 3 + 1 + 10 + 2 + 3 + 2 + 2 + 10);
            log.info("command : {}", command);
            log.info("sender : {}", sender);
            log.info("dataLength : {}", dataLength);
            log.info("YN : {}", YN);
            log.info("date : {}", date);
            log.info("active : {}", active);
            log.info("valuesA : {}", valuesA);
            log.info("latitude : {}", latitude);
            log.info("longitude : {}", longitude);
            log.info("valuesB : {}", valuesB);
            log.info("valuesC : {}", valuesC);
            log.info("valuesD : {}", valuesD);
            log.info("onAndOff : {}", onAndOff);
            log.info("lengthData : {}", lengthData);
            log.info("valuesE : {}", valuesE);
            log.info("valuesF : {}", valuesF);
            log.info("specialData : {}", specialData);
            log.info("fieldData : {}", fieldData);
            log.info("totalData : {}", totalData);
            log.info("checksum : {}", checksum);

            CommandAAA commandAAA = CommandAAA.builder()
                    .command(command)
                    .sender(sender)
                    .dataLength(dataLength)
                    .YN(YN)
                    .date(date)
                    .active(active)
                    .valuesA(valuesA)
                    .latitude(latitude)
                    .longitude(longitude)
                    .valuesB(valuesB)
                    .valuesC(valuesC)
                    .valuesD(valuesD)
                    .onAndOff(onAndOff)
                    .lengthData(lengthData)
                    .valuesE(valuesE)
                    .valuesF(valuesF)
                    .specialData(specialData)
                    .fieldData(fieldData)
                    .totalData(totalData)
                    .checksum(checksum)
                    .build();
            aaaRepository.save(commandAAA);
            log.info("aaaRepository.save");
            log.info("commandAAA : {}", commandAAA);
        } else if (command.equals("BBB")) {
            check = str.substring(16, 16 + 1);
            receiveValue = str.substring(16 + 1, 16 + 1 + 1);
            valuesA = str.substring(16 + 1 + 1, 16 + 1 + 1 + 5);
            log.info("command : {}", command);
            log.info("sender : {}", sender);
            log.info("check : {}", check);
            log.info("receiveValue : {}", receiveValue);
            log.info("valuesA : {}", valuesA);
            CommandBBB commandBBB = CommandBBB.builder()
                    .command(command)
                    .sender(sender)
                    .checkYN(check)
                    .receiveValue(receiveValue)
                    .valuesA(valuesA)
                    .build();
            bbbRepository.save(commandBBB);
            log.info("bbbRepository.save");
            log.info("commandBBB : {}", commandBBB);

        } else if (command.equals("CCC")) {
            check = str.substring(16, 16 + 1);
            NEBD = str.substring(16 + 1, 16 + 1 + 1);
            latitude = str.substring(16 + 1 + 1, 16 + 1 + 1 + 9);
            longitude = str.substring(16 + 1 + 1 + 9, 16 + 1 + 1 + 9 + 9);
            valuesA = str.substring(16 + 1 + 1 + 9 + 9, 16 + 1 + 1 + 9 + 9 + 5);
            valuesB = str.substring(16 + 1 + 1 + 9 + 9 + 5, 16 + 1 + 1 + 9 + 9 + 5 + 2);
            log.info("command : {}", command);
            log.info("sender : {}", sender);
            log.info("check : {}", check);
            log.info("NEBD : {}", NEBD);
            log.info("latitude : {}", latitude);
            log.info("longitude : {}", longitude);
            log.info("valuesA : {}", valuesA);
            log.info("valuesB : {}", valuesB);
            CommandCCC commandCCC = CommandCCC.builder()
                    .command(command)
                    .sender(sender)
                    .checkYN(check)
                    .NEBD(NEBD)
                    .latitude(latitude)
                    .longitude(longitude)
                    .valuesA(valuesA)
                    .valuesB(valuesB)
                    .build();
            cccRepository.save(commandCCC);
            log.info("cccRepository.save");
            log.info("commandCCC : {}", commandCCC);
        } else if (command.equals("DDD")) {
            check = str.substring(16, 16 + 1);
            returnValue = str.substring(16 + 1, 16 + 1 + 1);
            log.info("command : {}", command);
            log.info("sender : {}", sender);
            log.info("check : {}", check);
            log.info("returnValue : {}", returnValue);
            CommandDDD commandDDD = CommandDDD.builder()
                    .command(command)
                    .sender(sender)
                    .checkYN(check)
                    .returnValue(returnValue)
                    .build();
            dddRepository.save(commandDDD);
            log.info("dddRepository.save");
            log.info("commandDDD : {}", commandDDD);
        } else {
            log.error("잘못된 값 : {}", str);
        }

    }

    @Override
    @Transactional(readOnly = true)
    public List<CommandAAA> aaaCommandList() {
        List<CommandAAA> commandAAAList = aaaRepository.findAll(PageRequest.of(0, 10, Sort.by(Sort.Order.desc("id")))).getContent();
        log.info("commandAAAList : {}", commandAAAList);
        return commandAAAList;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CommandBBB> bbbCommandList() {
        List<CommandBBB> commandBBBList = bbbRepository.findAll(PageRequest.of(0, 10, Sort.by(Sort.Order.desc("id")))).getContent();
        log.info("commandBBBList : {}", commandBBBList);
        return commandBBBList;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CommandCCC> cccCommandList() {
        List<CommandCCC> commandCCCList = cccRepository.findAll(PageRequest.of(0, 10, Sort.by(Sort.Order.desc("id")))).getContent();
        log.info("commandCCCList : {}", commandCCCList);
        return commandCCCList;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CommandDDD> dddCommandList() {
        List<CommandDDD> commandDDDList = dddRepository.findAll(PageRequest.of(0, 10, Sort.by(Sort.Order.desc("id")))).getContent();
        log.info("commandDDDList : {}", commandDDDList);
        return commandDDDList;
    }
}
