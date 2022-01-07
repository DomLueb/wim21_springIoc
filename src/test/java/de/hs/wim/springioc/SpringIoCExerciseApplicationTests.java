package de.hs.wim.springioc;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringIoCExerciseApplicationTests {

    @Autowired
    private CustomerService customerService;

    @MockBean
    private ICustomerRepo customerRepo;

    @Test
    void mainTest() {
        Mockito.when(customerRepo.getAllCustomers()).thenReturn(Arrays.asList(new Customer("F","L","E","T")));

        int count= customerService.countCustomers();
        assertThat(count).isEqualTo(1);
    }
}

