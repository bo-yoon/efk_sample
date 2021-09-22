package com.efk.sample;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Slf4j
@RestController
@RequestMapping(value = "/sample")
@Api(tags = {"테스트 API"})
@RequiredArgsConstructor
public class SampleController {


    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);


    @GetMapping(value = "/efk-test")
    @ApiOperation(value = "테스트")
    public String sampleApi() {
        LOGGER.info("test 로그!!!!!!!!!!!!!!!!");
        return "efk 테스트 로그입니다";
    }
}
