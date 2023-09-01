package com.elly.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elly.web.JBoard;
import com.elly.web.Member;
import com.elly.web.service.BoardService;
import com.elly.web.service.MemberService;	


@Controller
public class BoardController {
   
   @Autowired
   private MemberService memberService;
   
   @Autowired
   private BoardService boardService;

   
   @GetMapping("/board")
   public String board(Model model) {
      List<JBoard> list = boardService.findAll();
      model.addAttribute("list", list);
      return "board";
   }
   
   @GetMapping("/write")
   public String write() {
      return "write";
   }
   
   @PostMapping("/write")
   public String write(JBoard jBoard) {
      System.out.println(jBoard);
      Member member = memberService.findByMid("pororo");
      //member.setMid("pororo");
      jBoard.setMember(member);
      
      boardService.save(jBoard);
      return "redirect:/board";
   }
   
   @GetMapping("/detail")
   public String detail(@RequestParam(name="bno", required = true) int bno, Model model) {

      return "detail";
      
   }
   
   
   
   
   
   
   
   
}