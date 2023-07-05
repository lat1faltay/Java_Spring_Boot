package com.latifaltay.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api")
public class MyController {

    /*
        is required anotasyonu alanın boş geçirilebilir ya da geçirilemez olduğunu belirten bir anotasyondur
        aşağıda @pathvariable anotasyonunu kullandığımızda name = "message" yazısının yanında required = false yazıyor
        bu özellik defaultta true geliyor, biz bunu false olarak değiştirdik
        bu şekilde yaptığımızda kullanıcı message alanını boş bıraktığında dahi bu özellikten faydalanabiliyor

     */

    // aşağıda @GetMapping anotasyonuna 2 farklı parametre girdiğimiz için parametreleri süslü parantezler içine yazıp ayrıca her parametreyi tırnak işareti içine almalıyız
    // başta yazan "/message1" yoktu fakat o olmayınca required false olsa bile bize cevap olarak 404 veriyor
    // anladığım kadarıyla "/message1" yazmamızın sebebi url hem message1'e hem de parametreli message1'e gidebilsin diye başa "/message1" ekledik
    @GetMapping({"/message1","/message1/{message}"})
    public String getMyMessageWithVariable(@PathVariable(name = "message", required = false) String message){
        return "Your message is : " + message;
    }

    @GetMapping("/message2")
    public String getMyMessageWithParam(@RequestParam(name = "message", required = false) String message){
        return "Your message is : " + message;
    }



}
