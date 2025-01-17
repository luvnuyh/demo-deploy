package org.example.demodeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDeployApplication {

   void contextLoads() {
       System.out.println("단위 테스트 호출!");
   }

    // 단위 테스트
    // MVC 테스트 -> 목업통해서 가상 처리 가능
    // RestAPI 테스트 가능
}
