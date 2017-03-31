-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema addressdb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema addressdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `addressdb` DEFAULT CHARACTER SET utf8 ;
USE `addressdb` ;

-- -----------------------------------------------------
-- Table `addressdb`.`countries`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`countries` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `addressdb`.`regions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`regions` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `country_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `country_id_fk_idx` (`country_id` ASC),
  CONSTRAINT `country_id_fk`
    FOREIGN KEY (`country_id`)
    REFERENCES `addressdb`.`countries` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `addressdb`.`populated_area_types`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`populated_area_types` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `addressdb`.`populated_areas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`populated_areas` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `type_id` INT(11) NOT NULL,
  `region_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `type_id_fk_idx` (`type_id` ASC),
  INDEX `region_id_fk_idx` (`region_id` ASC),
  CONSTRAINT `region_id_fk`
    FOREIGN KEY (`region_id`)
    REFERENCES `addressdb`.`regions` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `type_id_fk`
    FOREIGN KEY (`type_id`)
    REFERENCES `addressdb`.`populated_area_types` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `addressdb`.`municipalities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`municipalities` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `postal_code` VARCHAR(45) NOT NULL,
  `populated_area_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `populated_are_id_fk_idx` (`populated_area_id` ASC),
  CONSTRAINT `populated_are_id_fk`
    FOREIGN KEY (`populated_area_id`)
    REFERENCES `addressdb`.`populated_areas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `addressdb`.`streets`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`streets` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `municipality_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `municipality_id_fk_idx` (`municipality_id` ASC),
  CONSTRAINT `municipality_id_fk`
    FOREIGN KEY (`municipality_id`)
    REFERENCES `addressdb`.`municipalities` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `addressdb`.`addresses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`addresses` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `street_id` INT(11) NOT NULL,
  `number` INT(11) NOT NULL,
  `apartmentNo` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `street_id_fk_idx` (`street_id` ASC),
  CONSTRAINT `street_id_fk`
    FOREIGN KEY (`street_id`)
    REFERENCES `addressdb`.`streets` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
