package com.test.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.api.mapping.Message;
import com.test.api.mapping.Message.StatusEnum;
import com.test.api.repo.userRepo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

@Api(tags = {"Order Processing"})
@RequiredArgsConstructor
@RestController
public class apiController {
	
	@Autowired
	private userRepo repo;
	
	@ApiOperation(value = "회원가입", notes = "회원가입")
	@RequestMapping(value="/signup", method=RequestMethod.POST, produces="application/json; charset=UTF8") //회원가입
	public Message signup(@ApiParam(value = "회원가입", required = true) @RequestBody Map<String, String> param) throws Exception {
		Message message = new Message();
		 
		message.setStatus(StatusEnum.OK);
        message.setMessage("회원가입");
        return message;
	}

	@ApiOperation(value = "로그인", notes = "로그인")
	@RequestMapping(value="/login", method=RequestMethod.POST, produces="application/json; charset=UTF8")
	public Message login(@ApiParam(value = "주문", required = true) @RequestBody Map<String, String> param) throws Exception {
		Message message = new Message();
		
		message.setStatus(StatusEnum.OK);
        message.setMessage("로그인");
		return message;
	}

	@ApiOperation(value = "회원정보확인", notes = "회원정보확인")
	@RequestMapping(value="/loginInfo", method=RequestMethod.POST, produces="application/json; charset=UTF8")
	public Message orderInfo(@ApiParam(value = "회원정보확인", required = true) @RequestBody Map<String, String> param) throws Exception {
		Message message = new Message();
		
		message.setStatus(StatusEnum.OK);
        message.setMessage("회원정보확인");
		return message;
	}
	
	@ApiOperation(value = "관심종목저장", notes = "관심종목저장")
	@RequestMapping(value="/saveAttention", method=RequestMethod.GET, produces="application/json; charset=UTF8")
	public Message saveAttention(@ApiParam(value = "관심종목저장", required = true) @RequestBody Map<String, String> param) throws Exception {
		Message message = new Message();
		
		message.setStatus(StatusEnum.OK);
        message.setMessage("관심종목저장");
		return message;
	}
	
	@ApiOperation(value = "관심종목삭제", notes = "관심종목삭제")
	@RequestMapping(value="/deleteAttention", method=RequestMethod.GET, produces="application/json; charset=UTF8")
	public Message deleteAttention(@ApiParam(value = "관심종목삭제", required = true) @RequestBody Map<String, String> param) throws Exception {
		Message message = new Message();
		
		message.setStatus(StatusEnum.OK);
        message.setMessage("관심종목삭제");
		return message;
	}
	
	@ApiOperation(value = "코인시세가져오기", notes = "코인시세가져오기")
	@RequestMapping(value="/coinInfo", method=RequestMethod.GET, produces="application/json; charset=UTF8")
	public Message coinInfo(@ApiParam(value = "코인시세가져오기", required = true) @RequestBody Map<String, String> param) throws Exception {
		Message message = new Message();
		
		message.setStatus(StatusEnum.OK);
        message.setMessage("코인시세가져오기");
		return message;
	}
}
