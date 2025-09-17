package de.htwberlin.webtech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/*
Replaces a White Error Label Page with simple HTML saying Success
 */
@RestController
public class RootController {

    @GetMapping("/")
    public String root() {
        return """
               <html>
                   <head>
                       <style>
                           body {
                               background-color: black;
                               color: white;
                               font-family: Arial, sans-serif;
                               text-align: center;
                               padding-top: 20%;
                               font-size: 2em;
                           }
                       </style>
                   </head>
                   <body>
                       Backend ist hochgefahren. 
                   </body>
               </html>
               """;
    }
}
