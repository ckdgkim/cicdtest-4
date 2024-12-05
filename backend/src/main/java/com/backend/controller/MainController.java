package com.backend.controller;

import com.backend.domain.User;
import com.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin(origins = "*")
public class MainController {

    @Autowired  // UserRepository를 자동으로 주입
    private UserRepository userRepository;

    @GetMapping("/api/hello")
    public String hello() {
        // 데이터베이스에서 첫 번째 사용자 가져오기
        User user = userRepository.findAll().stream().findFirst().orElse(null);

        if (user != null) {
            return "Hello, " + user.getName() + "!";
        } else {
            return "No users found!";
        }
    }

    // 새로운 메서드 추가: 클라이언트의 IP 주소를 로그로 출력
//    @GetMapping("/api/ip")
//    public String logClientIp(HttpServletRequest request) {
//        String clientIp = request.getRemoteAddr();  // 클라이언트의 IP 주소를 가져옴
//        System.out.println("Client IP: " + clientIp);  // 콘솔에 IP 출력
//
//        return "Client IP logged: " + clientIp;  // 응답으로 클라이언트의 IP 주소 반환
//    }
}
