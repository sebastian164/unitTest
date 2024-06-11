package payments;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PaymentResponse {

    enum PaymentStatus{
        OK, ERROR
    }

    private PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

}
