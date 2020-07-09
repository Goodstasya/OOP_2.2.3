public class CreditPaymentService {
    public int calculate (int month,float credit, float rate){
        return (int) (credit
                        *
                       (rate/100/12 + ( (rate/100/12) / (Math.pow(1+rate/100/12, month)-1 ) ) ));
    }
}
