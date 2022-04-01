INSERT INTO subscription_definition (id, name) VALUES (1, 'Lifetime');
INSERT INTO subscription (id, subscription_type_id, creation_date_time) VALUES (1, 1, '2022-01-01 00:00:00');
INSERT INTO "USER" (id, email, password, subscription_id) VALUES (1, 'user1@gmail.com', '$2a$10$Byw3sRI3fiG0euuf8bny6e55HmKKVMbnh4ut5NRJXLDcZ6xQWC7Ge', 1);