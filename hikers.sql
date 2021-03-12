DROP DATABASE IF EXISTS hikers;
CREATE DATABASE hikers;

USE hikers;

-- 用户表 --
CREATE TABLE `user`
(
	`accountnum` INT(8) PRIMARY KEY,
	`nickname` VARCHAR(20) NOT NULL,
	`school` VARCHAR(20) ,
	`password` VARCHAR(20) NOT NULL,
	`integral` INT NOT NULL DEFAULT 0,
	`grade` ENUM('B','S','G','P','D','C') NOT NULL DEFAULT 'B',
	`win` INT  DEFAULT 0,
	`match` INT DEFAULT 0
);

-- 战绩表 --
CREATE TABLE `record`
(
	`redsquare` INT(8) NOT NULL,
	`bluesquare` INT(8) NOT NULL,
	`battletime` DATETIME NOT NULL,
	`manual` TEXT NOT NULL,
	`winner` ENUM('R','B','RE','BE') NOT NULL,
	PRIMARY KEY(`redsquare`,`bluesquare`,`battletime`),
	FOREIGN KEY(`redsquare`) REFERENCES `user`(`accountnum`) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY(`bluesquare`) REFERENCES `user`(`accountnum`) ON UPDATE CASCADE ON DELETE CASCADE
);

-- 好友关系表--
CREATE TABLE `relation`
(
	`owner` INT(8) NOT NULL,
	`friend` INT(8) NOT NULL,
	PRIMARY KEY(`owner`,`friend`),
	FOREIGN KEY(`owner`) REFERENCES `user`(`accountnum`) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY(`friend`) REFERENCES `user`(`accountnum`) ON UPDATE CASCADE ON DELETE CASCADE
);

-- 消息内容表--
CREATE TABLE `content`
(
	`contentID` INT NOT NULL AUTO_INCREMENT,
	`message` TEXT NOT NULL ,
	`createtime` datetime NOT NULL,
	`type` VARCHAR(10) NOT NULL,
	PRIMARY KEY(`contentID`)
);

-- 消息索引表-- 
CREATE TABLE `MsgIndex`
(
	`owner` INT(8) NOT NULL,
	`friend` INT(8) NOT NULL,
	`contentID` INT NOT NULL,
	`receive` TINYINT(1) NOT NULL,
	`unread` TINYINT(1) NOT NULL,
	PRIMARY KEY(`owner`,`friend`,`contentID`),
	FOREIGN KEY(`owner`) REFERENCES `user`(`accountnum`) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY(`friend`) REFERENCES `user`(`accountnum`) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY(`contentID`) REFERENCES `content`(`contentID`) ON UPDATE CASCADE ON DELETE CASCADE
);

-- 好友验证表--
CREATE TABLE `verification`
(
	`sendID` INT(8) NOT NULL,
	`receiveID` INT(8) NOT NULL,
	PRIMARY KEY(`sendID`,`receiveID`),
	FOREIGN KEY(`sendID`) REFERENCES `user`(`accountnum`) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY(`receiveID`) REFERENCES `user`(`accountnum`) ON UPDATE CASCADE ON DELETE CASCADE
);

-- 触发器-- 
delimiter $$
drop trigger if exists  grade_after_update $$
create trigger `hikers`.`grade_after_update`
 before update  
 on `user` for each row
 begin  
 if (new.`integral`<200 and new.`integral`>=0) 
 then     
		set new.`grade`=('B');
 elseif(new.`integral`<400 and new.`integral`>=200)
 then     
		set new.`grade`=('S');
 elseif(new.`integral`<600 and new.`integral`>=400)
 then     
		set new.`grade`=('G');
 elseif(new.`integral`<800 and new.`integral`>=400)
 then     
		set new.`grade`=('P');
 elseif(new.`integral`<1000 and new.`integral`>=800)
 then     
		set new.`grade`=('D');
 elseif(new.`integral`>=1000)
 then     
		set new.`grade`=('C');
 else 
 signal sqlstate '45000' set message_text ='错误！积分不能为负数！' ;   
end if; 
end$$
delimiter ;

