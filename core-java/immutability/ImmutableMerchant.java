package corejava.immutability;

import java.util.List;

public final class ImmutableMerchant {
    private final long id;
    private final String name;
    private final List<String> paymentMethods;

    public ImmutableMerchant(long id, String name, List<String> paymentMethods) {
        this.id = id;
        this.name = name;
        this.paymentMethods = List.copyOf(paymentMethods);
    }

    public long id() { return id; }
    public String name() { return name; }
    public List<String> paymentMethods() { return paymentMethods; }

    public static void main(String[] args) {
        ImmutableMerchant merchant =
                new ImmutableMerchant(101, "Demo Merchant", List.of("UPI", "CARD"));
        System.out.println(merchant.paymentMethods());

        try {
            merchant.paymentMethods().add("NET_BANKING");
        } catch (UnsupportedOperationException ex) {
            System.out.println("Immutable collection: " + ex.getClass().getSimpleName());
        }
    }
}
