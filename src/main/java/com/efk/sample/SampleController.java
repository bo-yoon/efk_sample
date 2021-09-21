package com.efk.sample;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sample")
@Api(tags = {"테스트 API"})
@RequiredArgsConstructor
public class SampleController {

    @PostMapping(value = "/efk-test")
    @ApiOperation(value = "테스트")
    public String sampleApi() {
        return "efk 테스트 로그입니다";
    }
}
