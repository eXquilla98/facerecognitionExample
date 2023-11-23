package simpleFacerecognitionApplication.faceRecog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class faceRecognitionController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @PostMapping("/recognize-face")
    public String recognizeFace(@RequestParam String imageData) {
        // Handle face recognition logic
        return "success"; // Adjust the return value as needed
    }
}
