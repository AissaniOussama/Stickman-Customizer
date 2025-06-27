package de.htwberlin.webtech;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(Controller.class)
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StickmanService service;

    @Test
    public void testGetStickmanById() throws Exception {
        Stickman s1 = new Stickman("Mr.Cool", "Hat1", "Top1", "Bot1");
        s1.setId(1L);

        when(service.getById(1L)).thenReturn(s1);

        String expectedJson = """
            {
              "id":1,
              "name":"Mr.Cool",
              "hat":"Hat1",
              "top":"Top1",
              "bot":"Bot1"
            }
            """;

        mockMvc.perform(get("/api/stickmans/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json(expectedJson));
    }
}
