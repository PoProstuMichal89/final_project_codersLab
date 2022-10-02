INSERT INTO
drinks (name, description)
    VALUES
        ('Hala bum-bum', 'lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vel feugiat sem. Donec condimentum iaculis'),
        ('Mojito', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vel feugiat sem. Donec condimentum iaculis'),
        ('Aperol', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vel feugiat sem. Donec condimentum iaculis'),
        ('Tequila Sunrise', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vel feugiat sem. Donec condimentum iaculis');


INSERT INTO
    ingredients(name, description, quantity, u_om)
VALUES ('Vodka', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur erat.
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pretium.
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed in euismod leo. ' ||
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.',
50.221, 'ml'),


('Tequila', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed in interdum arcu, nec euismod dui. ' ||
'Donec congue quis lacus non maximus. Duis pellentesque justo sit amet elit consectetur consequat vel eu lacus. ' ||
'Pellentesque eu dui posuere eros sollicitudin condimentum. Suspendisse et volutpat erat. Donec non malesuada felis, ' ||
'in vestibulum mi. Nulla pretium pulvinar dignissim. Morbi volutpat id neque nec malesuada. Pellentesque fringilla ' ||
'dui non interdum sodales. Duis euismod eu mi sit amet rhoncus. Pellentesque condimentum lectus magna, at venenatis felis maximus id. ' ||
'Duis tristique molestie elit. Quisque commodo gravida ex quis placerat. Vivamus lobortis dolor iaculis odio semper ornare. ' ||
'Sed venenatis dictum volutpat.',
60.00, 'ml'),


('Orange juce', 'Proin iaculis, urna nec consequat lacinia, justo elit maximus ligula, id pharetra nibh sem ac lacus. ' ||
'Suspendisse eget augue eu urna laoreet aliquet. Pellentesque libero dui, vehicula interdum ullamcorper nec, fringilla in erat. Nam commodo quam in tellus imperdiet, in auctor ex fringilla. ' ||
 'Mauris accumsan massa justo, tincidunt commodo lacus molestie sit amet. Duis sit amet neque sed nisl tempus ornare et eu elit. Proin elementum tellus sed risus dapibus consequat.' ||
' Nunc lobortis sem lacus, eget pellentesque enim dignissim nec. Sed a tellus quam. Mauris ut erat eu nibh sollicitudin aliquam. Donec vel augue id ex malesuada rhoncus vehicula a ex.',
 70.00, 'ml'),

('Aperol', 'Suspendisse ut urna nec mauris luctus ornare. Quisque tincidunt metus ac urna mattis convallis. Integer lacinia convallis volutpat. ' ||
'Morbi tempor placerat nulla vel dignissim. Pellentesque vel purus vulputate, pretium tortor quis, luctus magna. ' ||
'Aliquam ligula sapien, faucibus eu interdum eu, dictum nec est. Donec nec turpis commodo ipsum pellentesque blandit.' ||
' Suspendisse nec nisi id nibh ullamcorper consequat. Sed congue orci in risus sagittis ornare. Donec sed tincidunt ipsum.',
 40.00, 'ml'),

('Grenadine', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur erat.
Lorem ipsum dolor sit amet, consectetur adipiscing elit. ' ||
'Vestibulum facilisis turpis quis condimentum fermentum. Nunc nec laoreet orci. Duis dictum libero et efficitur fermentum. ' ||
 'Phasellus sapien diam, commodo eget odio in, tristique viverra nibh.', 20.00, 'ml'),

('Ice', 'Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut lacinia urna ante, ac pulvinar tortor maximus eu. ' ||
  'Mauris consequat justo.', 3, 'cube'),

('Lemon', 'Lorem ipsum dolor sit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. ' ||
'Nulla sit amet libero ipsum. Donec tincidunt tincidunt diam, a commodo massa aliquam a. Nullam arcu sapien, ' ||
 'placerat auctor ex feugiat, viverra ullamcorper nisi. Nam imperdiet.',
 2, 'piece');




-- INSERT INTO
--     drink_ingredients(drinks_id, ingredients_id)
-- VALUES
--     (1, 1),
--     (1, 3),
--     (1, 5),
--     (4, 2),
--     (4, 3),
--     (4, 5),
--     (4, 6);

INSERT INTO
opinions(content, nickname, rate, drink_id)
    VALUES
        ('Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec nec tempus nibh. Aliquam quis tempus orci, sed volutpat tortor. ' ||
            'Nullam volutpat libero ac sagittis auctor. Sed rutrum quis elit eget placerat. Class aptent taciti sociosqu', 'XYZ', 4, 2 ),
        ('Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam dictum consequat eros.', 'Rudy', 7,3),
        ('Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer gravida eu tellus quis commodo. Curabitur fermentum gravida leo.', 'Ila', 5, 4),
        ('Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam placerat orci vitae eros maximus egestas quis bibendum quam. Donec semper.', 'Ziuum', 2, 1);


