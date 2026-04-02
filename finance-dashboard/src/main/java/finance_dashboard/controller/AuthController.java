package finance_dashboard.controller;

import finance_dashboard.dto.LoginRequest;
import finance_dashboard.dto.UserResponse;
import finance_dashboard.model.User;
import finance_dashboard.security.JwtUtil;
import finance_dashboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public UserResponse register(@RequestBody User user) {
        User savedUser = userService.registerUser(user);

        return new UserResponse(
                savedUser.getName(),
                savedUser.getEmail(),
                savedUser.getRole()
        );
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        User user = userService.login(request.getEmail(), request.getPassword());

        return jwtUtil.generateToken(user.getEmail());
    }
}