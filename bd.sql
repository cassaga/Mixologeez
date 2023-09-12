CREATE DATABASE `mixologeez` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `COCKTAIL` (
  `cocktail_id` int NOT NULL AUTO_INCREMENT,
  `cocktail_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `cocktail_image` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `cocktail_description` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `cocktail_instruction` json NOT NULL,
  `tag_1` int DEFAULT NULL,
  `tag_2` int DEFAULT NULL,
  `tag_3` int DEFAULT NULL,
  `country` int NOT NULL,
  PRIMARY KEY (`cocktail_id`),
  KEY `COCKTAIL_FK` (`country`),
  KEY `COCKTAIL_FK_1` (`tag_1`),
  KEY `COCKTAIL_FK_2` (`tag_2`),
  KEY `COCKTAIL_FK_3` (`tag_3`),
  CONSTRAINT `COCKTAIL_FK` FOREIGN KEY (`country`) REFERENCES `COUNTRY` (`country_id`),
  CONSTRAINT `COCKTAIL_FK_1` FOREIGN KEY (`tag_1`) REFERENCES `TAG` (`tag_id`),
  CONSTRAINT `COCKTAIL_FK_2` FOREIGN KEY (`tag_2`) REFERENCES `TAG` (`tag_id`),
  CONSTRAINT `COCKTAIL_FK_3` FOREIGN KEY (`tag_3`) REFERENCES `TAG` (`tag_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `COUNTRY` (
  `country_id` int NOT NULL AUTO_INCREMENT,
  `country_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `country_coordinates` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`country_id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `TAG` (
  `tag_id` int NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
