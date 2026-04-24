import com.example.demo.model.*;
import com.example.demo.enums.*;

import java.util.*;

public class Payment {

    private String paymentId;
    private Ticket ticket;
    private double amount;
    private PaymentStatus status;
    private PaymentType type;
    private Random r = new Random();

    public Payment(Ticket ticket, double amount, PaymentType type) {
        this.paymentId = String.valueOf(r.nextInt(100));
        this.ticket = ticket;
        this.amount = amount;
        this.type = type;
        this.status = PaymentStatus.PENDING;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public PaymentType getType() {
        return type;
    }

    public void completePayment() {
        this.status = PaymentStatus.COMPLETED;
    }

    public void failPayment() {
        this.status = PaymentStatus.FAILED;
    }
}