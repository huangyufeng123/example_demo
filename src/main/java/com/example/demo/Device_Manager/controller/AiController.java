package com.example.demo.Device_Manager.controller;


import com.example.demo.Device_Manager.common.BaseResponse;
import com.example.demo.Device_Manager.model.DevChatRequest;
import com.example.demo.Device_Manager.model.DevChatResponse;
import com.example.demo.Device_Manager.service.YuCongMingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "向我提问")
@RequestMapping("/ai")
@CrossOrigin
public class AiController {

    private final YuCongMingService yuCongMingService;

    public AiController(YuCongMingService yuCongMingService) {
        this.yuCongMingService = yuCongMingService;
    }

    @PostMapping("/chat")
    @ApiOperation(value = "提问案例1")
    public BaseResponse<DevChatResponse> talkToModel(@RequestBody DevChatRequest request) {
        return yuCongMingService.talkToModel(request);
    }
}
