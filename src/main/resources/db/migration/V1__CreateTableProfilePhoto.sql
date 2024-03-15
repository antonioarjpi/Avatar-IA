CREATE TABLE IF NOT EXISTS profile_photos(
    customer_id VARCHAR(36) NOT NULL,
    id VARCHAR(36) NOT NULL,
    original_photo VARCHAR(200),
    generated_photo VARCHAR(200),
    create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    PRIMARY KEY (customer_id, id)
);

INSERT INTO profile_photos (customer_id, id, original_photo, generated_photo) VALUES
("customer-1", "0244823-924fb-11eb-be2d-12a45a78bcd2", "customer-1-original-photo-1", "customer-1-generated-photo-1"),
("customer-2", "0ab3ef5-924fb-11ea-be2d-12c45f78bcd2", "customer-1-original-photo-2", "customer-1-generated-photo-2"),
("customer-1", "6a1b23e-924fb-11ec-be2d-12d45f78bcd2", "customer-2-original-photo-1", "customer-2-generated-photo-1");