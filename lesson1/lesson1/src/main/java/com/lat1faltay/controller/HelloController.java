package com.lat1faltay.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api") // genellikle class seviyesinde bu anotasyon kullanılır
public class HelloController {

    // Mapping Anotasyonları (en çok kullanılan)
    // GET     : Veri görüntülemek istediğimiz zaman kullanıyoruz
    // POST    : Veri kaydetmek istediğimiz zaman kullanıyoruz
    // PUT     : Veri güncellemek için kullanıyoruz
    // PATCH   : Verinin bir bölümünü güncellemek istediğimiz zaman kullanıyoruz
    //           Örneğin: Parola güncellemek gibi
    // DELETE  : Veri silmek istediğimiz zaman kullanıyoruz

    // localhost:8080/api/hello

    //@GetMapping(path = "/hello") == alt satır ile aynı anlama geliyor bu satırdaki daha kısa hali
    @RequestMapping(path = "/hello", method = RequestMethod.GET) // == üst satır ile aynı anlama geliyor sadece daha uzun hali
    public String sayHello(){
        return "Hello World!";
    }

    @PostMapping("/save")
    public String save(){
        return "Data Saved";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Data Deleted!";
    }
}
