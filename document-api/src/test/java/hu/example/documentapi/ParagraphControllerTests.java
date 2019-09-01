package hu.example.documentapi;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ParagraphController.class)
public class ParagraphControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ParagraphService service;

    @Test
    public void getParagraphShouldReturnResultFromService() throws Exception {
        given(this.service.getParagraphs(anyInt(),anyInt())).willReturn(Arrays.asList("foo", "bar"));
        
        this.mockMvc.perform(get("/api/v1/paragraph?start=0&count=10"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("['foo', 'bar']"));
    }
}

