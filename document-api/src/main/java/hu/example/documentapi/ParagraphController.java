package hu.example.documentapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/paragraph")
public class ParagraphController {
    
    private final ParagraphService paragraphService;
    
    @Autowired
    public ParagraphController(ParagraphService paragraphService) {
        this.paragraphService = paragraphService;
    }
    
    @GetMapping
    public ParagraphResponseDTO getParagraphs(@RequestParam(defaultValue = "0") int first, @RequestParam(defaultValue = "100") int count) {
        return paragraphService.getParagraphs(first, count);
    }
}
