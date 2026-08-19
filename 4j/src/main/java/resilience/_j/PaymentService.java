package resilience._j;

import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Retry(name = "paymentRetry")
    public String processPayment() {

        System.out.println("Trying payment...");

        throw new RuntimeException("Payment Service Failed!");

    }
}