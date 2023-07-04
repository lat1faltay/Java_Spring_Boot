package com.latifaltay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    @GetMapping(path = "/message/{message}")
    public String getMyMessage(@PathVariable String message) {
        return "Your message is : " + message;
    }

    /*

    Yukarıdaki işlemin farklı kullanımı

    @GetMapping(path = "/message/{m}")
    public String getMyMessage(@PathVariable("m") String message) {
        return "Your message is : " + message;
    }

    bu kullanım anladığım kadarıyla şu: örneğin bir kitap arıyor olalım site içersinde search barına kitabın ismini yazınca
    kitabın ismi otomatik olarak pathVariable olarak veriliyor ve path ile arama sağlanıyor

    örneğin: kitap sitesinden kitap arayalım latifkitap.com/api/books  bu url bize tüm kitapları verir
    fakat biz search barına kitabın kodunu vs girersek path otomatik olarak şuna dönüşecektir latifkitap.com/api/books/123
    123 id yerini alacak ve içerideki bookDetails methodunu çalıştırırsa kitap hakkında bilgi alınabilir.

     */

}
