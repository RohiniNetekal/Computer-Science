package hibernatejpa.entity;

import java.time.Instant;

/*
 * Learning example of a persistence entity.
 * A Spring Boot/JPA implementation would add @Entity, @Table, @Id,
 * and @GeneratedValue according to the database design.
 */
public class Merchant {
    private Long id;
    private String merchantCode;
    private String name;
    private boolean active;
    private Instant createdAt;

    protected Merchant() {
        // Required by JPA providers.
    }

    public Merchant(String merchantCode, String name) {
        this.merchantCode = merchantCode;
        this.name = name;
        this.active = true;
        this.createdAt = Instant.now();
    }

    public Long getId() { return id; }
    public String getMerchantCode() { return merchantCode; }
    public String getName() { return name; }
    public boolean isActive() { return active; }
    public Instant getCreatedAt() { return createdAt; }

    public void deactivate() {
        this.active = false;
    }
}

/*
 * JPA considerations:
 * - Align entity state with database constraints.
 * - Avoid exposing persistence entities directly from APIs.
 * - Choose fetch strategy deliberately.
 * - Watch for N+1 queries when traversing relationships.
 */
