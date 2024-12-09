package com.taskmanagment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/string")
public class StringTransformation {

    @GetMapping("{inputString}")
    public void stringTrasformation(@PathVariable("inputString") String inputString){

        char[] charArray = inputString.toCharArray();
        String digit="";
        String aplhabetsSmall="";
        String capitalAplhabets="";
        for (int i=0;i<charArray.length;i++){
           if(charArray[i]>64 && charArray[i]<91){
               aplhabetsSmall=aplhabetsSmall+charArray[i];
           }
           else if((charArray[i]>96 && charArray[i]<122)){
               capitalAplhabets=capitalAplhabets+charArray[i];
           }
           else if(charArray[i]>47 && charArray[i]<57){
               digit=digit+charArray[i];
           }
        }

        String mergedString=digit+capitalAplhabets;
        System.out.println(mergedString);
    }
}
