package hu.example.documentapi;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ParagraphService {
    public static final String LOREM_IPSUM = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."; 
    public static final int TOTAL_COUNT = 1000000;
    
    public ParagraphResponseDTO getParagraphs(int first, int count) {
        List<String> paragraphs = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            String paragraph = String.format("<p>%d %s</p>", first + i, LOREM_IPSUM);
            paragraphs.add(paragraph);
        }
        ParagraphResponseDTO result = new ParagraphResponseDTO();
        result.setData(paragraphs);
        result.setTotal(TOTAL_COUNT);
        return result;
    }
}
