INSERT INTO
drinks (name, description, created_at, updated_at)
    VALUES
        ('Hala bum-bum', 'lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vel feugiat sem. Donec condimentum iaculis', '2022-09-17T15:21:46+00:00', '2022-09-19T15:21:46+00:00' ),
        ('Mojito', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vel feugiat sem. Donec condimentum iaculis', '2022-09-17T15:21:46+00:00', '2022-09-19T15:21:46+00:00'),
        ('Aperol', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vel feugiat sem. Donec condimentum iaculis', '2022-09-19T15:21:46+00:00', '2022-11-20T15:21:46+00:00'),
        ('Tequila Sunrise', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vel feugiat sem. Donec condimentum iaculis', '2022-09-19T15:21:46+00:00', '2022-11-20T15:21:46+00:00');


INSERT INTO
    ingredients(name, description, quantity, u_om)
VALUES ('Vodka', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur erat', 50.221, 'ml'),
       ('Tequila', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur erat', 60.00, 'ml'),
       ('Orange juce', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur erat', 70.00, 'ml'),
       ('Aperol', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur erat', 40.00, 'ml'),
       ('Grenadine', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur erat', 20.00, 'ml'),
       ('Ice', 'Lorem ipsum dolor sit amet', 3, 'cube'),
       ('Lemon', 'Lorem ipsum dolor sit', 2, 'piece');


INSERT INTO
    ingredients_drinks(ingredients_id, drinks_id)
VALUES
    (1, 1),
    (3, 1),
    (5, 1),
    (2, 4),
    (3, 4),
    (5, 4),
    (6, 4);

INSERT INTO
opinions(content, nickname, rate, drink_id)
    VALUES
        ('Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec nec tempus nibh. Aliquam quis tempus orci, sed volutpat tortor. ' ||
            'Nullam volutpat libero ac sagittis auctor. Sed rutrum quis elit eget placerat. Class aptent taciti sociosqu', 'XYZ', 4, 2 ),
        ('Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam dictum consequat eros.', 'Rudy', 7,3),
        ('Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer gravida eu tellus quis commodo. Curabitur fermentum gravida leo.', 'Ila', 5, 4),
        ('Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam placerat orci vitae eros maximus egestas quis bibendum quam. Donec semper.', 'Ziuum', 2, 1);


