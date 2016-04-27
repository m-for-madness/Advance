INSERT INTO `Person` (`id`,`name`,`email`,`password`) VALUES (1,"Bernard Peterson","fringilla.Donec@interdumliberodui.org","posuere"),(2,"Logan Dawson","mi.pede.nonummy@Maurisvelturpis.ca","ut");
INSERT INTO `Role` (`name`)VALUES("ADMIN"),("USER"),("KESHA"),("JA"),("SLAVIK"),("IGOR");
INSERT INTO `person_role`(`person_id`,`role_id`)VALUES(1,2),(1,4),(2,1),(2,3);